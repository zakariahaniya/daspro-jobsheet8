import java.util.Scanner;
/**
 * Triangle16
 */
public class Triangle16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N = ");
        int N = sc.nextInt();
        int i = 1;
        while (i <= N) {
            int j = 1;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            i++;
            System.out.println("*");
        }
    }
}