package week04;

public class VendingMachine {
    public static void main(String[] args) {
        String selection,drinkItem,snackItem,result;
        selection="snack";
        drinkItem="";
        snackItem="chips";
        result=(selection=="drink")? (drinkItem=="coke")? "coke is selected" :"tea is selected"
                :(selection=="snack")? (snackItem=="chips")? "chips is selected" : "candy is selected"
                : "Invalid entery";
        System.out.println(result);







    }
}
