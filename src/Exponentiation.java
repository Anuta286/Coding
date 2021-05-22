public class Exponentiation implements Operation{
    private String name = "^";

    public String getName() {
        return name;
    }

    public double calc(double a, double b){
        return Math.pow(a, b);
    };
}
