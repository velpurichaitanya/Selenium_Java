import Utilities.*;
import org.testng.annotations.*;


public class TestCases extends SetupMethods{
    @BeforeTest
    public void launch_app(){
        driver.get("https://www.saucedemo.com/");
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
    }
    @AfterTest
    public void close_app(){
        driver.quit();
        System.out.println("All Drivers closed");
    }
    @Test
    public void OrderPlacing(){
        LoginPage loginPage = new LoginPage();
        ProductsPage productsPage = loginPage.login();
        CartPage cartPage = productsPage.add_product_to_cart();
        CheckOutPage checkOutPage = cartPage.cart_page();
        checkOutPage.check_out();
        checkOutPage.fillInformationAndContinue();
        checkOutPage.overviewAndFinish();
    }

}
