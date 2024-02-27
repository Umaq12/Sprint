package day3
fun main(){
    val myBook =  Book()
    println(myBook.title)
    println(myBook.author)
    println(myBook.yearPublished)
    val customBook = Book("123","123","11221")
    println(customBook.title)
    println(customBook.author)
    println(customBook.yearPublished)
}

