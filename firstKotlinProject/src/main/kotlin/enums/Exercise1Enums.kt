package enums

/*
    Exercício

    Crie 2 enums: Role (user, moderator e admin) e Level (basic, medium e high). Cada Role deve ter um Level associado
    e um método chamado canDelete(), que deve retornar um booleano indicando se a Role tem permissão de exclusão
    (apenas admins têm essa permissão)
 */

fun main() {

    println(Role.USER.canDelete())
    println(Role.MODERATOR.canDelete())
    println(Role.ADMIN.canDelete())
}

enum class Level {
    BASIC,
    MEDIUM,
    HIGH
}

enum class Role(val level: Level) {
    USER(Level.BASIC),
    MODERATOR(Level.MEDIUM),
    ADMIN(Level.HIGH);

    fun canDelete(): Boolean {
        return if (this == ADMIN) {
            true
        } else {
            false
        }
    }
}