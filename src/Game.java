import java.util.Scanner;

public class Game {
    private Scanner input = new Scanner(System.in);

    public void Start() {
        System.out.println("Macera oyununa hoşgeldiniz.");
        System.out.println("Lütfen bir isim giriniz: ");
        //String playerName = input.nextLine();
        Player player = new Player("Mehmet");
        System.out.printf(" Sayın " + player.getName() + " Hoşgeldiniz ");
        System.out.println("Lütfen bir karakter seçiniz. ");
        player.selectChar();
    }
}
