package exceptions

class InvalidValueException(val value: Double): RuntimeException() {
    override val message = "Valor $value não é válido"
}