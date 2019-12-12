/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.time.LocalTime;
import mahnaz.testassignment_1.Train_Scenario_funktioner;
import static org.hamcrest.CoreMatchers.equalTo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bruger
 */
public class Black_BoxTest {
    
    Train_Scenario_funktioner tsf = new Train_Scenario_funktioner();

    
    @Test
    public void AfterFourPm(){
        LocalTime t = LocalTime.of(16,05);
        assertThat("pay full fare!", equalTo(tsf.takeTrain(t)));
    }
    @Test
    public void exactlySevenThirty(){
        LocalTime t = LocalTime.of(19,30);
        assertThat("pay full fare!",equalTo(tsf.takeTrain(t)) );
    }
    @Test
    public void fourPm(){
        LocalTime t = LocalTime.of(16,00);
        assertThat("saver ticket available!", equalTo(tsf.takeTrain(t)));
    }
    @Test
    public void BeforeNineThirtyAm(){
        LocalTime t = LocalTime.of(7,20);
        assertThat("pay full fare!", equalTo(tsf.takeTrain(t)));
    }
    @Test
    public void nineThirtyAm(){
        LocalTime t = LocalTime.of(9,30);
        assertThat("saver ticket available!", equalTo(tsf.takeTrain(t)));
    }
    
    @Test
    public void afterSevenThirtyPm(){
        LocalTime t = LocalTime.of(19,31);
        assertThat("saver ticket available!", equalTo(tsf.takeTrain(t)));
    }
}
