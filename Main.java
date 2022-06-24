import java.util.Scanner;
//Patika.dev linkim --> https://app.patika.dev/ailker
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayi giriniz: ");
        int n = input.nextInt();
        int total=0;

        for (int i = 1; i <= (n-1); i++) {
            if (n % i == 0) {
                total+=i;
                //System.out.println(total);
            }
        }
        if (total == n) {
            System.out.println(n + " Mukemmel sayidir.");
        } else {
            System.out.println(n + " Mukemmel sayi degildir.");
        }
    }
}