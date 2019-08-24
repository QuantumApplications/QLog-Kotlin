package qa.quantum.qlog

actual class QLog {
    actual fun checkMe() = 7
}

actual object Platform {
    actual val name: String = "Native"
}