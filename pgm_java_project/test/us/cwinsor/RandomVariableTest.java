/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package us.cwinsor;

import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Chris
 */
public class RandomVariableTest {

    public RandomVariableTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of copy method, of class RandomVariable.
     */
    @Test
    public void testCopy() {
        RandomVariableState a0 = new RandomVariableState("a0");
        RandomVariableState a1 = new RandomVariableState("a1");
        RandomVariable A = new RandomVariable("A", Arrays.asList(a0, a1));
        RandomVariable Aprime = A.copy("Aprime");
        assert (A.equals(A)); // check
        assert (!A.equals(Aprime)); // should not equal
    }

    /**
     * Test of getName method, of class RandomVariable.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        RandomVariableState a0 = new RandomVariableState("a0");
        RandomVariable A = new RandomVariable("A", Arrays.asList(a0));
        assert (A.getName().equals("A")); // check
    }

    /**
     * Test of getSpace method, of class RandomVariable.
     */
    @Test
    public void testGetSpace() {
        System.out.println("getSpace");
        RandomVariableState a0 = new RandomVariableState("a0");
        RandomVariableState a1 = new RandomVariableState("a1");
        RandomVariable A = new RandomVariable("A", Arrays.asList(a0, a1));

        RandomVariableStateSet aSpace = A.getSpace();
        assert (aSpace.size() == 2);
        assert (aSpace.get("a0") == a0);
        assert (aSpace.get("a1") == a1);
    }

    /**
     * Test of toString method, of class RandomVariable.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        RandomVariableState a0 = new RandomVariableState("a0");
        RandomVariableState a1 = new RandomVariableState("a1");
        RandomVariable A = new RandomVariable("A", Arrays.asList(a0, a1));
        System.out.println(A.toString());
    }

}
