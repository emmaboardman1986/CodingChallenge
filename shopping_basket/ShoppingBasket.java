package shopping_basket;
import java.util.*;
import buyable_interface.*;
import fruits.*;


public class ShoppingBasket {
  
  private ArrayList<Buyable> basket;

  public ShoppingBasket(){
    this.basket = new ArrayList<Buyable>();
  }

  public int itemCount(){
    return basket.size();
  }

  public void addToBasket(Buyable item){
  basket.add(item);
  }

  public void clearBasket(){
    basket.clear();
  }


  public Buyable removeItemFromBasket(Buyable item) {
    if (basket.remove(item)) {
       return item;
    }
    return null;
}

public int totalPrice(){
  int total = 0;
  for(Buyable item : basket) {
    total += item.getPrice();
  }
  return total;
}

}