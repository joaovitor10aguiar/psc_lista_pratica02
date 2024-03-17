import java.util.Scanner;


public class RegraDeTres {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double x;
        double y;
        double z;

        System.out.print("Digite um valor para X: ");
        x = input.nextDouble();

        System.out.print("Digite um valor para Y: ");
        y = input.nextDouble();

        System.out.print("Digite um valor para Z: ");
        z = input.nextDouble();

        double a = (y * z) / x;

        System.out.println("A variável A possui o valor de: " + a );

        input.close();

    }
}
