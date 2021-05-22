import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f1 = sc.nextInt();
        String op = sc.toString();
        int f2 = sc.nextInt();

        Operation[] ops = new Operation[]{new Multiplication(), new Division(), new Addition(), new Subtraction(), new Exponentiation()};
        for (Operation o : ops) {
            if (op.equals(o.getName())) {
                o.calc(f1, f2);
            }
        }
    }
}
