package day3

fun main() {
    val x = readln().toInt()
    val y = readln().toInt()
    val add= { x: Int, y: Int -> x + y }
    println("The result of [num1] + [num2] is: ${add(x,y)}")
}
