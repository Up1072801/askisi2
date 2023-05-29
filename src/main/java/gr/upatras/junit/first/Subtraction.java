package gr.upatras.junit.first;
public class Subtraction {
    public  String subtraction(int a, int b) {
        int result = a - b;
        if (result >= 0) {
            return "POSITIVE";
        } else {
            return "NEGATIVE";
        }
    }
}