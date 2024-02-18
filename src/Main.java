
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Kelime giriniz : ");
        String kelime = scanner.nextLine();
        
        String yedekKelime = "";
        
        for(int i = kelime.length() - 1; i >= 0; i--){
            yedekKelime += kelime.charAt(i);
        }
        if(yedekKelime.equals(kelime)){
            System.out.println("Palindromik Kelime...");
        }else{
            System.out.println("Palindromik Kelime degildir...");
        }
    }
}
