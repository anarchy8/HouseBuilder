import java.util.Scanner;
public class HouseBuilder {
    public static void main(String[] args) {


        int floor;
        int x;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("How Many Floors Should We Make Your House");
        floor = keyboard.nextInt();
            System.out.println("          *               ");
            System.out.println("      *       *           ");
            System.out.println("   *             *        ");
            System.out.println(" *                 *     ");
            System.out.println(" *                 *     ");

        for(x=1; x<=floor; x++){

            System.out.println("---------------------");
            System.out.println("|                   |");
            System.out.println("|                   |");
            System.out.println("|                   |");
            System.out.println("|                   |");
            System.out.println("|                   |");
            System.out.println("---------------------");

        }




    }
}
