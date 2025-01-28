package epicrafter_journey;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Block aBlock = new Wall(10, 10, 5, true);
        aBlock.displayDescription();
        
        List<Integer> blocksUsedQuantity = new ArrayList<Integer>();
        blocksUsedQuantity.add(1);
        blocksUsedQuantity.add(3);
        blocksUsedQuantity.add(1); // duplicate allowed

        for (Integer quantity : blocksUsedQuantity) {
            System.out.println(quantity);
        }

        blocksUsedQuantity.remove(Integer.valueOf(3));
    }
}