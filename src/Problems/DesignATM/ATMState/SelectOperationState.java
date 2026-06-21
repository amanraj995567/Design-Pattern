package Problems.DesignATM.ATMState;

import Problems.DesignATM.ATM;
import Problems.DesignATM.Card;
import Problems.DesignATM.TransactionType;

public class SelectOperationState extends ATMState {

    @Override
    public void selectOperation(Card card, TransactionType type, ATM atmObject) {
        switch (type){
            case CASH_WITHDRAWAL:{
                atmObject.setCurrentATMState(new CashWithdrawalState());
                break;
            }
            case CHECK_BALANCE:{
                atmObject.setCurrentATMState(new CheckBalanceState());
                break;
            }
            case CASH_DEPOSIT:{
                atmObject.setCurrentATMState(new DepositeState());
                break;
            }
            default:{
                System.out.printf("Invalid option");
                exit(atmObject);
            }
        }
    }

    @Override
    public void exit(ATM atm){
        returnCard();
        atm.setCurrentATMState(new IdleState());
        System.out.printf("Exit happens");
    }

    public void returnCard(){
        System.out.printf("Returning Card");
    }

    public  void showAllOperations(){
        System.out.printf("Please select the  Operation Type");
        TransactionType.showAllTransactionTypes();
    }
}
