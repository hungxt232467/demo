package session7;
class FourWheeler extends seesion7.Vehicle {
    private boolean powerSteer;
    public FourWheeler(String vId,String vName, int numWheels, boolean powerSteer){
        vehicleNo = vId;
        vehicleName = vName;
        wheels = numWheels;
        powerSteer = pSteer;
    }
    public void showDetails() {
        System.out.println("Vehicle no:"+ vehicleNo);
        System.out.println("Vehicle name:"+vehicleName);
        System.out.println("Number of Wheels:"+ wheels);
        if (powerSteer==true)
            System.out.println("Power Steering:Yes");
        else
            System.out.println("Power Steering:No");
    }
}
public class TestVehicle {
    public static void main(String[] args) {
        FourWheeler objFour = new FourWheeler("LA-09 CS-1406","Volkswagen", 4, true);
        objFour.showDetails();
        objFour.accelerate();
    }
}
