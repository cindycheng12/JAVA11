interface Data       //interface 1
{
    public void showData();    
}
interface Test{    //interface 2
    public void showScore();
    public double calcu();
}
class CStu implements Data,Test{

    protected String id;
    protected String name;
    protected int mid;
    protected int finl;
    protected int common;    
    public CStu(String i, String n, int m, int f, int c) {
        id=i;
        name=n;
        mid=m;
        finl=f;
        common=c;
    }

    public void showScore() {
        System.out.println("期中:"+mid);
        System.out.println("期末:"+finl);
        System.out.println("平時:"+common);
        System.out.println("學期:"+calcu());
        
    }
    public double calcu() {
        return(mid*0.3+finl*0.4+common*0.4);
    }
    @Override
    public void showData() {
       System.out.println("學號:"+id);
       System.out.println("姓名:"+name);        
    }
    public void show() {
        System.out.println("學號:"+id);
        System.out.println("姓名:"+name);
        System.out.println("期中:"+mid);
        System.out.println("期末:"+finl);
        System.out.println("平時:"+common);
        System.out.println("學期:"+calcu());          
    }
}

public class Class11 {
    public static void main(String[] args) {
        CStu stu=new CStu("940001","Fiona",90,92,85);
        stu.show();
    }
}
