@file:Suppress("FunctionName")

package qa.quantum.qlog

import qa.quantum.qlog.logger.LogEntry
import qa.quantum.qlog.logger.LogLevel
import java.util.*

actual fun <T> QLogHighlight(loggedObject: T) {
    log(loggedObject, LogLevel.HIGHLIGHT)
}

actual fun <T> QLogDebug(loggedObject: T) {
    log(loggedObject, LogLevel.DEBUG)
}

actual fun <T> QLogInfo(loggedObject: T) {
    log(loggedObject, LogLevel.INFO)
}

actual fun <T> QLogWarning(loggedObject: T) {
    log(loggedObject, LogLevel.WARNING)
}

actual fun <T> QLogError(loggedObject: T) {
    log(loggedObject, LogLevel.ERROR)
}

fun <T> log(loggedObject: T, logLevel: LogLevel) {
    val stackTrace = Thread.currentThread().stackTrace[3]
    QLog.log(
        LogEntry(
            Date().time / 1000,
            stackTrace.fileName ?: "",
            stackTrace.methodName,
            stackTrace.lineNumber,
            logLevel,
            loggedObject.toString()
        )
    )
}