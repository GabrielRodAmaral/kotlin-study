package oriObjAdvanced

fun main() {

    /*
    Extension functions

    É comum criar um arquivo para colocar todas as extension functions, um arquivo top level

    kotlinlang.org/docs/operator-overloading.html#in-operator => todos os nomes de funções para sobrecarregar operadores
    e operadores que podem ser sobrecarregados
     */
    val l = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    println(l.sumEvenNumbers())

    val s = "Hello World!"
    println(s.hide())

    /*
    Sobrecarga de operadores

    Permitir que o kotlin execute operações em objetos que a principio não seria possivel
     */
    val p1 = Point(5, 10)
    val p2 = Point(20, 15)
    val p3 = p1 + p2
    val p4 = p1 - p2
    val p5 = p1 * 2
    println(p3)
    println(p4)
    println(p5)

}

// Função normal
//fun sumEvenNumbers(list: List<Int>): Int {
//    return list.filter {it % 2 == 0}.sum()
//}

/*
Extension function
Criando uma extension function dessa forma não é necessário passar a lista como parâmetro e a forma de chamara essa
função fica simplificada sendo apenas nomeDaLista.sumEvenNumbers() e pode ser chamada para qualquer List<Int>
 */
fun List<Int>.sumEvenNumbers(): Int {
    return this.filter {it % 2 == 0}.sum()
}

// Uma extension function para Strings
fun String.hide(): String {
    return "".padEnd(this.length, '*')
}

data class Point(val x: Int, val y: Int) {

    /*
    Para sobrecarregar o operador de soma o nome do método deve ser plus e na frente da função colocar o modificador
    operator
     */
    operator fun plus(other: Point): Point {
        return Point(x = x + other.x, y = y + other.y)
    }

    operator fun minus(other: Point): Point {
        return Point(x = x - other.x, y = y - other.y)
    }

    operator fun times(multiplier: Int): Point {
        return Point(x = x * multiplier, y = y * multiplier)
    }
}