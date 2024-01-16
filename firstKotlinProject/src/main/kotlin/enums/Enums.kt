package enums

import enums.Month.MAIO
import jdk.dynalink.Operation
import java.util.function.BinaryOperator
import java.util.function.IntBinaryOperator

fun main() {

    /*
    Enums -> tipos de dados onde você pode definir quais valores poderão ser utilizados, em uma variável do tipo Month
    só podemos utilizar valores que estão declarados na classe enum

    Com a classe enum Month criada podemos criar uma variável com um dos meses de Month declarando
    val month: Month = Month.MAIO ou então importar o mês da classe e utilizalo da forma abaixo

    É possível criar propriedades associadas aos elementos no contrutor do enum como um número para cada mês no exemplo

    .name converte o nome do enum para uma string
    .ordinal mostra a posição do elemento dentro da classe enum, iniciando da posição 0

    podemos criar métodos no enum e companion objects

    .valueOf() encontra um enum por uma string que represente o seu nome

    usar entries invés de .value(), boa prática

    um enum pode implementar uma interface
     */
    val month: Month = MAIO
    println(month.numberOfMonth)
    println(month.name)

    val nextMonth = month.next().next()
    println(nextMonth)

    val month10 = Month.getEnumByNumber(10)
    println(month10)

    val monthMay = Month.valueOf("MAIO")
    println(monthMay)
    println(monthMay.getTotalDays())

    // chamando métodos do enum Operation
    println(Operations.PLUS.apply(10, 20))
    println(Operations.MINUS.apply(10, 20))

}

enum class Month(val numberOfMonth: Int) {
    JANEIRO(1),
    FEVEREIRO(2),
    MARÇO(3),
    ABRIL(4),
    MAIO(5),
    JUNHO(6),
    JULHO(7),
    AGOSTO(8),
    SETEMBRO(9),
    OUTUBRO(10),
    NOVEMBRO(11),
    DEZEMBRO(12);

    /*
    entries cria um array com todos os elementos do enum
    elvis operator para que se o mês for depois de dezembro invés de retornar null já que não existe um mês 13, retornar
    JANEIRO
     */
    fun next(): Month {
        return entries.find {it.numberOfMonth == numberOfMonth + 1} ?: Month.JANEIRO
    }

    // pegar total de dias com when (switch)
    fun getTotalDays(): Int {
        return when (this) {
            JANEIRO, MARÇO, MAIO, JULHO, AGOSTO, OUTUBRO, DEZEMBRO -> 31
            FEVEREIRO -> 28
            else -> 30
        }
    }

    // Criando um método que será chamado diretamente na classe do enum (ex: recuperar enum com base no número do mês)
    companion object {
        fun getEnumByNumber(numberOfMonth: Int): Month {
            return entries
                    .first {it.numberOfMonth == numberOfMonth}
        }
    }
}

/*
Criando métodos abstratos em um enum, temos que criar a implementação do método abstrato em cada enum

IntBynaryOperator é uma interface do java com um método que recebe 2 inteiros e retorna um inteiro

BinaryOperator<tipo> define o método apply, recebe 2 valores do mesmo tipo e retorna um do mesmo tipo
 */
enum class Operations: BinaryOperator<Int>, IntBinaryOperator {
    PLUS {
         override fun apply(n1: Int, n2: Int): Int {
             return n1 + n2
         }
         },
    MINUS {
        override fun apply(n1: Int, n2: Int): Int {
            return n1 - n2
        }
    };

    abstract override fun apply(n1: Int, n2: Int): Int

    override fun applyAsInt(left: Int, right: Int): Int {
        return apply(left, right)
    }
}