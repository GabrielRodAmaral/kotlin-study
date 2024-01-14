package lambda

import kotlin.random.Random
import kotlin.random.nextInt

fun main() {

    val r1 = sum(10, 5)
    println(r1)

    /*
    É possível atribuir uma função a uma variável, para fazer isso a função não pode receber um nome (deve ser anônima)
     */
    val f1 = fun (a: Int, b: Int): Int {
        return a + b
    }
    println(f1)

    // Chamando uma função que estpa armazenada em uma variável, com invoke e sem, o mais comum é não usar o invoke
    val r2 = f1.invoke(10, 10)
    println(r2)
    val r3 = f1(10, 10)
    println(r3)

    /*
    Uma expressão lambda é uma forma de definir uma função em uma variável com uma sintaxe mais concisa e direta

    A expressão lambda retorna o último valor que faz parte do corpo da expressão
     */
    val f2 = {a: Int, b: Int -> a + b}
    val r4 = f2(15, 10)
    println(r4)

    /*
    Exemplo de expressão Lambda 1, uma expressão que printa o dobro do valor passado como parâmetro e retorna esse valor
     */
    val f3: (Int) -> Int = {n: Int ->
        val d = n * 2
        println(d)
        d
    }
    f3(3)

    /*
    Exemplo de expressão Lambda 2, uma expressão que informa se um número é par ou não

    n % 2 == 0 já vai retornar true or false então é uma forma mais concisa de resolver esse problema sem utilizar um if
    else
     */
    val f4: (Int) -> Boolean = {n: Int -> n % 2 == 0}
    println(f4(5))

    /*
    Se você declara que a função recebe um int e retorna um Boolean por exemplo você pode omitir isso no parâmetro
    então temos 3 formas de declarar a mesma expressão
    val f4: (Int) -> Boolean = {n: Int -> n % 2 == 0}
    val f4 = {n: Int -> n % 2 == 0} essa é a forma mais comum
    val f4: (Int) -> Boolean = {n -> n % 2 == 0}
     */

    /*
    Passando uma expressão Lambda como parâmetro

    Nesse exemplo podemos mudar a lógica da função alterando a expressão lambda passada

    Uma boa prática quando o último parâmetro é uma expressão Lambda é passar esse parâmetro fora dos parenteses isso é
    chamado de trailling lambdas
     */
    val r5 = transformAndConvert("$", "|", 100, {v -> v * v})
    println(r5)
    val r6 = transformAndConvert("$", "|", 100) {v -> v * -v}
    println(r6)

    /*
    Criando um high-order function que retorna uma expressão lambda que gera um número aleatório dentro do intervalo passado
    */
    val g1 = newGenerator(0, 10)
    println(g1())

    /*
    Usando o parâmetro it em uma lambda

    Quando a expressão lambda recebe um parâmetro automaticamente ele recebe o nome it representando o parâmetro passado
     */
    val f5: (Int) -> Int = {it * 2}
    println(f5(2))

    /*
    Usando o repeat com uma expressão lambda
     */
    repeat(10) {
        println("i = ${it}")
    }

    /*
    String.filter() e String.filterIndexed()
     */
    val string = "dbasBDSKJBFAOIJjbdfskfb23678kbjhgv432"

    // Com esse filter restarão apenas os números
    val string2 = string.filter {it.isDigit()}
    println(string2)

    // Com esse filter você possui 2 parâmetros e passara a posição em que cada digito foi encontrado
    val string3 = string.filterIndexed {i, c ->
        val digit = c.isDigit()
        if (digit) {
            println("Digito $digit encontrado na posição $i")
        }
        digit
    }
    //println(string3)

    /*
    Require() recebe uma expressão lambda, a mensagem do require é uma lambda que retorna any, então é possivel colocar
    qualquer coisa
     */
    val x = 10
    require(x > 0) {"Qualquer coisa"}
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

/*
high order function, é uma função que utiliza outras funções (expressões Lambda)

Passando uma expressão Lambda como parâmetro

Nesse caso t receberá uma expressão lamda com a lógica para conversão
 */
fun transformAndConvert(prefix: String, suffix: String, value: Int, t: (Int) -> Int): String {
    val transformed = t(value)
    return "$prefix$transformed$suffix"
}

/*
Criando um high-order function que retorna uma expressão lambda que gera um número aleatório dentro do intervalo passado
 */
fun newGenerator(min: Int, max: Int): () -> Int {
    return {Random.nextInt(min..max)}
}