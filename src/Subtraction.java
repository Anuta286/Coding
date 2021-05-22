public class Subtraction implements Operation{
    private String name = "-";

    public String getName() {
        return name;
    }

    public double calc(double a, double b){
        return a-b;
    };
}
