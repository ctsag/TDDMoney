package gr.nothingness.TDDMoney;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MoneyTest {

  //TODO: 5$ + 10CHF = 10$ if rate is 2:1
  //DONE: 5$ * 2 = 10$
  //DONE: Dollar side effects
  //DONE: make amount private
  //TODO: money rounding?
  //DONE: equals()
  //TODO: hashCode()
  //TODO: equals() null
  //TODO: equals() other objects
  //DONE: 5CHF * 2 = 10CHF
  //TODO: Dollar/Franc duplication
  //DONE: common equals()
  //TODO: common times()
  //DONE: compare Dollars to Francs
  //TODO: Currency?

  @Test
  public void testDollarMultiplication() {
    Dollar five = new Dollar(5);
    assertEquals(new Dollar(10), five.times(2));
    assertEquals(new Dollar(15), five.times(3));
  }

  @Test
  public void testFrancMultiplication() {
    Franc five = new Franc(5);
    assertEquals(new Franc(10), five.times(2));
    assertEquals(new Franc(15), five.times(3));
  }

  @Test
  public void testEquality() {
    assertTrue(new Dollar(5).equals(new Dollar(5)));
    assertFalse(new Dollar(5).equals(new Dollar(6)));
    assertTrue(new Franc(5).equals(new Franc(5)));
    assertFalse(new Franc(5).equals(new Franc(6)));
    assertFalse(new Franc(5).equals((new Dollar(5))));
  }

}
