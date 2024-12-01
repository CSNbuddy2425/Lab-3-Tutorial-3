package lab_3;

import java.util.Scanner;

public class L3Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double commission=0.0;
        
        System.out.print("Enter total sales in RM: ");
        double sales = sc.nextDouble();
        
        System.out.print("Enter sales volume: ");
        int volume = sc.nextInt();
        
        if(volume<=100){
            commission = sales*volume*0.05;
        }else if(volume>100&&volume<=500){
            commission = sales*volume*0.075;
        }else if(volume>500&&volume<=1000){
            commission = sales*volume*0.1;
        }else if(volume>1000){
            commission = sales*volume*0.125;
        }
        System.out.printf("Commission: %.2f",commission);
        
        sc.close();
    }
}
