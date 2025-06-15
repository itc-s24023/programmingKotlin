package chap39

fun main() {
    val list = listOf("あ", "い", "う", "え", "お")
    val action = fun(x: String) {
        println(x)
    }
    list.forEach(action)

    list.forEach {
        println(it)
    }
    // for文の場合
    for (it in list) {
        println(it)
    }
}
