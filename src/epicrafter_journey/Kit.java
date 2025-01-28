package epicrafter_journey;

import java.util.LinkedHashSet;
import java.util.Set;

public class Kit {
	
	private Set<IBlock> blocksLis = new LinkedHashSet<IBlock>();
	private Set<String> keyWords = new LinkedHashSet<String>();

	public Kit() {
		blocksLis.add(new Wall(3, 2, 2, true));
		blocksLis.add(new Wall(3, 2, 2, true));
		blocksLis.add(new Wall(2, 1, 2, false));
		blocksLis.add(new Wall(2, 1, 2, false));
		blocksLis.add(new Door(1, 2, 2, true));
		
		keyWords.add("Cabane");
		keyWords.add("Muraille");
	}
	
	public void showKit() {
		System.out.println("Amount of blocks in the kit : " + blocksLis.size());
		System.out.print("Amount of keywords in the kit : ");
		for(String keyWord : keyWords) {
			System.out.print(keyWord + " ");
		}
	}
}
