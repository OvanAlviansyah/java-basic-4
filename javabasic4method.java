import java.util.Scanner;

public class javabasic4method {
    
    
    //Method 1
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Masukan nilai anda (0-100) = ");
        int nilai = userInput.nextInt();

        mencariHM(nilai);

    }

    //Method 2
    static void mencariHM(int nilai){
        if (nilai >= 0 && nilai <= 20) {
            System.out.println("BELAJAR!!!!!, Huruf mutu Anda : E");
        } else if (nilai >= 21 && nilai <= 40) {
            System.out.println("Try Again, Huruf mutu Anda : D");
        } else if (nilai >= 41 && nilai <= 60) {
            System.out.println("Nice, Huruf mutu Anda : C");
        } else if (nilai >= 61 && nilai <= 80) {
            System.out.println("Good, Huruf mutu Anda : B");
        } else if (nilai >= 81 && nilai <= 100) {
            System.out.println("Perfect, Huruf mutu Anda : A");
        } else if (nilai >= 100) {
            System.out.println("Nilai yang diinput melebihi batas");
        }
    }



}
