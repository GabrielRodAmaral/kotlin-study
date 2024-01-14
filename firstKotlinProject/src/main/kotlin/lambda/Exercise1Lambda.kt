package lambda

/*
    Exercício

    Implemente uma função que imprime informações na tela entre duas linhas que contém asteriscos (***********). O
    conteúdo impresso deve ser computado atráves de uma expressão lambda.
 */

fun main() {
    console() {"Uma frase a ser printada"}
}

fun console(content: () -> Any) {
    println("**********************")
    println(content())
    println("**********************")
}