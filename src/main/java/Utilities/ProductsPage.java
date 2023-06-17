package Utilities;

public class ProductsPage {
    public CartPage add_product_to_cart(){
        GenericMethods.customClick("Add to cart");
        return new CartPage();
    }

}
