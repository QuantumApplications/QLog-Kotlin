@file:Suppress("FunctionName")

package qa.quantum.qlog

import qa.quantum.qlog.logger.LogEntry
import qa.quantum.qlog.logger.Logger

/**
Global static class to hold all log settings
 */
class QLog {

    companion object {

        var loggers = mutableListOf<Logger>()

        /**
        Logs a log entry to all attached loggers
        - parameter logEntry: The log entry
         */
        fun log(logEntry: LogEntry) {
            for (logger in this.loggers) {
                logger.log(logEntry)
            }
        }

    }

}

// Static error functions

expect fun <T> QLogHighlight(loggedObject: T)

expect fun <T> QLogDebug(loggedObject: T)

expect fun <T> QLogInfo(loggedObject: T)

expect fun <T> QLogWarning(loggedObject: T)

expect fun <T> QLogError(loggedObject: T)