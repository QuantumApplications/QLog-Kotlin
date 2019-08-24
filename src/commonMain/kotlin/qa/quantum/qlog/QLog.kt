package qa.quantum.qlog

expect class QLog() {
    fun checkMe(): Int
}

expect object Platform {
    val name: String
}

fun hello(): String = "Hello from ${Platform.name}"