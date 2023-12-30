package properties

fun main() {

    val r1 = Retangle(10, 5)
    //r1.width = 15
    //r1.width = -10
    println(r1.width)
    println(r1.surface)

    // Aqui inicia a parte sobre initialization blocks
    val s1 = Square(10)
    val s2 = Square(5)
}

class Retangle(width: Int, height: Int) {

    var width: Int = width
        /*
        get e set => get recupera o valor da propriedade e set recebe um valor como parâmetro e define um novo valor
        para propriedade
         */
        get() {
            /*
            toda propriedade tem um back field (local na memória onde o valor da propriedade fica armazenado),
            acessamos o field da propriedade com o get e o set
            */
            println("Getter chamado")
            return field
        }
        set(value) {
            /*
            Quando é chamado o set de uma propriedade ele coloca o valor passado no back field
            /
            Podemos fazer tratativas em um setter personalizado como verificar se o valor que está sendo inserido é
            valido
             */
            println("Setter chamado")
            if (value >= 0) {
                field = value
            }
        }

    /*
    Colocando um private no set de uma propriedade seu valor não pode ser modificado externamente porém externamente
    ainda será possivel chamar o get
     */
    var height: Int = height
        private set

    /*
    Criando uma propriedade que retorna a área do retângulo no get de forma simplificada
     */
    val surface get() = width * height
}

// Inicialization blocks
class Square(val size: Int) {

    // O init é criado sempre que uma instância é criada (ideal para fazer validações)
    init {
        println("Init square")

        // require é um booleano que se não for atendido para a aplicação
        require(size > 0)
    }
}