fun convert(str: String): Int {
    return str.toIntOrNull() ?: throw NumberFormatException("Ошибка преобразования строки")
}

fun main() {
    try {
        val number = convert("123a")  // Некорректная строка
        println("Число: $number")
    } catch (e: NumberFormatException) {
        println(e.message)
    }
}
