package nullable

// Explicando variáveis nulas
fun nullableVariables() {

    // Para criar uma variável nula o tipo deve ser nullable
    // O ? indica que a variável é int mas ela pode receber um valor nulo
    var n: Int? = 10
    n = 20
    n = 35
    n = null

    // Não é possivel inserir nulo nessa variável declarada com inferência de tipo
    // o tipo deve ser declarado e com ? (ex: var x: Int? = 10)
    // var x = 10
    // x = null
}

// Safe calls com nullable tipes e smart cast
fun safeCallsNull() {

    val s1: String? = "abcde"
//    val s1: String? = null

    // Se você fizer uma verificação manual o smart cast permite que as chamadas para essa variável dentro do if
    // não tenham o tratamento para se a variável for nula
    if (s1 != null) {
        println(s1)

        val s2 = s1.toUpperCase()
        println(s2)

        val s3 = s2.reversed()
        println(s3)

        val l = s2.length
        println(l)
    }

    // para chamar um comando utilizando a variável nullable você deve usar ?. invés de .
    // O kotlin faz isso para evitar um erro em execução caso a variável seja nula
//    println(s1)
//    val s2 = s1?.toUpperCase()
//    println(s2)
//
//    val s3 = s2?.reversed()
//    println(s3)
//
//    val l = s2?.length
//    println(l)
}

// elvis operator
fun elvisOperator() {

    val value: Int? = null

    // Dessa forma a value2 não é tipo Int? e sim tipo Int, porque o valor atribuido a ela nunca será nulo
    // val value2 = if (value != null) value else 0

    // Esse é o elvis operator, faz a mesma verificação que a feita acima porém de uma forma muito mais limpa e
    // simplificada
    val value2 = value ?: 0
    println(value2)
}

// Not null assertion operator
fun nNassertionOperator() {

    // deve ser evitado!

    // com o !!. você assume a responsabilidade que a variável nunca será nula e anula toda null safety
    // caso seja um null você irá receber um erro na execução, por isso o not null assertion operator deve ser evitado
    val s = "abcd"
    val i = s!!.reversed()

    println(i)
}