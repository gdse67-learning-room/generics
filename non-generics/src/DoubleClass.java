/*
    @author DanujaV
    @created 9/11/23 - 2:10 PM   
*/

public class DoubleClass {
    Double obj;

    public DoubleClass(Double obj) {
        this.obj = obj;
    }

    public Double getObj() {
        return obj;
    }

    public void setObj(Double obj) {
        this.obj = obj;
    }
    public void print() {
        System.out.println(getClass().getName() + ": " + obj);
    }
}
