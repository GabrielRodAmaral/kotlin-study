package collections

fun main() {

    /*
    Map é uma coleção de pares, as informações possuem first e second, possui dois tipos, uma pras chaves e um para os
    valores

    Para acessar elementos no map pode-se usar o get com a chave ou fazer como um array [chave], retorna null se o valor
    não existir

    Pode-se criar um mutable map com mutableMapOf() ou utilizar o .toMutableMap()

    É possível inserir um novo Pair em um mutable map com por exemplo map[4] = "D", se a chave 4 existir ele substituira
    seu valor, se não existir ele irá criar uma nova

    É possível utilizar no map elementos do set, como por exemplo hashMapOf(), sortedMapOf()
     */
//    forma menos usada
//    mapOf(
//            Pair(1, "A"),
//            Pair(2, "B")
//    )

//    Forma mais usual
    val map1 = mapOf(
            1 to "A",
            2 to "B",
            3 to "C"
    )
    println(map1)

    println(map1.get(2))
    println(map1[4])

    val map2 = map1.toMutableMap()
    map2[4] = "D"
    println(map2[4])

//    Iterando elementos de um map
//    map2.forEach {
//        println("${it.key} ==> ${it.value}")
//    }

//    Também é possível passar 2 parâmetros para representarem a chave e o valor na expressão lambda
    map2.forEach {(k, v) ->
        println("$k ==> $v")
    }

//    Existem também formas de fazer o forEach com apenas as chaves ou com apenas os valores
    map2.keys.forEach {
        print("$it ")
    }
    println()
    map2.values.forEach {
        print("$it ")
    }
}