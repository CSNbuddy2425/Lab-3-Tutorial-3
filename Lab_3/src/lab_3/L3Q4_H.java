package lab_3;

import java.util.Random;

public class L3Q4_H {
    public static void main(String[] args) {
        Random rd = new Random();
        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;
        
        //Generate Players' score
        for(int i=0;i<2;i++){
            System.out.println("Player "+(i+1)+": ");
            int dice1 = rd.nextInt(6)+1;
            int dice2 = rd.nextInt(6)+1;
            sum = dice1+dice2;
            System.out.println("Dice 1: "+dice1+", Dice 2: "+dice2);
            System.out.println("Sum of two dice: "+sum+"\n");
            
            //Separate different players score, if number increase, may use switch
            if(i==0){
                sum1=sum;
            }else{
                sum2=sum;
            }
        }
        
        //Output whose the winners
        if(sum1>sum2){
            System.out.println("Player 1 Win!");
        }else if(sum2>sum1){
            System.out.println("Player 2 Win!");
        }else{
            System.out.println("It's a Draw!");
        }
    }
}
