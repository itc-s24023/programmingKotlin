package chap23

fun main(){
    val p1 = Person()
    p1.name = "タケシ"
    p1.age = 5
    p1.greet()

    val p2 = Person()
    p2.name = "のび太"
    p2.age = 10
    p2.greet()

    val p3 = Person()
    p3.name = "スネ夫"
    p3.age = 12
    p3.greet()
}
class Person{
    var name: String = ""
    var age: Int = 0
    fun greet(){
        println("こんにちは、私の名前は${name}です。年齢は${age}歳です")
    }
}