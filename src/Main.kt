import kotlin.math.sqrt

// Класс Точка
data class Point(val x: Double, val y: Double)

// Функция для вычисления расстояния между двумя точками
fun distance(p1: Point, p2: Point): Double {
    return sqrt((p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y))
}

// Функция для безопасного ввода координат
fun getDoubleInput(prompt: String): Double {
    while (true) {
        print(prompt)
        val input = readLine()
        try {
            return input?.toDouble() ?: throw IllegalArgumentException("Некорректный ввод")
        } catch (e: NumberFormatException) {
            println("Ошибка: введите числовое значение.")
        } catch (e: IllegalArgumentException) {
            println(e.message)
        }
    }
}

fun main() {
    // Ввод координат первой точки
    println("Введите координаты первой точки:")
    val x1 = getDoubleInput("x1: ")
    val y1 = getDoubleInput("y1: ")
    val point1 = Point(x1, y1)

    // Ввод координат второй точки
    println("Введите координаты второй точки:")
    val x2 = getDoubleInput("x2: ")
    val y2 = getDoubleInput("y2: ")
    val point2 = Point(x2, y2)

    // Вычисление и вывод расстояния между точками
    val result = distance(point1, point2)
    println("Расстояние между точками: $result")
}