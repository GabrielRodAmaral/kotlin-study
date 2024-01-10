package polimorphism

/*
    Exercício

    Crie uma classe Worker para representar um trabalhador que possui um salário base. um Worker tem um método pay(),
    que retorna o valor total a ser pago pelo seu salário.

    Para calcular o valor total do salário, é preciso multiplicar o salário base por um multiplicador, o qual depende
    do tipo de trabalhador. Se for um, trabalhador que ganha por hora, o multiplicador é o número de horas trabalhadas;
    se for um trabalhador freelancer, o salário já é acordado de antemão.
 */

var totalPay: Double = 0.0
fun main() {

    val h1: HourlyWorker = HourlyWorker(18.50, 220)
    val f1: FreeLaWorker = FreeLaWorker(3500.00)

    payWorker(h1)
    payWorker(f1)

    println(totalPay)
}

fun payWorker(worker: Worker) {
    totalPay += worker.pay()
}

abstract class Worker(val salary: Double) {

    fun pay(): Double {
        return salary * multiplier()
    }

    abstract fun multiplier(): Double
}

class HourlyWorker(salary: Double, val worked: Int): Worker(salary) {

    override fun multiplier(): Double {
        return (worked.toDouble())
    }
}

class FreeLaWorker(salary: Double): Worker(salary) {

    override fun multiplier(): Double {
        return 1.0
    }
}