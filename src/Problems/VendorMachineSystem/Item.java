package Problems.VendorMachineSystem;

public class Item {
    ItemType itemType;
    int price;

    public ItemType getItemType(){
        return itemType;
    }

    public  void setItemType(ItemType type){
        this.itemType = type;
    }

    public int getPrice(){return price;}

    public void setPrice(int price){this.price = price;}

}
