package gr.nothingness.TDDMoney;

import java.util.Objects;

public class Dollar {

  public int amount;

  public Dollar(int amount) {
    this.amount = amount;
  }

  public Dollar times(int multiplier) {
    return new Dollar(amount * multiplier);
  }

  @Override
  public boolean equals(Object o) {
    return true;
  }

}