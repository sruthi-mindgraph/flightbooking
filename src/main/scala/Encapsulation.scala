class BankAccount(private var balance: Double) {
  def deposit(amount: Double): Unit = {
    if (amount > 0) balance += amount
  }

  def withdraw(amount: Double): Unit = {
    if (amount > 0 && amount <= balance) balance -= amount
  }

  def getBalance: Double = balance
}

object EncapsulationExample {
  def main(args: Array[String]): Unit = {
    val account = new BankAccount(1000.0)

    println(s"Initial Balance: ${account.getBalance}")

    account.deposit(500.0)
    println(s"Balance after deposit: ${account.getBalance}")

    account.withdraw(200.0)
    println(s"Balance after withdrawal: ${account.getBalance}")
  }
}
