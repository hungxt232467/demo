package abstractdemo;

import java.util.Locale;
public class Calculator {
    public static void main(String[] args){
        Shape objShape;
        if (args.length==2) {
            shape=args[0].toLowerCase();
            switch (shape) {
                case "circle":calculate(Float.parseFloat(args[1]));
                break;
                case "rectangle":objShape=new Retangle();
                objShape.calculate(Float.parseFloat(args[1]));
                break;
            }
        }
        else
            System.out.println("Usage: java Calculator<shape-name><value>");
    }
}
