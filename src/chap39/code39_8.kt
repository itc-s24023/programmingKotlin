package chap39

import kotlin.random.Random

fun main() {
    // 関数(ラムダ式)以外のパラメータと、ラムダ式を同時に渡すときの Kotlin 的な書き方
    randomNumberCalculate(6) {
        it * 2
    }
    randomNumberCalculate(100) {
        val square = it * it
        val cubic = square * it
        cubic
    }
}

// ↑のような書き方をするためには、関数型のパラメータは最後に指定しなければならない
fun randomNumberCalculate(max: Int, calculator:(Int) -> Int) {
    val targetNumber = Random.nextInt(max + 1)
    val result = calculator(targetNumber)
    println("計算結果: $result")
}