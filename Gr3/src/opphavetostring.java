public class opphavetostring {
    private String product;
    private float price;
    private int qty;
    public opphavetostring(){

    }
    public opphavetostring(String product,float price,int qty){
        this.price=price;
        this.product=product;
        this.qty=qty;
    }
    public String getProduct(){
        return product;
    }
    public void setPrice(float price){
        this.price=price;
    }
    public void setQty(int qty){
        this.qty=qty;
    }

    @Override
    public String toString() {
        return "opphavetostring{" +
                "product='" + product + '\'' +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }

    public static void main(String[] args) {
        opphavetostring opt=new opphavetostring("DVD-ProgressiveHouse",200000F,2);
        System.out.println(opt);
    }
}
