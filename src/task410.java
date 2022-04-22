public class task410 {
    public static void main(String[] args) {
        String day= "Monday";
        String hour= "am";
        switch (day) {
            case "Sunday":
                System.out.println("Sunday is a Holiday...");
                switch (hour) {
                    case "am":
                        System.out.println("Good Morning");
                        break;
                    case "pm":
                        System.out.println("Good Morning");
                        break;
                }

                break;
            case "Monday":
                System.out.println("Monday is a Working Day...");
                switch (hour) {
                    case "am":
                        System.out.println("GoodMorning");
                        break;
                    case "pm":
                        System.out.println("Good Evening");
                        break;
                }
                break;
            default:
                System.out.printf("Invali Day");
        }
    }
}
