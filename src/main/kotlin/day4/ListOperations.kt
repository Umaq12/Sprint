package day4

fun main() {
    var x = mutableListOf<String>("apple","banana","kiwi","peach","pineapple")
    println(x.joinToString(" "))
    x.add("plum")
    println(x.joinToString (" "))
    x.remove("apple")
    println(x.joinToString (" "))
    println(x.contains("kiwi"))
}