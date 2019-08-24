package qa.quantum.qlog

actual class QLog {
    actual fun checkMe() = 42
}

actual object Platform {
    actual val name: String = "JVM"
}