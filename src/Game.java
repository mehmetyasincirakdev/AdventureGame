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
        Location location = null;
        while (true) {
            System.out.println();
            System.out.println("Bölgeler");
            System.out.println();
            System.out.println("1- Güvenli Ev");
            System.out.println("2- Mağaza --> Silah veya Zırh Alabilirsiniz.");
            System.out.printf("Gitmek istediğiniz bölgeyi seçin:  ");
            int selectLocation = input.nextInt();
            switch (selectLocation) {
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                default:
                    location = new SafeHouse(player);
            }
            if (!location.OnLocation()) {
                System.out.println("GAME OVER");
            }

        }
    }
}
