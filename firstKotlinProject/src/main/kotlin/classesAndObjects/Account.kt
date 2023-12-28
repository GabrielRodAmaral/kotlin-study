package classesAndObjects

//  Passando parâmetros para na construção da class
/*  Você pode deixar o constructor primário como privado (colocando private constructor na frente do Account abaixo)
    nesse caso um objeto só poderia ser definido usando os constructors publicos dentro da classe, o construtor primário
    só poderia ser chamado por outros dentro da classe
 */
class Account(val accountNumber: String, val accountOwner: String) {

//  Criando um atributo (uma variável dentro de uma classe) (no kotlin chamamos mais de property)
//  Todos os parâmetros devem ser inicializados na criação
//  Definindo o balance como private apenas métodos dentro da classe podem acessar o balance, por padrão o kotlin
//  define os métodos como public (qualquer um pode acessar o atributo)
    private var balance: Double = 0.0

//  Criando mais construtores para mesma classe
//  Com os construtores você pode criar várias formas de definir um objeto da classe dependendo da forma que você o
//  declara
//  Dessa forma você pode chamar a classe sem passar parâmetros e o constructor vai definir o accountNumber e o
//  accountOwner como strings vazias, o constructor pode realizar uma ação {} ou não
    constructor() : this(accountNumber = "", accountOwner = "") {
        println("constructor() foi chamado")
    }

//   Criando outro construtor para definir um balance
    constructor(accountNumber: String, accountOwner: String, balance: Double) : this(accountNumber, accountOwner) {
        println("Chamado o constructor que define o balance da conta em sua criação")
        this.balance = balance
    }

//  Criando métodos (funções em uma classe)
    fun deposit(amount: Double) {
        balance += amount
    }

//  Sobrecarregando (overloading) métodos de uma classe
//  posso criar métodos com o mesmo nome porém que recebem parâmetros diferentes
fun deposit(amount: Int) {
    balance += amount
}
//  Dessa forma eu criei dois deposit porém um recebe Double e o outro recebe Int, quando eu chamar a deposit o método
//  acionado vai depender do parâmetro que eu passo (Double ou Int)


    fun print() {
        println("Number: $accountNumber, Owner: $accountOwner, Balance: $balance")
    }
}