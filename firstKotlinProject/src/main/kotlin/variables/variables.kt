package variables

import java.util.*

/*
    Declaração de variáveis

    //var counter: Int
    //counter = 10

    //var counter: Int = 10

    //var counter = 10
    /*Essa var assume Int, o tipo nao pode ser mudado*/

    //val counter2 = 10
    /*Val cria uma constante*/
    */

    // Variáveis em blocos
    // Sempre que eu defino uma variável dentro de um bloco ela existe apenas naquele bloco
    // Se você define uma variável no do em um do while é possivel usala como condição no while

    /*
    Tipos de dados inteiros:
    Byte: 1 byte - 8 bits
    Short: 2 bytes - 16 bits
    (*=> Int: 4 bytes - 32 bits
    *=> Long: 8 bytes - 64 bits) => mais utilizados
     */

    /*
    val i1 = 10L
    Colocando esse L no final a inferência de tipos assume que é um long invés de um int que é o padrão
     */

    /*
    Tipos de dados decimais:
    Float: 4 bytes - 32 bits
    Double: 8 bytes - 64 bits

    val d1 = 14.5
    - Assume double por padrão

    val f1 = 14.5F
    - Colocando esse F no final a inferência de tipos assume que é um float invés de um double que é o padrão
     */

    /*
    Mudando tipo de variáveis númericas

    val i1 = 10
    ela é int
    val d1 = i1.toDouble()
    println(d1)
*/

//Assim se muda o tipo de uma variável, cuidado com isso
fun tradingtypevariables() {
    val i1 = 32
    val d1 = i1.toDouble()
    println(d1)

    val l1 = i1.toLong()
    println(l1)

    val d2 = 10.34
    val l2 = d2.toInt()
    println(l2)
//Isso é um exemplo que você perde informações do número fazendo isso, nesse caso só será exibido 10

    val i3 = 2000
    val b1 = i3.toByte()
    println(b1)
//Fazer isso retorna o número -48, um byte não suporta o número 2000 então ele da esse problema
}

//Função dados númericos sem sinal (-)
fun nosignalorvaluevariables() {
    /*
    Byte -> UByte
    Short -> UShort
    Int -> UInt
    Long -> ULong
     */

    val x = 100U
    val y = 100UL

    // isso pode
    val x2 = x.toInt()
    val y2 = y.toDouble()

    // isso não pode, vai retornar um valor inconsistente
    val x3 = -20
    val x4 = x3.toUInt()
    print(x4)

    // unsigned não é muito usado mas existe
}

// Variáveis booleanas
fun booleanvariables() {
    val b1: Boolean = true
    val b2 = false
    println(b1)
    println(b2)
}

// Variáveis char
fun charvariables() {
    // o char não pode ser declarado com aspas duplas
    val c: Char = 'A'
    println(c)

    println(c.code)
    // o .code faz o char exibir o código do caracter na tabela ask

    val i = 65
    val c2 = i.toChar()
    println(c2)
    // O c2 virou a letra A porque é a letra representada por 65 na tabela ask

    //.inc() => Incrementa 1
    //.dec() = decrementa 1

    println(c2.isDigit())
    // retorna true se for um digito e false caso não

    println(c2.isUpperCase())
    // retorma true se for upper case e false caso não

    println(c2.isLowerCase())
    // retorma true se for lower case e false caso não

    val c3 = '1'
    println(c3.digitToInt())
    // Isso transforma o digito 1 no char em um inteiro, se não for um número da erro
}

// String no kotlin
fun stringvariables() {

    val s1: String = "Poke"
    val s2 = "alola"
    println(s2)

    // Concatenação
    // val s1s2 = s1+s2 essa forma não é muito usada

    // com interpolação,, o ${} é usado para expressoes e o $ para só um argumento
    val s1s2 = "Soma: '$s1 $s2' o tamanho é ${(s1 + s2).length}"
    println(s1s2)
}

// explicando string literals
fun stringliterals() {
    /*
    O rato $roeu
    a roupa do
    rei de "Roma"
     */

    val s1 = "O reto \$roeu\na roupa do\nrei de \"Roma\""

    println(s1)

    // Raw Strings => uma forma mais simplificada e usual
    val s2 = """
        O rato roeu
        s roupa do
        rei de "Roma"
    """.trimIndent()
    // O kotlin identifica os espaços vazios ao lado da raw string então o .trimIndent() arruma isso,
    // tudo fica alinhado com base na primeira linha então da pra usar isso ao meu favor
    println (s2)

    // .trimMargin() => identifica a margem a partir do pipe
    val s3 = """
        |  O rato roeu
        | a roupa
        |    do rei de roma
    """.trimMargin()
    println (s3)
}


/*
    const val => quando você declara uma val global o ideal é declarar como const val, isso irá te dar um ganho
    de performance porque ele vai declarar essa variável na fase de compilação sem necessidade de acessala em tempo
    de execução
 */


// Lidando com dados digitados pelo usuário
fun digitedkt() {
    // readln lê o dado inserido pelo usuário como uma string
    print("Digite o seu nome: ")
    val name = readln()

    println("Seu nome invertido é: ${name.reversed()}")

    // passando o readln para números inteiros
    print("> ")
    val n1 = readln().toInt()

    print("> ")
    val n2 = readln().toInt()

    println("Result: ${n1 + n2}")

    // Scanner
    // isso declara a instância do Scanner, (o in tem que ser entre crases porque é uma palavra reservada do kotlin)
    val scanner = Scanner(System.`in`)
    print("> ")
    val n3 = scanner.nextInt()
    // Tem metodos next para todos os tipos no scanner

    print("> ")
    val n4 = scanner.nextInt()

    println("Result: ${n3 + n4}")
}