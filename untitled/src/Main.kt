//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    try {
        val a = readln().toInt()
        val q = readln().toInt()

        val k = readln().toInt()
        val p = readln().toInt()

        var sum = 0
        var term = a

        for (i in 1..p) {
            if (i >= k) {
                sum += term
            }
            term *= q
        }
        println("Сумма членов геометрической прогрессии от номера $k до $p: $sum")
    }
    catch (e: Exception){
        println("Выввели неверное значение")
    }
}