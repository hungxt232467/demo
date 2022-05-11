import java.util.Scanner;

public class Account {
    public Object accountName;
    private String customerCode;
    private String customerName;
    private int accNumber;
    private long amount;

    public Account() {

    }
    public Account(String customerCode, String customerName, int accNumber, long amount) {
        this.accNumber = accNumber;
        this.amount = amount;
        this.customerCode = customerCode;
        this.customerName = customerName;
    }
    public void input(){
        Scanner ip = new Scanner(System.in);
        System.out.println(" enter CustomerCode : ");
        String customerCode =ip.nextLine();
        if (customerCode.length() >= 5){
            this.customerCode = customerCode;
        }

        System.out.println("enter CustomerName : ");
        this.customerName =ip.nextLine();
        System.out.println("enter accNumber : ");
        int accNumber = Integer.parseInt(ip.nextLine());
        this.accNumber = accNumber;
        System.out.println("enter amount : ");
        long amount = Long.parseLong(ip.nextLine());
        this.amount = amount;
    }
    public void depositAndWithdraw() {
        long money;
        int type;
        Scanner ip = new Scanner(System.in);
        System.out.println("Choose Withdraw(1) or deposit(2) :");
        type = ip.nextInt();
        System.out.println("Enter money: ");
        money = ip.nextLong();
        if (type == 2) {
            System.out.println(" deposit is : " + money);
            amount = money + amount;
            System.out.println("Your amount: " + amount);
        }

        if (type == 1) {
            if (money > amount) {
                System.out.println("error");
            } else if (money <= amount) {
                System.out.println("withdraw is :  " + money );
                amount = amount - money;
                System.out.println("Amount: " + amount);
            }
        }

    }
    public void display(){
        System.out.println("Your account number is :"+customerCode);
        System.out.println("Your account name is :"+customerName);

    }
    @Override
    public String toString() {
        return "Account1{" +
                "accountName=" + accountName +
                ", customerCode='" + customerCode + '\'' +
                ", customerName='" + customerName + '\'' +
                ", accNumber=" + accNumber +
                ", amount=" + amount +
                '}';
    }
}
