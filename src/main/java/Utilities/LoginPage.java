package Utilities;

public class LoginPage extends SetupMethods {

    public ProductsPage login(){
        GenericMethods.customInput("user-name","standard_user");
        GenericMethods.customInput("Password","secret_sauce");
        GenericMethods.customClick("Login");

        return new ProductsPage();
    }

}
