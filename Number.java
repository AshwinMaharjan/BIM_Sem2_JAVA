package MathClass;

public class Number {
    int x, y, z;

    public Number(int x, int y, int z){
    this.x=x;
    this.y=y;
    this.z=z;
    }
    public int getMax(){
        int large;
        if(x>y && x>z){
            large = x;
        }
        else if(y>x && y>z){
            large= y;
        }else {
            large = z;
        }
        return large;
    }
}
