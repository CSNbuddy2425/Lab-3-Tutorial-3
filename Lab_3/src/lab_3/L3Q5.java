package lab_3;

import java.util.Scanner;

public class L3Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean solution = false;
        
        System.out.print("Enter value a, b, c, d, e, f: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double e = sc.nextDouble();
        double f = sc.nextDouble();
        
        //boolean a solution which fullfill the requirement
        if((a*d)-(b*c)==0){
            solution = true;
            System.out.println("The equation has no solution");
        }else{
            double x = ((e*d)-(b*f)/(a*d)-(b-c));
            double y = ((a*f)-(e*c)/(a*d)-(b-c));
            
            System.out.printf("The result of x: %.2f\n",x);
            System.out.printf("The result of y: %.2f\n",y);
            
            sc.close();
        }
    }
}
