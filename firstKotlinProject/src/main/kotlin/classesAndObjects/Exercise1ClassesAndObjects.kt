package classesAndObjects

/*
    Exercício

    Crie a classe CharGenerator, capaz de gerar aleatoriamente um caractere dentro de um intervalo fornecido no
    momento da criação do objeto
 */

fun main() {
    val charG = CharGenerator('a', 'z')
    println(charG.char())
}