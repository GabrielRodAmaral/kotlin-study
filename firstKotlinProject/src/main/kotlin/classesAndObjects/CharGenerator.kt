package classesAndObjects


class CharGenerator(val init: Char, val end: Char) {

    fun char(): Char {
        return (init..end).random()
    }
}