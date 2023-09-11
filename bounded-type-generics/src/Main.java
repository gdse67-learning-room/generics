/*
    @author DanujaV
    @created 9/11/23 - 3:02 PM   
*/

public class Main {
    public static void main(String[] args) {
        NumericClass<Integer> icc = new NumericClass<>(10);
        icc.print();

        /*NumericClass<String> scc = new NumericClass<>("Danuja");
        scc.print();*/

        NumericClass<Double> dcc = new NumericClass<>(10.5);
        dcc.print();

        /*NumericClass<Student> stcc = new NumericClass<>(new Student());
        stcc.print();*/

        NumericClass<Float> fcc = new NumericClass<>(10.5f);
        fcc.print();

        /*NumericClass<Boolean> bcc = new NumericClass<>(true);
        bcc.print();*/
    }
}
