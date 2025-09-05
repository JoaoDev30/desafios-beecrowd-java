package iniciante;


import java.util.Scanner;

public class Bee1038 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double id = scan.nextDouble();
        if (id == 1){
            id = 4.00;
        } else if (id == 2) {
            id = 4.50;
        } else if (id == 3) {
            id = 5.00;
        } else if (id == 4) {
            id = 2.00;
        }else {
            id = 1.50;
        }
        double qnt = scan.nextDouble();
        scan.nextLine();
        double total = id * qnt;
        System.out.printf("Total: R$ %.2f%n",total);
    }
}
