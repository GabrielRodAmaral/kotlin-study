package classesAndObjects

// Companion objects (Objeto que acompanha a classe), a forma de chamar um companion object é chamando-o direto pela
// classe, nesse ex: Math.sum(a, b), ele não pode lidar com parâmetros passados no constructor da classe
class Math {
    companion object{
        fun sum(a: Int, b: Int) = a + b
    }
}