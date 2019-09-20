package noguchi;
import java.util.ArrayList;
import java.util.List;

public class Game {
	public static void main(String[] args) {
		List<String> Nintendo = new ArrayList<String>();
		
		Nintendo.add("zelda");
		Nintendo.add("spla");
		Nintendo.add("mario");
		System.out.println(Nintendo.get(0));
		System.out.println(Nintendo.get(1));
		System.out.println(Nintendo.get(2));
		
		for(String a : Nintendo ){
			System.out.println(a);
		}

		
	}
}
