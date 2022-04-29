public class classandobject {
    private String brand;
    private int qty;
    private String  category;
    public classandobject(){

    }
    public classandobject(String brand,int qty,String category){
        this.brand=brand;
        this.category=category;
        this.qty=qty;
    }

    public static void main(String[] args) {
        classandobject cao =new classandobject();
        System.out.println(cao);
    }
}
