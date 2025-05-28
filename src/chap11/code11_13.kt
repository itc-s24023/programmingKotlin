package chap11

import kotlin.random.Random

fun main() {
    val score = Random.nextInt(0, 100)

    // if式 + Range で実装してください
    // borderC = 60, borderB = 70, borderA = 80,
    // borderS = 90, 最小値0 最大値100
    // score が  0～borderC未満 なら D
    //          borderC～borderB なら C
    //          borderB～borderA なら B
    //          borderA～borderS なら A
    //          borderS～100     なら S
    // 判定結果を judge という変数に代入して
    // 最後に出力
    val borderC = 60
    val borderB = 70
    val borderA = 80
    val borderS = 90

    val judge = if (score in 0..<borderC) {
        "D"
    } else if (score in borderC..<borderB) {
        "C"
    } else if (score in borderB..<borderA) {
        "B"
    } else if (score in borderA..<borderS) {
        "A"
    } else {
        "S"
    }
    println("$score の判定結果: $judge")
}