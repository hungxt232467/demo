import java.util.ArrayList;
import java.util.List;

public class DemoCollection {
    private String Singer;
    private int Age;
    private String song;
    private int date_of_manufacture;
    private  int view;
    private int like;
    public DemoCollection(String singer, int Age, String song, int like, int date_of_manufacture, int view){
        this.Singer = singer;
        this.Age = Age;
        this.song = song;
        this.like = like;
        this.date_of_manufacture = date_of_manufacture;
        this.view = view;
    }
    public String getSinger(){
        return Singer;
    }
    public void setSinger(String Singer){
        this.Singer = Singer;
    }
    public int getAge(){
        return Age;
    }
    public void setAge(int Age){
        this.Age = Age;
    }
    public String getSong(){
        return song;
    }
    public void setSong(String song){
        this.song = song;
    }
    public int getDate_of_manufacture(){
        return date_of_manufacture;
    }
    public void setDate_of_manufacture(int date_of_manufacture){
        this.date_of_manufacture = date_of_manufacture;
    }
    public int getView(){
        return view;
    }
    public void setView(int view){
        this.view = view;
    }
    public int getLike(){
        return like;
    }
    public void setLike(int like){
        this.like = like;
    }
    public static class DemoCollectionExample{
        public static void main(String[] args) {
            List<DemoCollection> DemoCollections = new ArrayList<>();
            DemoCollections.add(new DemoCollection("Truzg",28,"Thay Long",136,2021,1700));
            DemoCollections.add(new DemoCollection("Truzg",28,"Doi Da",100,2022,403));
            DemoCollections.forEach(DemoCollection ->{
                System.out.println("Singer :" + DemoCollection.getSinger()
                        +", Age :" + DemoCollection.getAge()
                        +", song :" + DemoCollection.getSong()
                        +", like :" + DemoCollection.getLike()
                        +", date_of_manufacture :" + DemoCollection.getDate_of_manufacture()
                        +", view :" + DemoCollection.getView());
            });
            DemoCollections.remove(50);
            System.out.println("After remove(\"Truzg\"): " + DemoCollections);
        }
    }
}
