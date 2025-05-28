package chap28

import java.awt.Color

class Prius(color: String) : Car(color) {
    override fun drive(distance: Double) {
        println("${color}のプリウスが走っています")
        println("すごい静かですね")
        println("${distance}キロです")
        println("${color}<UNK>")
    }
}