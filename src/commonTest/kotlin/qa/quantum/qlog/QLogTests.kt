package qa.quantum.qlog

import kotlin.test.Test
import kotlin.test.assertTrue

class QLogTests {
    @Test
    fun testMe() {
        assertTrue(QLog().checkMe() > 0)
    }
}