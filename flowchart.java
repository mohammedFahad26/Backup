import java.util.Scanner;

public class flowchart {
    public static void main(String[] args) {

        // selection structure

        //create a scanner object
        Scanner scan = new Scanner(System.in);

        System.out.println("ENTER THE FIRST NUMBER");
        int num1 = scan.nextInt(); // READ THE GIVEN VALUE AS INTEGER VALUE

        System.out.println("ENTER THE SECOND NUMBER");
        int num2 = scan.nextInt(); // READ THE GIVEN VALUE AS INTEGER VALUE5

        if (num1 > num2) {
            System.out.println("THE LARGEST NUMBER IS " + num1); // IF NUM1 IS HIGHER, THIS WILL BE PRINTED
        } else{
            System.out.println("THE LARGEST NUMBER IS " + num2); // IF NUM2 IS HIGHER, THIS WILL BE PRINTED
        }
    }
}
