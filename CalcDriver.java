
public class CalcDriver
{
    public static void main(String args[]){
        Calculator a = new Calculator();
        a.quadratic(1, 5, 6);
        a.slope(0,0,2,3);
        a.midpoint(0,0,2,3);
        a.arithmetic(1,1,5);
        a.geometric(3,2,3);
        
        a.display();
        
    
    }
    
}
