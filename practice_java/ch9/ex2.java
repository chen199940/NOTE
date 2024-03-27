package practice_java.ch9;
class Rectangle{
    int width;
    int height;
    Rectangle(int w,int h){
        width=w;
        height=h;
    }
    Rectangle(){
        this(1,1);
    }
    void show(){
        System.out.println("width= "+
        width+" height= "+height);
    }
}
public class ex2 {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle(10,20);
        r1.show();
        Rectangle r2=new Rectangle();
        r2.show();
    }
}
