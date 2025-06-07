package MathClass;

public class NumberDemo extends Number{
    public NumberDemo(){
        super(500,400,300);
    }
    public static void main(String[] args) {
        NumberDemo nn= new NumberDemo();


        System.out.println("The largest number:"+nn.getMax());
    }
}
