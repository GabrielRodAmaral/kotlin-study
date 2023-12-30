package properties

/*
    Exercício

    Crie uma Account para representar uma conta bancária. Esta classe deve ter uma propriedade balance para armazenar
    o saldo da conta. Quando uma conta é criada, ela pode opcionalmente conter um saldo inicial, o qual não pode
    ser inferior a 0. Além disso, o saldo só pode ser alterado através do método deposit() e withdraw(), responsáveis
    pelos depósitos e saques na conta, respectivamente.
 */

fun main() {
    val c1 = Account(1000.50)
    c1.withdraw(230.35)
    c1.deposit(150.0)
    println(c1.balance)
}

class Account(balance: Double = 0.0) {

    var balance: Double = balance
        private set

    init {
        require(balance >= 0)
    }

    fun deposit(value: Double) {
        require(value >= 0)
        balance += value
    }

    fun withdraw(value: Double) {
        require(value >= 0)
        balance -= value
    }

}