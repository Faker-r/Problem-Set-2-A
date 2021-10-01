//Andrew Wang
//Sept 29, 2021
//Problem Set 2-A
class Calculator {
    
    private String quadratic = "No quadratic"; //If these arent used before display called
    private String slope = "\nNo slope";
    private String midpoint = "\nNo midpoint";
    private String arithmetic = "\nNo arithmetic";
    private String geometric = "\nNo geometric";
    
    public void display(){
        System.out.println(quadratic);
        System.out.println(slope);
        System.out.println(midpoint);
        System.out.println(arithmetic);
        System.out.println(geometric);
        
    }
    
    public String quadratic(double a, double b, double c){
        //Quadratic Formula
        //a is Coefficient for x^2
        //b is Coefficient for x 
        //c is Constant
        double solution1 = (-b + Math.sqrt(b*b -(4*a*c)))/(2*a); //This is the quadratic that adds the square root
        double solution2 = (-b - Math.sqrt(b*b -(4*a*c)))/(2*a); //This is the quadratic that subtracts the square root
        //\n to change line after first sentence
        quadratic = ("QUADRATIC FORMULA \nThe solutions for " + (int)a + "x^2 + " + (int)b + "x + " + (int)c + " are " + solution2 +" and " + solution1 + ".");
        return quadratic;
    }
    
    public String slope(double sx1, double sy1, double sx2, double sy2){
        //Slope Formula
        //sx1 is x value of first point
        //sy1 is y value of first point
        //sx2 is x value of second point
        //sy2 is y value of second point
        //\n To skip another line
        //Formula is (sy2-sy1)/(sx2-sx1)
        slope = ("\nSLOPE FORMULA \nA line connecting the points (" + (int)sx1 + ", " + (int)sy1 + ") and (" + (int)sx2 + ", " + (int)sy2 + ") has a slope of " + (sy2-sy1)/(sx2-sx1));
        return slope;
    }
    
    public String midpoint(double sx1, double sy1, double sx2, double sy2){
        //Midpoint Formula
        //sx1 is x value of first point
        //sy1 is y value of first point
        //sx2 is x value of second point
        //sy2 is y value of second point
        //Formula is (sx2+sx1)/2 for x value and (sy2+sy1)/2 for y
        midpoint = ("\nMIDPOINT FORMULA\nThe midpoint between (" + (int)sx1 + ", " + (int)sy1 + ") and (" + (int)sx2 + ", " + (int)sy2 + ") is (" + (sx2+sx1)/2 + ", " + (sy2+sy1)/2 + ")");
        return midpoint; 
    } 
    
    public String arithmetic(double first, double change, int numTerms){
        //Sum of an arithmetic series
        //first is Start of series, first term
        //change is The rate of change
        //numterms is Number of terms in series
        //Formula is (first + last) times number of terms divided by 2 
        arithmetic = ("\nSUM OF AN ARITHMETIC SERIES\nThe sum of the first " + numTerms + " terms of an arithmetic series that starts with " + first + "\nand increases by " + change + " is " + (first*2 + (numTerms-1)*change)*numTerms/2);
        return arithmetic;
    }
    
    public String geometric(double start, double rate, int terms){
        //Sum of a finite geometric series
        //Start value
        //Rate of change
        //Num of terms
        //Used formula start * (1-rate^terms)/1-rate
        geometric = ("\nSUM OF A FINITE GEOMETRIC SERIES\nThe sum of the first " + terms + " terms of a finite geometric series that starts with " + start + "\nand increases by a rate of " + rate + " is " + start * ((1-Math.pow(rate,terms))/(1-rate)));
        return geometric;
    }
    
   
}