package lab_3;

import java.util.Scanner;

public class L3Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter two integer number: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        //change the String to get the (0) first character
        System.out.println("Enter the operand (+,-,*,/,%): ");
        char operand = sc.next().charAt(0);
        
        int result=0;
        switch(operand){
            case '+':
                result = num1+num2; 
                System.out.println("The sum is "+result);
                break;
               
            case '-':
                result = num1-num2;
                System.out.println("The difference is "+result);
                break;
                
            case '*':
                result = num1*num2;
                System.out.println("The multiplication is "+result);
                break;
                
            case '/':
                result = num1/num2;
                System.out.println("The quotient is "+result);
                break;
                
            case '%':
                result = num1%num2;
                System.out.println("The remainder is "+result);
                break;
                
            default:
                System.out.println("Invalid operation");
                break;
        }
        sc.close();
    }
}
