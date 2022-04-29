package userpkg;
import java.util.ArrayList;
import session6.StaticMember;
public class UserClass {
    ArrayList myCart = new ArrayList<>();
    public void createlist() {
        myCart.add("Doll");
        myCart.add("Bus");
        myCart.add("Teddy");
        System.out.println("Cart contents are:"+myCart);
    }

    public static void main(String[] args) {
        UserClass objUser=newUserClass();
        objUser.createlist();
    }
}
