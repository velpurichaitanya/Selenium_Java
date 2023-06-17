package Utilities;

public class CheckOutPage {
    public void check_out(){
        GenericMethods.customClick("checkout");
    }
    public void fillInformationAndContinue(){
        GenericMethods.customInput("first-name","firstname");
        GenericMethods.customInput("last-name","lastname");
        GenericMethods.customInput("postal-code","30329");
        GenericMethods.customClick("continue");
    }
    public void overviewAndFinish(){
        GenericMethods.customClick("finish");
    }

}
