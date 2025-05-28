package chap18

import kotlin.random.Random
import kotlin.random.nextInt
import kotlin.system.measureTimeMillis

fun main() {
    val targetSet = mutableSetOf<Int>()
    for (x in 1..10000) {
        // 0から1億までの範囲で、10000件分の乱数を生成する
        targetSet += Random.nextInt(0..100_000_000)
    }
    // targetSet と内容が同じ MutableList を作る
    val targetList = targetSet.toMutableList()

    val listTime = measureTimeMillis {
        for (x in 0..100_000_0) {
            // 0から1億まで、リスト内に存在するかチェック
            val result = targetList.contains(x)
        }
    }
    println("MutableList の検索時間: $listTime ミリ秒")

    val setTime = measureTimeMillis {
        for (x in 0..100_000_0) {
            // 0から1億まで、セット内に存在するかチェック
            val result = targetSet.contains(x)
        }
    }
    println("MutableSet の検索時間: $setTime ミリ秒")
}