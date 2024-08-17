package javaprograms;
interface Display{
    public void print();
}
public class Lambdainterface {
    public static void main(String[] args) {
Display d=()->{
    System.out.println("Hellom");
};
d.print();
    }
}
