import java.util.Scanner;

public abstract class Location {
    private Player player;
    private String locationName;
    protected Scanner scanner = new Scanner(System.in);

    public Location(Player player, String locationName) {
        this.player = player;
        locationName = locationName;
    }

    abstract boolean OnLocation();

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getlocationName() {
        return locationName;
    }

    public void setlocationName(String locationName) {
        this.locationName = locationName;
    }
}
