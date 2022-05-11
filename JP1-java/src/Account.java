import java.util.Scanner;

public class Account {
    private String customerCode;
    private String customerName;
    private int accNumber;
    private long amount ;
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
        System.out.println("Withdraw(1) or Deposit(2) :");
        type = ip.nextInt();
        System.out.println("Enter money: ");
        money = ip.nextLong();
        if (type == 0) {
        System.out.println(" Deposit is : " + money);
            System.out.println("Success");
        amount = money + amount;
        System.out.println("Your amount: " + amount);
        }

        if (type == 1) {
            if (money > amount) {
                System.out.println("Non-sufficient funds");
            } else if (money <= amount) {
                System.out.println("withdraw is :  " + money );
                System.out.println("Success");
                amount = amount - money;
                System.out.println("Amount: " + amount);
            }
        }

    }
    {
        System.out.println("BANK");
    }
    @Override
    public String toString() {
        return "Account1{ customerCode='" + customerCode + '\'' + ", customerName='" + customerName + '\'' + ", accNumber=" + accNumber + ", amount=" + amount + '}';
    }
}
