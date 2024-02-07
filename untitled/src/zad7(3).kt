import kotlin.math.*

fun main(){
    try {
        val z = readln().toDouble()
        val y = readln().toDouble()
        val x = readln().toDouble()

        val a = (2*cos(x-(PI/6)))/(1/2+sin(y).pow(2))
        val b = 1+(z.pow(2))/(3+z.pow(2)/5)
        println("a = $a, b = $b")
    }
    catch (e: Exception){
        println("Выввели неверное значение")
    }
}