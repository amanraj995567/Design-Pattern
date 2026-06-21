package Problems.DesignATM;

public enum TransactionType {
    CASH_WITHDRAWAL,
    CASH_DEPOSIT,
    CHECK_BALANCE;

    public static  void showAllTransactionTypes(){
        for(TransactionType type: TransactionType.values()){
            System.out.println(type.name());
        }
    }
}
