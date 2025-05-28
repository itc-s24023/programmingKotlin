package exam01

/**
 * 映画館の入場料を計算するプログラム
 * シニア　一般　子供の順で人数を入力して
 * 一人あたりの料金は　シニア: 1300円 一般: 2000円 子供: 1000円
 * ただし10名以上の場合は、各200円割引
 */
fun main(){
    println("シニアの人数を入力してください")
    val x = readln().toInt()
    println("一般の人数を入力してください")
    val y = readln().toInt()
    println("子供の人数を入力してください")
    val z = readln().toInt()
    val totalpeople = x + y + z

    val xryoukin = 1300
    val yryoukin = 1300
    val zryoukin = 1300

    if (totalpeople < 10) {
        xryoukin - 200
        yryoukin - 200
        zryoukin - 200
    }

    val total = x * xryoukin + y * yryoukin + z * zryoukin
    println("合計金額は" + total + "です")

}