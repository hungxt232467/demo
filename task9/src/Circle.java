package abstractdemo;
class Circle extends abstractdemo.Shape {
    float area;
    @Override
    void calculate(float rad) {
        area=getPI()*rad*rad;
        System.out.println("Area of circle is:"+ area);
    }
}
class Rectangle extends abstractdemo.Shape{
    float perimeter;
    float length=10;
    @Override
    void calculate(float width){
        perimeter=2*(length+width);
        System.out.println("Perimer of the Rectangle is:"+perimeter);
    }
}
