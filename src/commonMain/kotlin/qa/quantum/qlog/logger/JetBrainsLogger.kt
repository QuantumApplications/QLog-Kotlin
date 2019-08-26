package qa.quantum.qlog.logger

/**
Associates an ansi color with each log level
 */

private val LogLevel.ansiColor: String
    get() = when (this) {
        LogLevel.HIGHLIGHT -> "35m"
        LogLevel.DEBUG -> "34m"
        LogLevel.INFO -> "32m"
        LogLevel.WARNING -> "33m"
        LogLevel.ERROR -> "31m"
    }

private val LogLevel.ansiColorSequence get() = "${escape}[${this.ansiColor}"

private val escape get() = "\u001b"

/**
Logger to log into JetBrains console.
 */
class JetBrainsLogger(logLevel: LogLevel = LogLevel.HIGHLIGHT) : Logger(logLevel) {

    companion object {
        private const val ansiTextColor = "37m"
        private const val escape = "\u001b"
        private const val ansiBold = "1m"
        private const val ansiReset = "0m"
        private const val ansiBoldSequence = "$escape[$ansiBold"
        private const val ansiResetSequence = "$escape[$ansiReset"
        private const val ansiTextSequence = "$escape[$ansiTextColor"
    }

    override fun doLog(logEntry: LogEntry) {
        println("$ansiBoldSequence$ansiTextSequence${logEntry.metaText}$ansiBoldSequence${logEntry.logLevel.ansiColorSequence}${logEntry.text}$ansiResetSequence")
    }

}