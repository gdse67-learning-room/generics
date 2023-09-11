package exercise;

/*
    @author DanujaV
    @created 9/11/23 - 3:40 PM   
*/

public class Main {
    public static void main(String[] args) {
//        new Sample<Float, String, Boolean, Character>()
        Sample<String, Integer, Animal, Double> sample =
                new Sample<String, Integer, Animal, Double>("Hello", 10, new Animal(), 10.5);
    }
}
