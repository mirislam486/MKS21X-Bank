public class BankAccount{
  private double balance;
  private int accountID;
  private String password;

  public BankAccount(double ibalance, int iaccountid, String ipassword){
    balance = ibalance;
    accountID = iaccountid;
    password = ipassword;
  }

  public double returnBalance(){
    return balance;
  }

  public int returnID(){
    return accountID;
  }

  public String toString(){
    return "" + accountID + " " + balance;
  }

  public boolean deposit(double amount){
    if(amount > 0){
      balance = balance + amount;
    }
    return false;
  }

  public Boolean withdraw(double amount){
    if(amount < balance){
      balance = balance - amount;
    }
    return false;
  }

}
