package Problems.VendorMachineSystem.impl;

import Problems.VendorMachineSystem.State;
import Problems.VendorMachineSystem.VendingMachine;
import Problems.VendorMachineSystem.Coin;
import Problems.VendorMachineSystem.Product;

public class SelectionState implements State {

    public SelectionState() {
        System.out.println("Machine is in selection state");
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) {
        throw new IllegalStateException("Cannot insert more coins. Already in product selection state.");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) {
        throw new IllegalStateException("Cannot insert coin during product selection.");
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) {
        throw new IllegalStateException("Already in product selection state.");
    }

    @Override
    public void chooseProduct(VendingMachine machine, Product product) {
        System.out.println("Choosing product: " + product);
        machine.setSelectedProduct(product);
        machine.setVendingMachineState(new DispenseState());
    }

    @Override
    public void getChange(VendingMachine machine, int amount) {
        throw new IllegalStateException("Cannot get change before product is dispensed.");
    }

    @Override
    public void dispenseProduct(VendingMachine machine) {
        throw new IllegalStateException("Cannot dispense product before one is chosen.");
    }

    @Override
    public void refundFullMoney(VendingMachine machine) {
        System.out.println("Refunding full amount: " + machine.getCoinList());
        machine.getCoinList().clear();
        machine.setVendingMachineState(new IdleState());
    }

    @Override
    public void updateInventory(VendingMachine machine, Product product, int quantity) {
        throw new IllegalStateException("Cannot update inventory from Selection state via this flow.");
    }
}