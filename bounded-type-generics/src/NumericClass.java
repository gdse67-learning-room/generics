/*
    @author DanujaV
    @created 9/11/23 - 2:14 PM   
*/

public class NumericClass<T extends Number> {  //type parameter
    T obj;

    public NumericClass(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public void print() {
        System.out.println(getClass().getName() + ": " + obj);
    }
}
