/*
    @author DanujaV
    @created 9/11/23 - 2:05 PM   
*/

public class IntegerClass {
    Integer obj;

    public IntegerClass(Integer obj) {
        this.obj = obj;
    }

    public Integer getObj() {
        return obj;
    }

    public void setObj(Integer obj) {
        this.obj = obj;
    }
    public void print() {
        System.out.println(getClass().getName() + ": " + obj);
    }
}
