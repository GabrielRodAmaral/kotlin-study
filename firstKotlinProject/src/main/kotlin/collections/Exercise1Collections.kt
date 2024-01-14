package collections

/*
    Exercício

    Crie uma lista de cidades que você visitou hipoteticamente nos ultimos meses (a lista pode conter cidades repetidas).
    Crie um algoritmo que conta quantas cidades diferentes você visitou (isto é, excluindo cidades duplicadas).
 */

fun main() {

    val cities = listOf("Diadema", "São Bernardo", "São Paulo", "São Caetano", "São Paulo")

    val uniqueCities = cities.toSet()

    println(uniqueCities.size)
}