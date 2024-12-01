package lab_3;

import java.util.Random;

public class L3Q4_L {
    public static void main(String[] args) {
        Random rd = new Random();
        
        //Player 1 score
        System.out.println("Player 1:");
        int ply1_dice1 = rd.nextInt(6)+1;
        int ply1_dice2 = rd.nextInt(6)+1;
        int sum1 = ply1_dice1 + ply1_dice2;
        System.out.println("Sum of two dice: "+sum1);
    
        //Player 2 score
        System.out.println("Player 2:");
        int ply2_dice1 = rd.nextInt(6)+1;
        int ply2_dice2 = rd.nextInt(6)+1;
        int sum2 = ply2_dice1 + ply2_dice2;
        System.out.println("Sum of two dice: "+sum2);
        
        System.out.println();
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
