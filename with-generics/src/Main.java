/*
    @author DanujaV
    @created 9/11/23 - 2:14 PM   
*/

public class Main {
    public static void main(String[] args) {
        CommonClass<Integer> icc = new CommonClass<Integer>(10);
        icc.print();

        CommonClass<String> scc = new CommonClass<String>("Danuja");
        scc.print();

        CommonClass<Boolean> bcc = new CommonClass<Boolean>(10 > 5);
        bcc.print();
    }
}
