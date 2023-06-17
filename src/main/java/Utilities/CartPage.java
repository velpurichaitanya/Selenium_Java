package Utilities;

public class CartPage {
    public CheckOutPage cart_page(){
        GenericMethods.customClick("shopping_cart_link");
        return new CheckOutPage();
    }
}
