package Problems.DesignATM.ATMState;

import Problems.DesignATM.ATM;
import Problems.DesignATM.Card;
import Problems.DesignATM.TransactionType;

public class IdleState extends ATMState{

    @Override
    public void insertCard(ATM atm, Card card) {
        System.out.println("Card is inserted");
        atm.setCurrentATMState(new HasCardState());
    }
}
