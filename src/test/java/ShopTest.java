import instruments.Guitar;
import items.Item;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Item item;
    private Guitar guitar;
    private Shop shop;
    private ArrayList<Item> stock;


    @Before
    public void before() {
        this.stock = new ArrayList<>();
        guitar = new Guitar("Fender", 300.00, 400.00, "Electric", "Red", 6);
        this.shop = new Shop(guitar, stock);
    }

    @Test
    public void stockStartsEmpty(){
        assertEquals(0, shop.getAmountOfItemsInStock());
    }

    @Test
    public void canAddGuitarToStock(){
        stock.add(guitar);
        assertEquals(1, shop.getAmountOfItemsInStock());
    }

//    @Test
//    public void calculateTotalProfit(){
//
//    }



}
