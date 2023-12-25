package repeating

fun main() {
    // Aqui chamo uma função explicando while no kotlin
    whileStructure()

    // Aqui chamo uma função explicando do while no kotlin
    doWhile()

    // Aqui chamo uma função explicando for no kotlin com ranges
    // Explica também downTo, step, until
    forStructure()


    // Aqui chamo uma função explicando jumps em um loop no kotlin
    // Explica continue (pula a repetição do for) e break (para o for por completo)
    jumps()

    // Aqui chamo uma função explicando labels no kotlin
    // repeating.labels()

}

// While
fun whileStructure() {

    var x = 0

    while (x <= 10) {
        print("$x ")
        x++
    }
}

fun doWhile() {

    var x = 0

    do {
        print("$x ")
        x++
    } while (x <= 10)
}

// Explicando for no kotlin e peculiaridades do kotlin como downTo, until, step
fun forStructure() {

    for (i in 0..10) {
        print("$i ")
    }

    println()

    // ir decrementando de 2 em 2 (esse considera o inicio e o fim)
    for (i in 10 downTo 0 step 2) {
        print("$i ")
    }

    println()

    // Ir incrementando de 3 em 3 até 99 (ele não considera o último número, vai até <100)
    for (i in 10 until 100 step 3) {
        print("$i ")
    }
}

// Explicando jumps no loop
fun jumps() {

    // continue
    for (i in 0..50) {
        // Continue pula apenas essa execução do loop (estrutura de jump)
        if (i % 10 == 0) {
            continue
        }

        print("$i ")
    }

    //break (para o for por completo)
    for (i in 0..50) {
        if (i == 20) {
            break
        }
        print("$i ")
    }
}

// Explicando labels (dar nome para um loop)
fun labels() {

    loop@ for (i in 'A'..'E') {
        for (j in 1..5) {
            print("$i$j ")

            // Nesse caso um break dentro do for interno iria parar apenas o for de dentro e não o de fora
            // então utilizei uma label dando o nome de loop para o for externo e dou o break nele
            if (j == 3) {
                //break@loop

                // Nesse caso eu dou um continue apenas no loop com nome, então ele vai parar o de dentro que
                // vai até 5 e voltar a executar o loop externo
                continue@loop
            }
        }
        println()
    }

    print("\n FINAL")
}

