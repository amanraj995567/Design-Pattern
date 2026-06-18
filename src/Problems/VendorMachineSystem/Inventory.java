package Problems.VendorMachineSystem;

public class Inventory {
    ItemSelf[] inventory = null;
    Inventory(int itemCount){
        inventory = new ItemSelf[itemCount];
        initialEmptyInventory();
    }

    public ItemSelf[] getInventory(){
         return inventory;
    }

    public void setInventory(ItemSelf[] inventory){
        this.inventory = inventory;
    }

    public void initialEmptyInventory(){
        int firstCode = 101;
        for(int i=0;i<inventory.length();i++){
            ItemSelf space = inventory[i];
            space.setCode(firstCode);
            space.setIsSoldOut(true);
            inventory[i] = space;
            firstCode++;
        }
    }

    public Item getItem(int  codeNumber) throws Exception{
        for(ItemSelf itemSelf: inventory){
            if(itemSelf.code==codeNumber){
                if(itemSelf.isSoldOut){
                    throw  new Exception("Item is already sold");
                }
                else return itemSelf.item;
            }
        }
        throw  new Exception("Invalid code");
    }


    public void updateSoldOutItem(int codeNumber){
        for(ItemSelf itemSelf: inventory){
             if(itemSelf.code==codeNumber){
                 itemSelf.setIsSoldOut(true);

             }
        }
    }
}
