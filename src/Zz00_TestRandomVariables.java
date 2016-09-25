import java.util.Arrays;

/**
 * Created by Chris on 9/14/2016.
 */
public class Zz00_TestRandomVariables {


    public static void main(String[] args) {
        Zz00_TestRandomVariables t = new Zz00_TestRandomVariables();
        t.doTest();
    }

    public void doTest() {

        // define random variable states
        RandomVariableState a0 = new RandomVariableState("a0");
        RandomVariableState a1 = new RandomVariableState("a1");

        RandomVariable A = new RandomVariable("A", Arrays.asList(a0,a1));
        // basic functions on RandomVariable:
        // copy constructor
        RandomVariable Aprime = A.copy("Aprime");
        // equals
        assert(A.equals(A)); // check
        assert(!A.equals(Aprime)); // should not equal

        // get a random variable state by name
        RandomVariableState aSpaceA0State = A.getSpace().get("a1");
        System.out.println(aSpaceA0State.toString());
        /// get the space
        RandomVariableStateSet aSpace = A.getSpace();
        System.out.println(aSpace.toString());

        // create a new random variable using a space
        RandomVariable Aprimeprime = new RandomVariable("Aprimeprime", A.getSpace());
        assert(!A.equals(Aprimeprime)); // check

        System.out.println(A);
        System.out.println(Aprime);
        System.out.println(Aprimeprime);

        // now the interesting stuff - Factors
        Factor f = new Factor("f", Arrays.asList(A,Aprimeprime));

        System.out.println(f.toString());






        /*
        RandomVariableStateSet bSpace = new RandomVariableStateSet();
        bSpace.add(b0);
        bSpace.add(b1);
        bSpace.add(b2);

        // create instances of random variables
        RandomVariable A = new RandomVariable(aSpace);
        RandomVariable Aprime = new RandomVariable(aSpace);

        // create a random variable (a special case of a Factor_Definition which has a single space)
        Factor_Definition f = new Factor_Definition("f"); // a single-variable factor aka a Random Variable
f.add(A);

        Factor_Definition f2 = new Factor_Definition("f2");



        f.add(aSpace);

        // operations on random variables
        System.out.println(A.equals(Aprime));  // returns false
        System.out.println(A.equals(A));      // returns true

        A.get(

        // operations on a space
        // because it is a "set"
        // .add
        // .addAll


                RandomVariableStateSet bSpace = aSpace.cartesianProduct(aSpace));  // same as
*/
    }
}