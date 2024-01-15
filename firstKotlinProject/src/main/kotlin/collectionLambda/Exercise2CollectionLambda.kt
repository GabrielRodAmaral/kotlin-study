package collectionLambda

/*
    Exercício

    Com base em um mapa que mapeia um nome de produto ao seu preço, encontre as respostas para as seguintes perguntas:
    1) Qual o maior preço?
    2) Qual o produto com o preço mais baixo?
    3) Qual a lista de produtos cujo preço é menor do que $5?
 */

fun main() {
    val productsPrice = mapOf(
            "Playstation 5" to 3500.00,
            "Xbox series s" to 3000.00,
            "Nintendo switch" to 2500.00,
            "Opala 6cc" to 15000.00,
            "Fandangos" to 2.50,
            "Bolacha" to 1.50

    )

    val expensive = productsPrice.maxOf {it.value}
    println("O produto mais caro custa R$$expensive")

    val cheaper = productsPrice.minBy {it.value}
    println("O produto com o menor preço é o ${cheaper.key} e custa ${cheaper.value}")

    val cheapList = productsPrice.filter {it.value < 5}.keys.forEach {println(it)}
}