package day2
fun main(){
    println("Enter your age as a whole number:")
    val age = readln().toInt()
    if (age in 18..39) {
        println("You can enter the club.")
    } else  {
        println("You cannot go into the club, please go home.")
    }
}