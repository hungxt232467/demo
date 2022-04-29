public class StaticMembers {
    public static int staticCounter=0;
    int instanceCounter=0;
    static {
        System.out.println("I am a static block");
    }
    public void displayCount() {
        staticCounter++;
        instanceCounter++;
        System.out.println("Static counter is:"+ staticCounter);
        System.out.println("Instance counter is:"+ instanceCounter);
    }
    public static void main(String[]args) {
        System.out.println("I am the main method");
        StaticMembers.staticMethod();
        objStatic1.displayCount();
        StaticMembers objStatic2=newStaticMembers();
        objStatic2.displayCount();
        StaticMembers objStatic3=newStaticMembers();
        objStatic3.displayCount();
    }
}

