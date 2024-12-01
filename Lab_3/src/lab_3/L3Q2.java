package lab_3;

import java.util.Random;

public class L3Q2 {
    public static void main(String[] args) {
        Random rd = new Random();
        int num = rd.nextInt(5)+1;
        
        switch(num){
            case 1:
                System.out.println(num+" is one");
                break;
                
            case 2:
                System.out.println(num+" is two");
                break;
                
            case 3:
                System.out.println(num+" is three");
                break;
                
            case 4:
                System.out.println(num+" is four");
                break;
                
            case 5:
                System.out.println(num+" is five");
                break;
        }
    }
}
