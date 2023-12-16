package decision

// explicando if
fun ifStructure() {

    val temp = 25

    if (temp > 22) {
        println("Está calor")
    }

    // Quando não te, chaves ele identifica a próxima linha como parte do if
    if (temp <= 22)
        println("Está frio")
}

// explicando if else
fun ifElse() {

    val temp: Double = 19.9

    if (temp > 23) {
        println("Está calor")
    } else if (temp >20) {
        println("Está agradavél")
    } else {
        println("Está frio")
    }
}

// If retornando valores para uma variável
fun ifReturn() {

    val n = 11

    // a última expressão é retornada e entra na variável
    // Para fazer um if com retorno assim sempre tem que ter uma resposta logo não funcionaria
    // sem o else
    // boa prática, sempre fazer com que o if e o else retornem algo do mesmo tipo
    val r = if (n % 2 == 0) {
        "PAR"
    } else {
        "ÍMPAR"
    }

    println(r)
}

// Explicando when
fun whenStructure() {
    // Estrutura similar ao switch em java

    val x = 20

    when (x) {
        10 -> println("É 10")
        20 -> println("É 20")
        30 -> println("É 30")
        else -> println("Desconhecido")
    }

    // intervalo com range
    when (x) {
        in 0..10 -> println("0 a 10")
        in 11..30 -> println("11 a 30")
        else -> println("OUTRO INTERVALO")
    }

    // Mais de uma opção no mesmo case
    when (x) {
        0, 2, 4, 6 -> println("PAR")
        else -> println("DESCONHECIDO")
    }

    // When sem variável
    when {
        //também posso criar um bloco {} onde está o println e executar mais comandos
        x >= 0 -> println("POSITIVO")
        x < 0 -> println("NEGATIVO")
        else -> println("INVÁLIDO")
    }

    // When retornando valores
    val s = when {
        x >= 0 -> "POSITIVO"
        x < 0 -> "NEGATIVO"
        else -> "INVÁLIDO"
    }
    println(s)

    // Como retorna um valor também posso colocar dentro de um print
    println(when {
        x >= 0 -> "POSITIVO"
        x < 0 -> "NEGATIVO"
        else -> "INVÁLIDO"
    })
}