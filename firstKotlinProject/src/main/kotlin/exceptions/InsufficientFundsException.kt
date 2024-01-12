package exceptions

class InsufficientFundsException(currentBalance: Double): RuntimeException() {
    override val message = ("A conta não possui saldo suficiente")
}