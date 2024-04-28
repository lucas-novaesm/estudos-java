import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int x;
        double y;
        double consumoMedio;

        System.out.println("Digite a distância total percorrida (em Km): ");
        x = sc.nextInt();

        System.out.println("Digite o total de combustível gasto (em litros)");
        y = sc.nextDouble();

        consumoMedio = x / y;

        System.out.printf("%.3f km/l", consumoMedio);

        sc.close();

    }
}
