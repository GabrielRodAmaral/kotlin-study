package functions

// A main é a primeira função executada no código

fun main() {
    sayHello()
    sayHello()

    helloX("Gabriel")
    helloX("Amaral")

    helloTemp(26, "Gabriel")

    val result = calculate(15, 13)
    println(result)

//    dando nome aos parâmetros na hora que a função será chamada faz com que você possa passar
//    os parâmetros fora da ordem da função
    println(namePar(exp = 3, base = 2.5))

    hiMessage("Gabriel")

    println(multiply(3, 2))
}

// Função simples
fun sayHello() {
    println("Hello Kotlin!")
}

// Por padrão todas as funções no kotlin são públicas e você pode utilizalas em outros arquivos

// Criando função privada que só pode ser utilizada no arquivo que foi criada
private fun helloWorld() {
    println("Hello world")
}

// Funções com parâmetros
private fun helloX(name: String) {
    println("Hello $name, how are you?")
}

// Funções com múltiplos parâmetros
private fun helloTemp(temp: Int, name: String) {
    println("Hello $name, Temperature is $temp degrees.")
}

// Função retornando valores
private fun calculate(n1: Int, n2: Int): Int {
    return n1 + n2
}

// Dando nome aos parâmetros (dando nome aos parâmetros na hora que a função será chamada faz com que você possa passar
// os parâmetros fora da ordem da função)
// É uma boa dar nome aos parâmetros na chamada da função quando uma função recebe muitos parâmetros
private fun namePar(base: Double, exp: Int): Double {
    var result = base

    for (i in 2..exp) {
        result *= base
    }

    return result
}

// Definindo valores padrão para parâmetros de funções
// Dessa forma caso o parâmetro message não for passado na chamada da função ele será uma string vazia
private fun hiMessage(name: String, message: String = "") {
    println("Hi $name, $message")
}

// Tipos de retorno unit e nothing

// Essa função não está fazendo nada então o seu retorno é Unit por padrão, mesmo sem declarar o Unit da forma feita
// abaixo se você armazenar o resultado dela em uma variável será armazenado kotlin.unit
private fun nothing(): Unit {

}

// Dessa forma abaixo a função irá retornar nothing, significa que você não deve esperar nenhum retorno dela
// private fun nothingReturn(): Nothing {}

// Um exemplo de um método que retorna Nothing é o TODO(), basicamente é um método que serve para indicar que uma
// parte do código ainda não foi finalizada/implementada, ele retona um erro falando que algo ainda não foi implementado

// Usando uma função como uma expressão
// Como essa função só executa essa expressão você pode declarar ela dessa forma sem um bloco e sem escrever return e
// ela retornará o valor da expressão
private fun multiply(n1: Int, n2: Int) = n1 * n2;