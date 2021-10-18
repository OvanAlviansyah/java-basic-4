import java.util.Scanner;

public class javabasic4method2 {
    
    
    //Main Method
    public static void main(String[] args) {
        System.out.println("(1) untuk mencari luas persegi");
        System.out.println("(2) untuk mencari luas kubus");

        Scanner userInput = new Scanner(System.in);
        System.out.println("Masukan pilihan anda = ");
        int input = userInput.nextInt();

        if (input == 1) {
            luasPersegi();
        } else if (input == 2) {
            luasKubus();
        } else {
            System.out.println("MASUKIN PILIHAN YANG BENER !");

        }
    }
    // membuat Method luasPersegi()
    static void luasPersegi(){
        System.out.println("\n=//=//=//=//=//=//=//=//=//=//=//=//=//");
        System.out.println("(1) Mencari luas persegi");

        Scanner userInputNilai = new Scanner(System.in);
        System.out.println("Masukan nilai = ");
        int sisi, luas;
        sisi = userInputNilai.nextInt();
        luas = sisi * sisi;

        System.out.println("Nilai luas persegi = " + luas);
    }
    
    // membuat Method luasKubus()
    static void luasKubus(){
        System.out.println("\n=//=//=//=//=//=//=//=//=//=//=//=//=//");
        System.out.println("(2) Mencari luas kubus");

        Scanner userInputNilai = new Scanner(System.in);
        System.out.println("Masukan nilai = ");
        int sisi, luas;
        sisi = userInputNilai.nextInt();
        luas = (sisi * sisi) * 6;

        System.out.println("Nilai luas kubus = " + luas);
    }

}
