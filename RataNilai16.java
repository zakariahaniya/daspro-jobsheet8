import java.util.Scanner;
/**
 * RataNilai16
 */
public class RataNilai16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j;
        float nilai, totalNilai, rataNilai;
        for (i=1;i<=5;i++) {
            totalNilai = 0;
            System.out.println("Input Nilai mahasiswa ke-" + i);
            for (j=1;j<=5;j++) {
                System.out.print("Nilai ke-" + j + " = ");
                nilai = sc.nextFloat();
                totalNilai += nilai;
            }
            rataNilai = totalNilai/5;
            System.out.println("Rata-rata Nilai mahasiswa ke-" + i + " adalah " + rataNilai);
        }
    }
}