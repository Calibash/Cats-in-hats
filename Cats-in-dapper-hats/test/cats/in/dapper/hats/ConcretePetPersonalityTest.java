/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cats.in.dapper.hats;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Calibash
 */
public class ConcretePetPersonalityTest {
    
    public ConcretePetPersonalityTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of experienceEvent method, of class ConcretePetPersonality.
     */
    @Test
    public void testExperienceEvent() {
        System.out.println("experienceEvent");
        ConcretePetPersonality instance = new ConcretePetPersonality(1,1,1,1);
        instance.experienceEvent();
    }

    /**
     * Test of curiosityTendency method, of class ConcretePetPersonality.
     */
    @Test
    public void testCuriosityTendency() {
        System.out.println("curiosityTendency");
        ConcretePetPersonality instance = new ConcretePetPersonality(1,1,1,1);
        Integer expResult = 1;
        Integer result = instance.curiosityTendency();
        assertEquals(expResult, result);
    }

    /**
     * Test of cheerfulnessTendency method, of class ConcretePetPersonality.
     */
//    @Test
    public void testCheerfulnessTendency() {
        System.out.println("cheerfulnessTendency");
        ConcretePetPersonality instance = new ConcretePetPersonality(1,1,1,1);
        Integer expResult = null;
        Integer result = instance.cheerfulnessTendency();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of stubbornnessTendency method, of class ConcretePetPersonality.
     */
//    @Test
    public void testStubbornnessTendency() {
        System.out.println("stubbornnessTendency");
        ConcretePetPersonality instance = new ConcretePetPersonality(1,1,1,1);
        Integer expResult = null;
        Integer result = instance.stubbornnessTendency();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sadnessTendency method, of class ConcretePetPersonality.
     */
//    @Test
    public void testSadnessTendency() {
        System.out.println("sadnessTendency");
        ConcretePetPersonality instance = new ConcretePetPersonality(1,1,1,1);
        Integer expResult = null;
        Integer result = instance.sadnessTendency();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
