/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package us.cwinsor;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Chris
 */
public class RvTest {

    public RvTest() {
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
    /*
    @Test
    public void testCopy() {
        State a0 = new State("a0");
        State a1 = new State("a1");
        Rv A = new Rv("A", Arrays.asList(a0, a1));
        Rv Aprime = A.copy("Aprime");
        assert (A.equals(A)); // check
        assert (!A.equals(Aprime)); // should not equal
    }
     */
    /**
     * Test of getName method, of class RandomVariable.
     */
    /*
    @Test
    public void testGetName() {
        System.out.println("getName");
        State a0 = new State("a0");
        Rv A = new Rv("A", Arrays.asList(a0));
        assert (A.getName().equals("A")); // check
    }
     */
    /**
     * Test of getSpace method, of class RandomVariable.
     */
    /*
    @Test
    public void testGetSpace() {
        System.out.println("getSpace");
        State a0 = new State("a0");
        State a1 = new State("a1");
        Rv A = new Rv("A", Arrays.asList(a0, a1));

        StateHash aSpace = A.getStateHash();
        assert (aSpace.size() == 2);
        assert (aSpace.get("a0") == a0);
        assert (aSpace.get("a1") == a1);
    }
     */
    /**
     * Test of toString method, of class RandomVariable.
     */
    /*
    @Test
    public void testToString() {
        System.out.println("toString");
        State a0 = new State("a0");
        State a1 = new State("a1");
        Rv A = new Rv("A", Arrays.asList(a0, a1));
        System.out.println(A.toString());
    }
     */
    /**
     * Test of map features
     */
    /*
    @Test
    public void testMapFeatures() {
        System.out.println("mapFeatures");
        State a0 = new State("a0");
        State a1 = new State("a1");
        Rv A = new Rv("A", Arrays.asList(a0, a1));
        System.out.println(A.toString());

        StateHash aHash = A.getStateHash();
        Iterator it = aHash.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            String name = (String) pair.getKey();
            State state = (State) pair.getValue();
            System.out.println("name".concat(name));
            System.out.println("state.name = ".concat(state.getNameee()));
            System.out.println("foo".concat("bar"));
        }
    }
     */
    /**
     * Test of map features
     */
    @Test
    public void testMapFeatures() {
        System.out.println("test basic Map");
        Map<String, Integer> map1 = new HashMap<String, Integer>();
        map1.put("one", 1);
        map1.put("two", 2);
        map1.put("three", 3);

        Set set = map1.entrySet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String string = (String) entry.getKey();
            Integer integer = (Integer) entry.getValue();
            System.out.format("string %s value %d\n", string, integer);
        }
        Map<String, Integer> map2 = new HashMap<String, Integer>();
               System.out.println(map2.toString());
        map2 = map1;
 System.out.println(map2.toString());
        map1.put("four", 4);

        System.out.println(map1.toString());
        System.out.println(map2.toString());
    }

}
