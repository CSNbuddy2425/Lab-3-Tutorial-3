package lab_3;

import java.util.Scanner;

public class L3Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the radius of a circle: ");
        double R = sc.nextDouble();
        
        System.out.print("Enter a coordinate point (x,y): ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        
        double distance = Math.sqrt((x*x)+(y*y));
        
        if(distance<=R){
            System.out.println("The point ("+x+","+y+") is inside the cicle");
        }else{
            System.out.println("The point ("+x+","+y+") is outside the circle");
        }
        
        sc.close();
    }
}
