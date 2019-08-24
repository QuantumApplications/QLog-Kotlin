package qa.quantum.qlog

import kotlin.test.Test
import kotlin.test.assertTrue

class QLogTestsJS {
    @Test
    fun testHello() {
        assertTrue("JS" in hello())
    }
}