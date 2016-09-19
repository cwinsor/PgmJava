/**
 * Created by Chris on 9/14/2016.
 */
public class Zz00_FactorTest {


    public static void main(String[] args) {
        System.out.println("here"); // Display the string.
        Zz00_FactorTest t = new Zz00_FactorTest();
        t.doTest();
    }

    public void doTest() {

        // define random variable states
        RandomVariableState a0 = new RandomVariableState("a0");
        RandomVariableState a1 = new RandomVariableState("a1");

        RandomVariableStateSet aStates = new RandomVariableStateSet();
        aStates.add(a0);
        aStates.add(a1);

        RandomVariable A = new RandomVariable("A", aStates);
        // basic functions on RandomVariable:
        // copy constructor
        RandomVariable Aprime = A.copy("Aprime");
        // equals
        System.out.println(A.equals(A)); // returns true
        System.out.println(A.equals(Aprime)); // returns false
        // get the space and create a new random variable using that
        RandomVariable Aprimeprime = new RandomVariable("Aprimeprime", A.getSpace());
        //        Aprimeprime.setState(a1);
        System.out.println(A.equals(Aprimeprime)); // returns false

        //   System.out.println("------------");
        System.out.println(A);
        System.out.println(Aprime);
        System.out.println(Aprimeprime);

        // now the interesting stuff - Factors
        RandomVariableList rvl = new RandomVariableList();
        rvl.add(A);
        rvl.add(Aprimeprime);
        Factor f = new Factor("f", rvl);

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
