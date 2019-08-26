package qa.quantum.qlog.logger

import java.io.File
import java.text.SimpleDateFormat
import java.util.*

actual fun dateString(timestamp: Long): String {
    return SimpleDateFormat("HH:mm:ss").format(Date(timestamp * 1000))
}

actual fun fileName(file: String): String {
    return File(file).name
}