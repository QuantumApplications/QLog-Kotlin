package qa.quantum.qlog.logger

expect fun dateString(timestamp: Long): String

expect fun fileName(file: String): String

/**
The log entry to be used for logging
 */
data class LogEntry(
    val date: Long,
    val file: String,
    val function: String,
    val line: Int,
    val logLevel: LogLevel,
    val text: String
) {

    /**
    The meta data of a log entry containing date, file, line and function
     */
    val metaText: String get() = "${dateString(this.date)}: ${fileName(this.file)}:${this.line} ${this.function}: "

}
