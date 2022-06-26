//Czy jest Panonimem
//Np. kajak

import java.util.Scanner;

public class Main {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyraz: ");
        String a = scanner.nextLine();
        String b=(a.toLowerCase());
        int h = b.length();
        int kk = 0;
        int k = (h - 1);
        for (int i = 0; i < h; i++) {
            if (b.charAt(i) != b.charAt(k)) {
                kk = 1;
                break;
            }
            k--;
        }
        if (kk == 1)
            System.out.println("Nie jest palindromem");
        else {
            System.out.println("Jest palindromem");
        }
    }
}