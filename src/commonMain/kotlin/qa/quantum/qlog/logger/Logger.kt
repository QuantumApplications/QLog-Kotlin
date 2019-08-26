package qa.quantum.qlog.logger

/**
Logger abstract class
 */
abstract class Logger(private val logLevel: LogLevel) {

    /**
    Log function to implement
    - parameter logEntry: The log entry
     */
    abstract fun doLog(logEntry: LogEntry)

    /**
    Log function to use.
    Only logs if log level is reached.
    - parameter logEntry: The log entry
     */
    fun log(logEntry: LogEntry) {
        if (logEntry.logLevel.level <= this.logLevel.level) {
            this.doLog(logEntry)
        }
    }

}