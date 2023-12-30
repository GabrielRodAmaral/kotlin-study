package Inheritance

/*
    Por padrão todas as classes herdam de Any, a forma de deixar explicito de onde uma classe vai herdar é ex:
    class Animal : Any() {},

    todos os métodos da classe Any são herdados pela classe Animal

    Uma classe não pode herdar de mais de uma classe ao mesmo tempo

    para uma classe poder ser herdada você deve colocar open em sua declaração

    Nesse exemplo onde Dog e Cat herdam de Animal você pode criar as propriedades que os dois possuem em Animal como cor
    por exemplo e as propriedades que são específicas de cada criar em sua própria classe

    A classe Animal é uma superclasse e a classe Dog é uma subclasse

    Colocando a superclasse Animal como abstract não será possivel instanciar um Animal diretamente, apenas será
    possível instanciar subclasses de Animal, nesse caso isso faz sentido porque não tem lógica instanciar um
    Animal desconhecido, apenas faz sentido instanciar um cat ou um dog
    Quando uma classe é abstract não é necessário usar o open
 */
open abstract class Animal(val color: String) {

    fun eat(food: String = "Ração") {
        println("Comendo $food")
    }

    /*
    As classes que herdam de Animal não podem utilizar métodos privados de Animal
     */
    private fun sleep() {
        println("Dormindo")
    }

    /*
    Declarando um método como protected apenas a superclasse e as subclasses podem utiliza-lo, não é aberto publicamente
    o método sleep1 só poderá ser utilizado por subclasses de Animal
     */
    protected fun sleep1() {
        println("Dormindo")
    }
}

// Como a classe Animal precisa receber o parâmetro color, as classes que herdam dela precisam passar esse parâmetro
class Dog(color: String) : Animal(color) {

    fun bark() {
        println("Au Au")
    }
}

class Cat(color: String) : Animal(color) {

    fun meow() {
        println("Meow Meow")
    }
}