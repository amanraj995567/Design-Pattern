package Problems.VendorMachineSystem.impl;

import Problems.VendorMachineSystem.State;
import Problems.VendorMachineSystem.VendingMachine;
import Problems.VendorMachineSystem.Coin;
import Problems.VendorMachineSystem.Product;

public class DispenseState implements State {

    public DispenseState() {
        System.out.println("Machine is in dispense state");
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) {
        throw new IllegalStateException("Cannot insert coin while dispensing product.");
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) {
        throw new IllegalStateException("Cannot insert coin while dispensing product.");
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) {
        throw new IllegalStateException("Cannot select another product while dispensing.");
    }

    @Override
    public void chooseProduct(VendingMachine machine, Product product) {
        throw new IllegalStateException("Cannot choose product while dispensing.");
    }

    @Override
    public void getChange(VendingMachine machine, int amount) {
        throw new IllegalStateException("Change is calculated internally during dispense, not called directly.");
    }

    @Override
    public void dispenseProduct(VendingMachine machine) {
        Product product = machine.getSelectedProduct();
        if (product == null) {
            throw new IllegalStateException("No product selected. Cannot dispense.");
        }

        int totalCoinValue = machine.getCoinList().stream()
                .mapToInt(Coin::getValue)
                .sum();
        int price = product.getPrice();

        if (totalCoinValue < price) {
            throw new IllegalStateException("Insufficient funds. Cannot dispense " + product);
        }

        System.out.println("Dispensing product: " + product);
        machine.decrementInventory(product, 1);

        int changeAmount = totalCoinValue - price;
        if (changeAmount > 0) {
            System.out.println("Returning change: " + changeAmount);
        }

        machine.getCoinList().clear();
        machine.setSelectedProduct(null);
        machine.setVendingMachineState(new IdleState());
    }

    @Override
    public void refundFullMoney(VendingMachine machine) {
        throw new IllegalStateException("Cannot refund. Product is already being dispensed.");
    }

    @Override
    public void updateInventory(VendingMachine machine, Product product, int quantity) {
        throw new IllegalStateException("Cannot update inventory while dispensing.");
    }
}