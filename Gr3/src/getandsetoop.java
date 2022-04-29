public class getandsetoop {
    private String brand;
    private int qty;
    private String  category;
    public getandsetoop(){

    }
    public getandsetoop(String brand,int qty,String category){
        this.brand=brand;
        this.category=category;
        this.qty=qty;
    }
    public String getBrand(){
        return brand;
    }
    public void setBrand(){
        this.brand=brand;
    }

    public static void main(String[] args) {
        getandsetoop gas = new getandsetoop("BMW",2,"Coupe");
        System.out.println(gas);
    }
}
