package chap13

fun main() {
    // 1x1=1  1x2=2
    // 2x1=2  2x2=4
    for (x in 1..9) {
        for (y in 1..9) {
//            print("${x}x${y}=${x * y}  ")
            print("%dx%d=%2d  ".format(x, y, x * y))
        }
        println()
    }
}