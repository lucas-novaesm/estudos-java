import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        try{
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position!");
        }


        sc.close();
    }
}
