package chap28

class Ferrari(color: String) : Car(color) {
    override fun drive(d: Double) {
        distance += d
        println("${color}のフェラーリが走っています！ブおおおーん！")
        println("おおかっこいい！！！")
        println("マイレージは${distance}キロになったぜい！")
    }
}