/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahnaz.testassignment_1;

/**
 *
 * @author Bruger
 */
public class Peter_Sestoft_Find_Min_and_max {

    public MinMaxNumbers findeMinandmaxNumber(String[] args) {
        MinMaxNumbers MinMaxNumbers;
        int min, max;
        if (args.length == 0) /* 1 */ {
            System.out.println("No numbers");
        } else {
            min = max = Integer.parseInt(args[0]);
            for (int i = 1; i < args.length; i++) /* 2 */ {
                int obs = Integer.parseInt(args[i]);
                if (obs > max) {
                    max = obs; /* 3 */
                } else if (min > obs) {
                    min = obs; /* 4 */
                }
            }
            System.out.println("Minimum = " + min + "; maximum = " + max);
            MinMaxNumbers = new MinMaxNumbers(min, max);
        return MinMaxNumbers;
        }

       return null; 
    }
    

}
