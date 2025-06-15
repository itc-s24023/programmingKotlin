package chap43

open class Car(val color: String) {
    protected var fuel = 50.0

    public fun drive() {
        if (fuel >= 0.0) {
            letEngineWork()
            println("${color}の車が走りました。")
        }else{
            println("ガス欠、走れません！")
        }
    }

   open protected fun letEngineWork() {
        println("ブルルルーン！")
        fuel -= 1.0
    }
}