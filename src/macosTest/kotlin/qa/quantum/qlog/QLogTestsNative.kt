package qa.quantum.qlog

import kotlin.test.Test
import kotlin.test.assertTrue

class QLogTestsNative {
    @Test
    fun testHello() {
        assertTrue("Native" in hello())
    }
}