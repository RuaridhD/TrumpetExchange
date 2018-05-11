import items.Item;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Shop {

    private ArrayList<Item> stock;
    private Item item;

    public Shop(Item item, ArrayList<Item> stock){
        this.item = item;
        this.stock = stock;
    }

    public ArrayList<Item> getStock() {
        return this.stock;
    }

    public Item getItem() {
        return item;
    }

    public int getAmountOfItemsInStock(){
        return stock.size();
    }


}
