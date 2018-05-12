import instruments.Guitar;
import instruments.Piano;
import items.Item;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Item item;
    private Guitar guitar;
    private Piano piano;
    private Shop shop;
    private ArrayList<Item> stock;


    @Before
    public void before() {
        this.stock = new ArrayList<>();
        guitar = new Guitar("Fender", 300.00, 400.00, "Electric", "Red", 6);
        piano = new Piano("Bechstein", 500.00, 700.00, "Grand", "Black", 88);
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

    @Test
    public void canCalculateTotalProfit(){
        stock.add(guitar);
        stock.add(piano);
        assertEquals(300, shop.calculateTotalProfit(), 0.1);

    }



}
