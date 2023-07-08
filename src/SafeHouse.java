
public class SafeHouse extends NormalLocation {
    public SafeHouse(Player player) {
        super(player, "Güvenli Ev");
    }

    @Override
    public boolean OnLocation() {
        System.out.println("Güvenli evdesiniz. ");
        System.out.printf("Canınız yenilendi.");
        return true;
    }

}
