package exceptions

/*
    Exercício

    Crie uma classe Rect para representar um retângulo. O retângulo deve receber dois valores de lado quando for criado,
    e os lados não podem ser 0 ou com valor negativo. Nestes casos, uma IllegalArgumentException deve ser lançada.
 */

fun main() {
    val rectangle = Rect(10, 0)
}

class Rect(val height: Int, val width: Int) {
    init {
        require(height > 0) {"A altura do retângulo deve ser maior que 0"}
        require(width > 0) {"A largura do retângulo deve ser maior que 0"}
    }
}