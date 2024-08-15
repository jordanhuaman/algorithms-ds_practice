package src.chap_1;

/**
 * CredictCard
 */
public class CredictCard {

  private String customer;
  private String bank;
  private String account;
  private int limit;
  private double balance;

  public CredictCard(String cust, String bk, String acnt, int lim, double initialBal) {
    customer = cust;
    bank = bk;
    account = acnt;
    limit = lim;
    balance = initialBal;
  };

  public CredictCard(String cust, String bk, String acnt, int lim) {
    this(cust, bk, acnt, lim, 0.0);
  }

  public String getCustomer() {
    return customer;
  }

  public String getBanck() {
    return bank;
  }

  public String getAccount() {
    return account;
  }

  public int getLimit() {
    return limit;
  }

  public double getBalance() {
    return balance;
  }

  public boolean charge(double price) {
    if (price + balance > limit) {
      return false;
    }
    balance += price;
    return true;
  }

  public void makePayment(double amount) {
    balance -= amount;
  }

  public static void printSummary(CredictCard card) {
    System.out.println("Customer =" + card.customer);
    System.out.println("Bank =" + card.bank);
    System.out.println("Account =" + card.account);
    System.out.println("Balance =" + card.balance);
    System.out.println("Limit =" + card.limit);
  }

  public static void main(String[] args) {
    CredictCard[] wallet = new CredictCard[3];
    wallet[0] = new CredictCard("null", "null", "231 123 123 1231 13", 5000);
    wallet[1] = new CredictCard("null", "null", "231 123 123 1231 13", 5000);
    wallet[2] = new CredictCard("null", "null", "231 123 123 1231 13", 5000, 300);

    for (int val = 1; val <= 16; val++) {
      wallet[0].charge(3 * val);
      wallet[1].charge(2 * val);
      wallet[2].charge(val);
    }
    for (CredictCard card : wallet) {
      CredictCard.printSummary(card);
      while (card.getBalance() > 200.0) {
        card.makePayment(200);
        System.out.println("New Balance = " + +card.getBalance());
      }
    }
  }
}