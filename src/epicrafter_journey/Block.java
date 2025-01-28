package epicrafter_journey;

public abstract class Block implements IBlock {
    
    private int length;
    private int width;
    private int height;
    protected Color color;
    
    public Block(final int length, final int width, final int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    
    protected int getLength() {
        return this.length;
    }
    
    protected int getWidth() {
        return this.width;
    }
    
    protected int getHeight() {
        return this.height;
    }
    
    protected void setColor(Color color) {
        this.color = color;
    }
    
    protected void displayDescription() {
        System.out.println("I am a block!");
    }
}