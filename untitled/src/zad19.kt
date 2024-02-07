fun main(){
    try {
        val k = readln().toInt()
        val digit1 = k % 10
        val digit2 = (k / 10) % 10
        val digit3 = k / 100
        val reversedNumber = digit1*100+digit2*10+digit3
        println(reversedNumber)
    }
    catch (e: Exception){
        println("Выввели неверное значение")
    }
}