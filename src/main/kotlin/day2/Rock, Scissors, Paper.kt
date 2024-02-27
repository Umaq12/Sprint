package day2

fun main() {
    var x = readln().toString()
    val y = (1..3).random()
    val user = when (x) {
        "Rock" -> 1
        "Paper" -> 2
        "Scissors" -> 3
        else -> {}
    }
    val winner = when {
        (user == y) -> "Tie"
        (user == 1) && (y == 3) -> "Player"
        (user == 2) && (y == 1) -> "Player"
        (user == 3) && (y == 2) -> "Player"
        else -> "Computer"
    }
    if (winner == "Player") {
        println("U win")
    } else if (winner == "Computer") {
        println("U lose")
    } else {
        println("It's tie")
    }

}