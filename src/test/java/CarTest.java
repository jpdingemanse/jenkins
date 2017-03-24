/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jean Paul
 */
public class CarTest {
    
    public CarTest() {
    }

    @Test
    public void testSomeMethod() {
        assertSame(this, this);
    }
     @Test
    public void testCreateCar() {
        Car c = new Car();
         assertNotNull(c);
    }
    
}
