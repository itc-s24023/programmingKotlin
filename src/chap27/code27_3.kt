package chap27

class Ferrari(color: String) : Car(color)

fun main(){
    val car = Ferrari(color = "赤")
    car.drive(5.0)
    car.drive(10.0)
}