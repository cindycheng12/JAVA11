abstract class CShape{
    protected String color;
    public void CSphere(String str){
        color=str;
    }
    public void setColor(String str) {  
        color=str;
    }    

    public abstract void show();
}
class CRectangle extends CShape{
    protected int width,height;
    public  CRectangle(int w,int h) {
        width=w;
        height=h;
    }
    public void show() {
        System.out.println("color="+color+", ");
        System.out.println("area="+width*height);
    }
}
class CCircle extends CShape{
    protected double radius;
    public CCircle(double r){
        radius=r;
    }
    public void show() {
        System.out.println("color="+color+", ");
        System.out.println("area="+3.14*radius*radius);
    }
}

public class Class1 {
    public static void main(String[] args) {
        CRectangle rect=new CRectangle(5, 10);
        rect.setColor("Yellow");
        rect.show();
        CCircle cir =new CCircle(2.0);
        cir.setColor("Green");
        cir.show();
    }
}
