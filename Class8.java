interface iAaa{
    public void show();
}
class Cbbb{
    public  int num=10;
    public void set(int n) {
        num=n;
    }                                                                    
}

class Cccc extends Cbbb implements iAaa{    //Cccc同時繼承類別Cbbb，又實作介面iAaa

    public void show() {
        System.out.println("num="+num);
    }

}
public class Class8 {
    public static void main(String[] args) {
        Cccc cc=new Cccc();
        cc.set(5);   //印出num=5
        cc.show();
    }
}
