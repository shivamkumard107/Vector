package com.haroldadmin.vector.loggers

import android.util.Log
import com.haroldadmin.vector.Vector

/**
 * An implementation of [Logger] which writes out to the standard Android Log.
 *
 * Logs are only written if logging is enabled.
 */
internal class AndroidLogger : Logger {

    override val tag: String = "Vector"

    override fun log(message: String) {
        if (Vector.enableLogging) {
            Log.d(tag, message)
        }
    }
}

/**
 * A utility function to create instances of [AndroidLogger]
 */
fun androidLogger(): Logger = AndroidLogger()