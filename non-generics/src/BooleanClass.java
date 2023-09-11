/*
    @author DanujaV
    @created 9/11/23 - 2:08 PM   
*/

public class BooleanClass {
    Boolean obj;

    public BooleanClass(Boolean obj) {
        this.obj = obj;
    }

    public Boolean getObj() {
        return obj;
    }

    public void setObj(Boolean obj) {
        this.obj = obj;
    }
    public void print() {
        System.out.println(getClass().getName() + ": " + obj);
    }
}
