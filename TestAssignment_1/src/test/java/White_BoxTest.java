/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import mahnaz.testassignment_1.MinMaxNumbers;
import mahnaz.testassignment_1.Peter_Sestoft_Find_Min_and_max;
import static org.hamcrest.CoreMatchers.equalTo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

/**
 *
 * @author Bruger
 */
   @RunWith(JUnitPlatform.class) 
public class White_BoxTest {
       Peter_Sestoft_Find_Min_and_max ps = new Peter_Sestoft_Find_Min_and_max();


    @Test
    void testWrongInputs() {
       MinMaxNumbers[] mmn =null;
       assertThrows(NumberFormatException.class, () -> {
            mmn[0] = ps.findeMinandmaxNumber(new String[]{"-1","28","8", "88","q","8"});
        });
        assertThrows(NumberFormatException.class, () -> {
            mmn[1] = ps.findeMinandmaxNumber(new String[]{"a whole string!"});
        });
    }
    
     @Test
    void testNumbers() {
         MinMaxNumbers mmn = ps.findeMinandmaxNumber(new String[]{"-1","2","5", "88","58","70"});
        assertThat(5, equalTo(mmn.getMin()));
        assertThat(88, equalTo(mmn.getMax()));

    }

 
    

  
}
