public abstract class NormalLocation extends Location {
    public NormalLocation(Player player, String locationName) {
        super(player, locationName);
    }

    @Override
    public boolean OnLocation() {
        return true;
    }
}
