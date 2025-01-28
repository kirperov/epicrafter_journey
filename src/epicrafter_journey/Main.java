package epicrafter_journey;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

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
        
        Set<String> motsCles = new LinkedHashSet<String>();
        motsCles .add("Cabane");
        motsCles .add("Cabane");
        motsCles .add("Muraille"); //duplicate not allowed
        
        for(String motCle : motsCles) {
            System.out.println(motCle);
        }
    }
}