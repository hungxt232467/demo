public class bai82 {
    public static void main(String[] args) {
        double radius, height, surfaceArea, baseArea, volume;
        final double PI = 3.14;
        radius = 2;
        height = 4;
        surfaceArea = radius * height;
        baseArea = PI * (radius * radius) * height;

        System.out.print("The radius is ");
        System.out.println(radius);
        System.out.print("The height is ");
        System.out.println(height);
        System.out.print("The surfaceArea is ");
        System.out.println(surfaceArea);
        System.out.print("The baseArea is ");
        System.out.println(baseArea);
    }
}
