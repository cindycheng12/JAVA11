interface Math{
    void show();
    public void add(int a,int b);
    public void sub(int a,int b);
    public void mul(int a,int b);
    public void div(int a,int b);
    static int pow(int a, int b) {
        return 0;
    }
}
interface AdvanceMath{
    public void mod(int a,int b);
    public void fac(int a);
    public void pow(int a,int b);    
}
class Compute implements Math,AdvanceMath{
    public int ans;
    public void mod(int a, int b) {
        ans=a%b;
    }

    public void fac(int a) {
        ans=a*(a-1);
    }
        

    public void pow(int a, int b) {
        ans=Math.pow(a,b);
    }

    public void show() {
        System.out.println("ans="+ans);
    }

    public void add(int a, int b) {
        ans=a+b;
    }

    public void sub(int a, int b) {
        ans=a-b;
        
    }
    public void mul(int a, int b) {
        ans=a*b;       
    }
    public void div(int a, int b) {
        ans=a/b;
        
    }

}

public class Class9 {
    public static void main(String[] args) {
        Compute cmp=new Compute();
        cmp.mul(3,5);
        cmp.show();
        cmp.mod(14,5);
        cmp.show();
        cmp.fac(5);
        cmp.show();

    }
}
