package collections

/*
    Exercício

    Crie um mapa que mapeia códigos telefônicos aos seus países associados. A partir deste mapa, gere uma lista mutável
    que contém os países associados a estes códigos ordenados em ordem alfabética decrescente.
 */

fun main() {
    val telephoneCodes = mapOf(
            55 to "Brasil",
            86 to "China",
            61 to "Austrália"
    )

    val countries = telephoneCodes.values.toSortedSet(Comparator.reverseOrder()).toMutableList()
    println(countries)
}