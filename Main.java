import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // SELECTION STRUCTURE
        // SWITCH STATEMENT

        Scanner  S = new Scanner(System.in);

        System.out.println("PLEASE ENTER THE FRUIT TYPE");

        String Fruit =S.next();

        switch (Fruit){
            case "Grape":
                System.out.println("It is a Violet Fruit");
                break;

            case "Apple":
                System.out.println("It is a Red or Green Fruit");
                break;

            case "Banana":
                System.out.println("It is a Yellow Fruit");
                break;

            default:
                System.out.println("INVALID");

        }
    }
}
