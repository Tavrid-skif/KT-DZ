fun divide(a: Double, b: Double): Double {
    if (b == 0.0) {
        throw ArithmeticException("Деление на ноль недопустимо!")
    }
    return a / b
}

fun main() {
    try {
        val result = divide(10.0, 0.0)  // Проверка деления на ноль
        println("Результат деления: $result")
    } catch (e: ArithmeticException) {
        println(e.message)
    }
}
