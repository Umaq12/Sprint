package day4

fun main() {
    val Sarah = BankAccount("Sarah", 0.0)
    Sarah.deposit(100.0)
    Sarah.withdraw(10.0)
    Sarah.deposit(300.0)
    Sarah.displayHistory()
    Sarah.accountBalance()
}