package exam02

import kotlin.random.Random


class Dice(private val sides: Int) {

    init {
        require(sides >= 2) { "サイコロの面数は2以上でなければなりません。" }
    }

    fun roll(): Int {
        return Random.nextInt(1, sides + 1)
    }
}

fun main() {
    val dice6 = Dice(6)
    println("6面サイコロの出目: ${dice6.roll()}")

    val dice20 = Dice(20)
    println("20面サイコロの出目: ${dice20.roll()}")
}


/*
diceという名前でサイコロを表すクラスを定義してください
一般的な６麺サイコロ以外も対応したのでいくつまでの数を出せるか
コンストラクタでパラメータとして受け取れるようにしてください
 */