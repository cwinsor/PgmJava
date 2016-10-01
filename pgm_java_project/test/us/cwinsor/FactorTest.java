/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package us.cwinsor;

import java.util.Arrays;
import java.util.List;
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
        State a1 = new State("a1");
        State a2 = new State("a2");
        State a3 = new State("a3");
        Rv A = new Rv("A", Arrays.asList(a1, a2, a3));

        State b1 = new State("b1");
        State b2 = new State("b2");
        Rv B = new Rv("B", Arrays.asList(b1, b2));

        State c1 = new State("c1");
        State c2 = new State("c2");
        Rv C = new Rv("C", Arrays.asList(c1, c2));

        System.out.println(A.toString());
        System.out.println(B.toString());
        System.out.println(C.toString());

        Factor f1 = new Factor("f1", Arrays.asList(A, B, C));
        System.out.println(f1);

        f1.takeSample(new StateHash(Arrays.asList(a1, b1, c1)), 0.25);
        f1.takeSample(new StateHash(Arrays.asList(a1, b1, c2)), 0.35);
        f1.takeSample(new StateHash(Arrays.asList(a1, b2, c1)), 0.08);
        f1.takeSample(new StateHash(Arrays.asList(a1, b2, c2)), 0.16);

        f1.takeSample(new StateHash(Arrays.asList(a2, b1, c1)), 0.05);
        f1.takeSample(new StateHash(Arrays.asList(a2, b1, c2)), 0.07);
        f1.takeSample(new StateHash(Arrays.asList(a2, b2, c1)), 0.0);
        f1.takeSample(new StateHash(Arrays.asList(a2, b2, c2)), 0.0);

        f1.takeSample(new StateHash(Arrays.asList(a3, b1, c1)), 0.15);
        f1.takeSample(new StateHash(Arrays.asList(a3, b1, c2)), 0.21);
        f1.takeSample(new StateHash(Arrays.asList(a3, b2, c1)), 0.09);
        f1.takeSample(new StateHash(Arrays.asList(a3, b2, c2)), 0.18);
       System.out.println(f1);
       
        //   System.out.println(f1.toString());
        //   Factor f2 = f1.reduceKeeping(Arrays.asList(c1));
        //   System.out.println(f2.toString());
//        Factor f2 = new Factor("f2", Arrays.asList(B, C));
//        Factor fABC = f1.product(f2);
//        Factor fAC = fABC.marginalizeOut(B);
//        Factor factor_a1C = fAC.reduceKeeping(Arrays.asList(a2, a3));
    }
}
