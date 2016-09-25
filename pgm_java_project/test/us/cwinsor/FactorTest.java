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
public class FactorTest {

    public FactorTest() {
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
     * Test
     */
    @Test
    public void testIt() {

        // define random variable states
        RandomVariableState a1 = new RandomVariableState("a1");
        RandomVariableState a2 = new RandomVariableState("a2");
        RandomVariableState a3 = new RandomVariableState("a3");
        RandomVariable A = new RandomVariable("A", Arrays.asList(a1, a2, a3));

        RandomVariableState b1 = new RandomVariableState("b1");
        RandomVariableState b2 = new RandomVariableState("b2");
        RandomVariable B = new RandomVariable("B", Arrays.asList(b1, b2));

        RandomVariableState c1 = new RandomVariableState("c1");
        RandomVariableState c2 = new RandomVariableState("c2");
        RandomVariable C = new RandomVariable("C", Arrays.asList(c1, c2));

        System.out.println(A.toString());
        System.out.println(B.toString());
        System.out.println(C.toString());
    }
}
