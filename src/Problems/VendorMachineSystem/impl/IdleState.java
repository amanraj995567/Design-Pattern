package Problems.VendorMachineSystem.impl;

import Problems.VendorMachineSystem.State;
import Problems.VendorMachineSystem.VendingMachine;
import Problems.VendorMachineSystem.Coin;
import Problems.VendorMachineSystem.Product;

public class IdleState implements State {

    public IdleState() {
        System.out.println("Machine is in idle state");
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) {
        machine.setVendingMachineState(new HasMoneyState());
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) {
        throw new IllegalStateException("Cannot insert coin before clicking insert coin button. Machine is in Idle state.");
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) {
        throw new IllegalStateException("Cannot select product. Machine is in Idle state, no money inserted yet.");
    }

    @Override
    public void chooseProduct(VendingMachine machine, Product product) {
        throw new IllegalStateException("Cannot choose product. Machine is in Idle state.");
    }

    @Override
    public void getChange(VendingMachine machine, int amount) {
        throw new IllegalStateException("Cannot get change. Machine is in Idle state, no transaction in progress.");
    }

    @Override
    public void dispenseProduct(VendingMachine machine) {
        throw new IllegalStateException("Cannot dispense product. Machine is in Idle state.");
    }

    @Override
    public void refundFullMoney(VendingMachine machine) {
        throw new IllegalStateException("Cannot refund money. Machine is in Idle state, no money has been inserted.");
    }

    @Override
    public void updateInventory(VendingMachine machine, Product product, int quantity) {
        throw new IllegalStateException("Cannot update inventory from Idle state via this flow.");
    }
}