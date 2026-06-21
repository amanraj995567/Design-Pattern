package Problems.DesignATM.ATMState;

import Problems.DesignATM.ATM;
import Problems.DesignATM.Card;
import Problems.DesignATM.TransactionType;

public abstract class ATMState {
    public void insertCard(ATM atm, Card card){}
    public void ejectCard(Card card){}
    public void authenticatePin(ATM atm,Card card, int pin){}
    public void selectOperation(Card card){}
    public void cashDeposit(Card card, int depositAmount){}
    public  void returnCard(){}
    public  void exit(ATM atm){}
    public  void selectOperation(Card card, TransactionType type, ATM atm){}
    public void cashWithdrawal(ATM atm, Card card, int i) {
    }
    public void displayBalance(ATM atm, Card card){}
    public  class ATMRoom {
    }
}
