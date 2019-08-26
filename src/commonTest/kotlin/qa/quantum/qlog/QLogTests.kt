package qa.quantum.qlog

import qa.quantum.qlog.logger.JetBrainsLogger
import kotlin.test.Test

class QLogTests {

    @Test
    fun testQLogHighlight() {
        // 1. Arrange
        QLog.loggers = mutableListOf(JetBrainsLogger())

        // 2. Action
        QLogHighlight("Highlight")
    }

    @Test
    fun testQLogDebug() {
        // 1. Arrange
        QLog.loggers = mutableListOf(JetBrainsLogger())

        // 2. Action
        QLogDebug("Debug")
    }

    @Test
    fun testQLogInfo() {
        // 1. Arrange
        QLog.loggers = mutableListOf(JetBrainsLogger())

        // 2. Action
        QLogInfo("Info")
    }

    @Test
    fun testQLogWarning() {
        // 1. Arrange
        QLog.loggers = mutableListOf(JetBrainsLogger())

        // 2. Action
        QLogWarning("Warning")
    }

    @Test
    fun testQLogError() {
        // 1. Arrange
        QLog.loggers = mutableListOf(JetBrainsLogger())

        // 2. Action
        QLogError("Error")
    }

}