public class Division implements Operation {
    private String name = ":";

    public String getName() {
        return name;
    }

    public double calc(double a, double b){
        if (b!=0) {
            return a/b;
        } else {
            System.out.println("Division my zero not allowed");
            return 0;
        }
    };
}
