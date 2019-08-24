package qa.quantum.qlog

import kotlin.test.Test
import kotlin.test.assertTrue

class QLogTestsJVM {
    @Test
    fun testHello() {
        assertTrue("JVM" in hello())
    }
}