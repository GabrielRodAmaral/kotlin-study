package polimorphism

fun main() {
    // Forma de criar uma Account utilizando uma classe anônima para definir o first e last name da interface Nameable
    val acc1: Account = Account(object: Nameable {
        override val firstName = "Gabriel"
        override val lastName = "Amaral"
    })

    acc1.deposit(2500.00)
    acc1.print()

    // Forma de criar uma Account sem utilizar classe anônima, criando uma classe que implementa Nameable
    // melhor quando uma Account será criada várias vezes
    val acc2: Account = Account(PersonName("Gabriel", "Rodrigues"))
    acc2.deposit(3000.00)
    acc2.print()

}

class Account(val owner: Nameable): Printable {
    private var balance: Double = 0.0

    fun deposit(value: Double) {
        balance += value
    }

    override fun print() {
        println("A saldo da conta de ${owner.fullName} é R$$balance")
    }
}

interface Nameable {
    val firstName: String
    val lastName: String

    // Não se pode iniciar uma propriedade em uma interface porém é possivel definir um getter
    val fullName: String
        get() = "$firstName $lastName"
}

interface Printable {
    fun print()
}

class PersonName(override val firstName: String, override val lastName: String): Nameable