public class ToolStore extends NormalLocation {
    public ToolStore(Player player) {
        super(player, "Mağaza");
    }

    @Override
    public boolean OnLocation() {
        System.out.printf("Mağazaya hoşgeldiniz.");
        return true;
    }
}
