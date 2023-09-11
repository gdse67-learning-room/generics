package exercise;

/*
    @author DanujaV
    @created 9/11/23 - 3:30 PM   
*/

public class Sample<T1 extends String, T2 extends Number, T3 extends Animal, T4>{
    T1 obj1;
    T2 obj2;
    T3 obj3;
    T4 obj4;

    public Sample(T1 obj1, T2 obj2, T3 obj3, T4 obj4) {
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.obj3 = obj3;
        this.obj4 = obj4;
    }
}
