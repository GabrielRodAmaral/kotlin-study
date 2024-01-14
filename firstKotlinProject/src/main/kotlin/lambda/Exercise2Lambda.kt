package lambda

/*
    Exercício

    Crie uma função chamada runIfTrue() que recebe um valor booleano e um código a ser executado caso o booleano seja
    verdadeiro (se ele for falso o código não será executado)

    A função runIfTrue() deve retornar o valor retornado pelo código executado, ou null caso o código não tenha sido
    executado
 */

fun main() {

    val test = runIfTrue(true) {println("O código foi executado")}
}

fun runIfTrue(v: Boolean, c: () -> Any?): Any? {
    return if (v) {
        c()
    } else {
        null
    }
}