package epicrafter_journey;

public class Wall extends Block {
    
    private boolean loadBearing;
    private Color color;
    
    public Wall(final int length, final int width, final int height, final boolean loadBearing) {
        super(length, width, height);
        this.loadBearing = loadBearing;
        this.color = Color.GRAY;
    }
    
    @Override
    public void displayDescription() {
        System.out.println("I am a wall!");
    }
    
    public boolean isPassable() {
        return !loadBearing;
    }
}