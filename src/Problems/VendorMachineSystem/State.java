package Problems.VendorMachineSystem;

public interface State {

    void clickOnInsertCoinButton(VendingMachine machine);

    void insertCoin(VendingMachine machine, Coin coin);

    void clickOnStartProductSelectionButton(VendingMachine machine);

    void chooseProduct(VendingMachine machine, Product product);

    void getChange(VendingMachine machine, int amount);

    void dispenseProduct(VendingMachine machine);

    void refundFullMoney(VendingMachine machine);

    void updateInventory(VendingMachine machine, Product product, int quantity);
}