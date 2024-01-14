package collections

fun main() {

    /*
    Criando um array no kotlin, um array de length 5 e com dados do tipo String

    apenas com um print(array) serão mostradas as características do array, para exibir seus elementos podemos utilizar
    Arrays.toString(aqui dentro o nome do array) que é um método do java.util ou utilizar nomeDoArray.contentToString()
    que é uma abordagem kotlin
     */
    val array = Array(5) {""}
    array[0] = "A"
    array[4] = "E"
    println(array.contentToString())
    println(array[0])

    /*
    Outra forma de contruir um array é com o arrayOf(), dessa forma não é necessário definir explicitamente o tamanho
    do array, isso pode ser definido de forma implicita apenas colocando o conteúdo do array.
    No exemplo abaixo o array possui 4 posições
     */
    val array2 = arrayOf("*", "*", "*", "*")

    /*
    Arrays com valores nulos, um array de Strings por exemplo que recebe um valor null seu tipo se torna <String?>.

    É possível criar um array de apenas de valores nulos com o arrayOfNulls(), porém nesse caso você deve passar o
    tamanho do array dentro dos parênteses e o tipo de dado que o array vai receber.

    É possível criar arrays com os tipos primitivos utilizando o nome do tipo como arrayOf, exemplo intArrayOf()
     */
    val array3 = arrayOf("*", "*", null, "*")
    val array4 = arrayOfNulls<String>(10)
    val array5 = intArrayOf(1, 10, 9)

    /*
    Iterando sobre elementos de um array

    Nesse exemplo para printar a superfície de cada um dos Circulos no array podemos utilizar 3 formas, a mais usual
    é com o forEach
     */
    val circles = arrayOf(Circle(1.0), Circle(3.0), Circle(6.0))

//    repeat(circles.size) {
//        val circle = circles[it]
//        val surface = circle.surface()
//        println(surface)
//    }
//
//    for (i in circles.indices) {
//        val circle = circles[i]
//        val surface = circle.surface()
//        println(surface)
//    }

    circles.forEach {println(it.surface())}


    /*
    varargs e spread (*)

    Agora que values de sum pode receber n valores é possível chamar sum() com quantos valores Int desejar, para passar
    um array como parâmetro para values de sum não podemos passar apenas o nome do array diretamente, é necessario passar
    o array com spread (*nomeDoArray), assim ele vai passar cada um dos dados do array como um parâmetro
     */
    println(sum(1, 19, 45, 30))

    val array6 = intArrayOf(1, 19, 45, 30, 90)
    println(sum(*array6))

}

/*
Iterando sobre elementos de um array
 */
class Circle(val radius: Double) {
    fun surface() = Math.PI * radius * radius
}

/*
varargs
Utilizando o vararga a variável values pode receber n parâmetros, se tornando um array
 */
fun sum(vararg values: Int): Int {
    var sum = 0
    values.forEach {sum += it}
    return sum
}