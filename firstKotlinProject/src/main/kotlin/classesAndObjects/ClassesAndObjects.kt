package classesAndObjects

// Objetos são as instâncias das classes

// Um exemplo é, você pode criar uma classe chamada account e criar vários objetos dessa classe, cada um representando
// a conta de um cliente

fun main() {
    // Account é a classe que foi criada (A classe vira um tipo)
    val account: Account = Account()   // Inicializando a classe, também é possivel fazer sem declarar o tipo Account
                                       // graças a inferência de tipos do kotlin

    // Agora posso usar a account para manipular meu objeto
    //account.balance = 100.0
    //println(account.balance)

    // Posso criar várias variáveis com o tipo Account e cada uma vai manipular um objeto diferente
    val account2 = Account()
    //account2.balance = 1_000_000.00 // O underscore não influencia no número, apenas para fácil visualização

    //println("${account.balance}, ${account2.balance}")

    account.deposit(2500.50)
    account2.deposit(1000.00)
    //println("${account.balance}, ${account2.balance}")

//  Agora que a conta possui owner e number, esses parâmetros devem ser passados na criação do objeto
    val account3 = Account("1234-1", "Gabriel")
    val account4 = Account("4321-1", "Maria")

    account3.deposit(2500.50)
    account4.deposit(1000.00)

    account4.print()
    account4.print()

//  Criando uma conta com o constructor que já define o balance
    val account5 = Account("1324-2", "Amaral", 350.80)

//  Chamando o deposit com int
    account5.deposit(200)

    account5.print()

//  Chamando companion object criado na class Math
    println(Math.sum(10, 20))

//  Chamando métodos e propriedades do objeto
    println(Math2.subtract(20, 10))
    println(Math2.pi)
}

//  Declarando um objeto com métodos (assim não é necessario criar uma instância para chamar os métodos do object)
object Math2 {

    val pi = 3.14

    fun subtract(n1: Int, n2: Int) = n1 - n2

    fun sum(n1: Int, n2: Int) = n1 + n2
}