package collectionLambda

fun main() {

    val people = Person.data()

    /*
    Filter, recebe uma expressão lambda e cria uma nova lista excluindo ou preservando os itens da lista utilizando
    um true or false com base na expressão passada, no caso abaixo people2 é uma cópia de people com exceção do Gustavo
    que não atende a condição
     */
    val people2 = people.filter {it.age >= 18}
    //println(people2)

    // Forma de chegar nesse resultado com encadeamento de operações
//    Person
//            .data()
//            .filter {it.age >= 18}
//            .forEachIndexed() {i, p -> println("${i + 1} => $p")}

    /*
    .map(), recebe como parâmetro um elemento e gera uma nova lista com os elementos mapeados dos objetos, por exemplo
    criar uma lista apenas com os nomes das pessoas mapeados
     */
//    Person
//            .data()
//            .map {it.name}
//            .forEach {println(it)}

    /*
    sorted() e distinct(), distinct() remove os elementos duplicados e cria uma nova lista com os elementos distintos
    sorted() ordena a lista
    sortedBy {} você pode passar como a lista deve ser ordenada, como ordenar pelo nome de pessoas por exemplo
    sortedWith {} você pode utilizar um comparator
     */
//    Person
//            .data()
//            .map {it.age}
//            .distinct()
//            .sorted()
//            .forEach {println(it)}

    /*
    shuffled(), random() e take()

    shuffled() embaralha os itens da lista

    take() retorna uma lista com a quantidade de elementos passada, pegando do início

    .random() retorna um elemento aleatório da lista, randomOrNull() retorna null se não encontrar nenhum elemento na lista
     */
//    Person
//            .data()
//            .map {it.name}
//            .shuffled()
//            .take(3)
//            .forEach {println(it)}

    /*
    count() conta a quantidade de elementos na lista
    exemplo usando filter e count para contar as pessoas que o nome começa com uma determinada letra
    segundo exemplo, count pode receber uma condição para contar os elementos, fazendo o papel do filter nesse caso
     */
//    val count = Person
//            .data()
//            .filter {it.name.uppercase().startsWith("G")}
//            .count()

    val count = Person
            .data()
            .count {it.name.uppercase().startsWith("G")}
    //println(count)

    /*
    sumOf() soma todos os elementos de uma lista com base na expressão lambda passada
     */
    val sum = Person
            .data()
            .filter {it.name.uppercase().startsWith("G")}
            .sumOf {it.age}
    //println(sum)

    /*
    reduce() acumula os elementos passados na expressão um por um até o fim da lista, funciona em alguns casos como um
    sum, vai incrementando o acumulador até chegar ao resultado final
     */
    val reduced = Person
            .data()
            .map {it.age}
            .reduce {acc, age -> acc + age}
    //println(reduced)

    /*
    maxBy(), maxOf(), minBy()e minOf()
    maxBy() pega o maior com base em uma condição porém só retorna um valor mesmo que tenham outros equivalentes
    maxBy e minBy retornam o elemento inteiro com a condição
    maxOf e minOf retorna o valor
     */
    val maxName = Person
            .data()
            .maxBy {it.name}
    //println(maxName)

    val maxName2 = Person
            .data()
            .maxOf {it.name}
    //println(maxName2)

    /*
    find(), first(), e firstOrNull()

    find() possui um funcionamento parecido com filter, porém enquanto filter retorna N resultados, find retorna apenas
    um, se não encontrar um valor associado a condição da lambda retorna null

    first() possui o mesmo comportamento do find() porém não retorna null, caso o elemento não seja encontrado ele
    retorna uma exceção

    firstOrNull() possui o comportamento do first porém podendo receber null, então na prática funciona igual o find()
     */
    // Nesse exemplo o objetivo é retornar a idade da pessoa encontrada, então é possivel chamar a idade dela com ?
    // porque o resultado pode ser null se a pessoa não for encontrada e usei o elvis operator para retornar 0 se a
    // pessoa não for encontrada
    val findEx = Person
            .data()
            .find {it.name == "Gabriel"}
            ?.age
            ?: 0
    //println(findEx)

    /*
    any(), all() e none()

    any() retorna um booleano se existe algum item na lista que cumpre a condição passada na lambda

    all() retorna true se todos os itens atenderem a condição

    none() retorna true se nenhum elemento atender a condição
     */
    val anyEx = Person
            .data()
            .any {it.age == 21}
    //println(anyEx)

    /*
    joinToString() retorna os elementos de uma lista como string, separando os elementos por virgula, é possivel passar
    uma expressão lambda e informar o que deve ser passado para string, como por exemplo apenas o nome e também é
    possível colocar em parenteses o separator que vai separar as Strings
     */
//    val joinToStringEx = Person
//            .data()
//            .joinToString(separator = "_") { it.name }
//    println(joinToStringEx)

    /*
    associate() recebe um elemento e retorna um Pair, criando um conjunto map
     */
//    val associateEx = Person
//            .data()
//            .associate {p -> Pair(p.name, p.age)}
//            .forEach {(n, p) -> println("$n => $p")}

    /*
    associateBy() não é necessário criar o Pair, passa a chave e ele define que o value é o próprio objeto
     */
//    val associateByEx = Person
//            .data()
//            .associateBy { it.hashCode() }
//            .forEach {println(it)}

    /*
    groupBy() agrupa no map pela condição passada na lambda (it.name[0] agrupa pela primeira letra no nome), é possível
    passar um segundo valor para passar apenas uma propriedade do objeto
     */
//    Person
//            .data()
//            .groupBy ({it.name[0]}, {it.name})
//            .forEach {(k, p) -> println("$k => $p")}

    /*
    groupingBy() agrupa no map e retona a quantidade de itens que foram agrupados eachCount transforma os valores
    associados ao grouping em uma contagem deles
     */
//    Person
//            .data()
//            .groupingBy {it.name[0]}
//            .eachCount()
//            .forEach {(k, p) -> println("$k => $p")}
}

data class Person(val name: String, val age: Int) {
    companion object {
        fun data(): List<Person> {
            return listOf(
                    Person("Pedro", 25),
                    Person("Manoel", 30),
                    Person("Gustavo", 10),
                    Person("Maria", 32),
                    Person("Ricardo", 53),
                    Person("Joana", 49),
                    Person("Gabriel", 21),
                    Person("Amaral", 22),
            )
        }
    }
}