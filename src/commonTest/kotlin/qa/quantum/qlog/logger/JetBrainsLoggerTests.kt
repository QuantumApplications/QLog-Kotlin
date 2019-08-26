package qa.quantum.qlog.logger

import kotlin.test.Test

class JetBrainsLoggerTests {

    @Test
    fun testDoLog() {
        // 1. Arrange
        val date : Long = 1546300800
        val file = "Directory/File.dat"
        val function = "Function"
        val line = 0
        val logLevel = LogLevel.ERROR
        val text = "Text"
        val logEntry = LogEntry(date, file, function, line, logLevel, text)
        val jetBrainsLogger = JetBrainsLogger()

        // 2. Action
        jetBrainsLogger.doLog(logEntry)
    }

}