interface Data{
    public void best();   //判斷哪一科成績較高
    public void failed(); //判斷哪一科成績低於60分
}
interface Test extends Data{
    public void showData();  //顯示學生的資料及平均成績
    public double average(); // 計算數學和英文的平均成績
}
class CStu implements Test{
    protected String name;
    protected int math;
    protected int english;
    public String best;
    public String failed;
    public CStu(String n, int m, int e) {
        name=n;
        math=m;
        english=e;
    }
    public void best() {
        if(math==english){
            best="的數學與英文一樣好";
        }
        else if (math>english) {
            best="的數學比英文好";
        } else {
            best="的英文比數學好";
        }
    }
    public void failed() {
        if (math<60) {
            failed="的數學當掉了";
        }
        else if(english<60){
            failed="的英文當掉了";
        }else if(english<60 & math<60){
            failed="的英文和數學當掉了";
        }else{
            failed="的英文和數學沒當掉";
        }
    }
    public void showData() {
        System.out.println("姓名:"+name);  
    }
    public double average() {
        return ((math+english)/2);
    }
    public void show() {
        System.out.println("姓名:"+name);
        System.out.println("數學成績:"+math);
        System.out.println("英文成績:"+english);
        System.out.println("平均成績:"+average());
        System.out.println(name+best);
        System.out.println(name+failed);
    }
}
/**
 * Class12
 */
public class Class12 {
    public static void main(String[] args) {
        CStu stu=new CStu("Judy",58,91);
        stu.show();
        stu.best();
        System.out.println(stu.name+stu.best);
        stu.failed();
        System.out.println(stu.name+stu.failed);
    }
}