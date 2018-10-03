/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package watercomputermoniter2;
import java.util.Scanner;
/**
 *
 * @author kabut2496
 */
public class WaterComputerMoniter2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner keyInput = new Scanner(System.in);
        int com,mon;
        double monsum,sum;
        System.out.println("how many computers are in your house");
        com = keyInput.nextInt();
        System.out.println("how many moniters are in your house");
        mon = keyInput.nextInt();
        monsum=mon*0.5;
        sum= com+monsum;
        System.out.println("there was "+sum+"tones of water used in making your computers and moniters");
    }
    }
    
