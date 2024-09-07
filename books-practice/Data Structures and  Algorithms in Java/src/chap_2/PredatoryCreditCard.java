package chap_2;

import chap_1.CredictCard;

public class PredatoryCreditCard extends CredictCard {
  private double apr;

  public PredatoryCreditCard(String cust, String bk, String acnt, int lim, double initialBal, double rate) {
    super(cust, bk, acnt, lim);
    apr = rate;
  }

  public void processMonth() {
    if (balance > 0) {
      double mountlyFactor = Math.pow(1 + apr, 1 / 12);
      balance *= mountlyFactor;
    }
  }

  public boolean charge(double price) {
    boolean isSuccess = super.charge(price);
    if (!isSuccess) {
      balance += 5;
    }
    return isSuccess;
  }
}
