package exceptions

fun main() {

    val account = BankAccount()

    /*
    Tratamento de exceção

    Quando um método chama algo que pode ter uma exceção, é possível criar um código alternativo para se encontrar uma
    exceção com try, catch

    try tenta chamar o método, se der certo ele executa o código normalmente porém se for encontrada uma exceção o bloco
    catch é chamado

    A exceção é um objeto no catch recuperamos esse objeto e ele fica referenciado no parâmetro do catch

    Já que a exceção foi tratada o fluxo do código segue normalmente

    É possível ter N blocos catch para um try

    É possível após o bloco catch criar um bloco finally, esse é um bloco que não recebe parâmetros e sempre será
    executado independente se ocorreram exceções ou não, mesmo que ocorra uma exceção que não foi tratada
     */
    try {
        account.deposit(500.00)
        account.withdraw(400.00)
    } catch(e: InvalidValueException) {
        println("Falha na operação ${e.message}")
    } catch(e: InsufficientFundsException) {
        println("Falha na operação ${e.message}")
    } finally {
        println(account.balance)
    }

    /*
    Como as exceções herdam de RuntimeException, é possível criar um catch que captura exceções do tipo RuntimeException
    que vai pegar qualquer tipo de exceção que herda de RuntimeException

    Usar esse catch quando quer pegar vários tipos de exceções de um tipo
     */
    try {
        account.deposit(500.00)
        account.withdraw(500.00)
    } catch(e: RuntimeException) {
        println("Falha na operação ${e.message}")
    }
    println(account.balance)

    // IllegalArgumentException com require()
    val studentGrades = StudentGrades().add(7.0).add(8.0).add(9.5).average()
    println(studentGrades)

    // Retornando um valor com try catch
    //print("> ")
    //val value = readln()

//    val converted = try {
//        value.toInt()
//    } catch(e: NumberFormatException) {
//        0
//    }
//    println(converted)

    // Retornando um valor a partir de um throw

    // Essa variável é do tipo nothing porque o programa nunca chegará nesse código já que sempre será uma exceção
    //val x = throw IllegalArgumentException()

    val i: Int? = null
    // Essa variável não é do tipo nothing porque a exceção só será lançada se seu conteúdo for nulo
    val d = i?.toDouble() ?: throw IllegalArgumentException()
    println(d)
}




/*
    Lançando exeções com throws (para a operação criando um exceção)
 */
class BankAccount {
    var balance: Double = 0.0
        private set

    fun deposit(value: Double) {
        if (value < 0) {
            /*
            Uma Exception pode receber uma mensagem, uma cause ou uma cause e uma mensagem
            essa Exception para o método deposit e volta para quem o chamou
             */
            //throw Exception("O valor depositado não pode ser negativo")
            /*
            Lançando uma exceção de uma classe de exceção criada
             */
            throw InvalidValueException(value)
        }
        balance += value
    }

    fun withdraw(value: Double) {
        if (value < 0) {
            throw InvalidValueException(value)
        }

        if (balance - value < 0) {
            throw InsufficientFundsException(balance)
        }
        balance -= value
    }
}

// IllegalArgumentException com require()
class StudentGrades {
    private var sum: Double = 0.0
    private var numberOfGrades: Int = 0

    /*
    Declarar que o método add retorna um StudentGrades e o return this faz com que o método retorne uma referência para
    o próprio objeto fazendo que você possa encadear chamadas ao método
     */
    fun add(grade: Double): StudentGrades {
        /*
        IllegalArgumentException é um tipo de exceção utilizado para validação, significa que um parâmetro passado
        possui um valor inválido, ela pode ser feita com um throw
        if (grade !in 0.0..10.0) {
            throw IllegalArgumentException("Nota inválida")
        }
        Mas uma forma simplificada é utilizar o método require(), o método require verifica o parâmetro passado com base
        na condição informada e lança uma IllegalArgumentException caso o valor seja inválido
        para passar uma mensagem personalizada no require basta utilizar {}
         */
        require(grade in 0.0..10.0) {"A nota deve estar entre 0 e 10"}

        sum += grade
        numberOfGrades++
        return this
    }

    fun average(): Double {
        return sum / numberOfGrades
    }
}