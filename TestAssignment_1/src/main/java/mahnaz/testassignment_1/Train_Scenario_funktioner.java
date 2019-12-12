/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahnaz.testassignment_1;

import java.time.LocalTime;

/**
 *
 * @author Bruger
 */
public class Train_Scenario_funktioner {
    public String takeTrain(LocalTime time){ // atTime(int hour, int minute)-Combines this date with a time to create a LocalDateTime.
        if(time.isBefore(LocalTime.of(9,30)) ||
                (time.isAfter(LocalTime.of(16,0)) && time.isBefore(LocalTime.of(19,30,01)))){
            // atTime(int hour, int minute, int second)-Combines this date with a time to create a LocalDateTime.
            return "pay full fare!";
        }
        if((time.isAfter(LocalTime.of(9,29,59)) && time.isBefore(LocalTime.of(16,00,01)))
        || time.isAfter(LocalTime.of(19,30))){
            return "saver ticket available!";
        }
        return "nothing";
    }
}
