package basic.05access;

public class BankAccount {

  private int balance;

  public BankAccount() {
    balance = 0;
  }

  // public method: deposit
  public void deposit(int amount) {
    if(isAmountValid(amount)) {
      balance += amount;
    } else {
      System.out.println("유효하지 않은 금액입니다.");
    }
  }

  // public method: withdraw
  public void withdrqw(int amount) {
    if(isAmountValid(amount) && balance - amount >= 0) {
      balance -= amount;
    } else {
      System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
    }
  }

  // public method: getBalance
  public void getBalance() {
    return balance;
  }

  // private method: isAmountAccount
  private boolean isAmountValid(int amount) {
    return amount > 0;
  }
}
