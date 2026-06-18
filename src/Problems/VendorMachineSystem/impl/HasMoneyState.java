package Problems.VendorMachineSystem.impl;

import Problems.VendorMachineSystem.State;
import Problems.VendorMachineSystem.VendingMachine;
import Problems.VendorMachineSystem.Coin;
import Problems.VendorMachineSystem.Product;

public class HasMoneyState implements State {

    public HasMoneyState() {
        System.out.println("Machine is in has-money state");
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) {
        throw new IllegalStateException("Already accepting coins. No need to click insert coin button again.");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) {
        System.out.println("accepted the coin");
        machine.getCoinList().add(coin);
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) {
        machine.setVendingMachineState(new SelectionState());
    }

    @Override
    public void chooseProduct(VendingMachine machine, Product product) {
        throw new IllegalStateException("Cannot choose product yet. Click start product selection button first.");
    }

    @Override
    public void getChange(VendingMachine machine, int amount) {
        throw new IllegalStateException("Cannot get change. No transaction to complete yet in HasMoney state.");
    }

    @Override
    public void dispenseProduct(VendingMachine machine) {
        throw new IllegalStateException("Cannot dispense product. No product has been selected yet.");
    }

    @Override
    public void refundFullMoney(VendingMachine machine) {
        System.out.println("Refunding full amount: " + machine.getCoinList());
        machine.getCoinList().clear();
        machine.setVendingMachineState(new IdleState());
    }

    @Override
    public void updateInventory(VendingMachine machine, Product product, int quantity) {
        throw new IllegalStateException("Cannot update inventory from HasMoney state via this flow.");
    }
}