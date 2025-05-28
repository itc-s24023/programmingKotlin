package exam01

/**
 * キーボードから数字を入力して1,から入力された数までの
 * FizBuzzを出力します
 * 3の倍数のときにFizz
 * 5の倍数のときにBuzz
 * 3と5の倍数のときにFizzBuzz
 * それ以外のときは数字をそのまま出力する
 * */

fun main(){
    val x = readln().toInt()
    for (i in 1..x){
        val result = if (i % 15 == 0){
            "FizeBuzz"
        }else if(i % 5 == 0){
            "Buzz"
        }else if(i % 3 == 0) {
            "Fizz"
        }else {
            i.toString()
        }
        println(result)
    }
}
