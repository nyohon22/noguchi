package noguchi;

public class Game {
	public static void main(String[] args) {
		java.util.List<String> gameSoftList = new java.util.ArrayList<String>();
		
		gameSoftList.add("zelda");
		gameSoftList.add("spla");
		gameSoftList.add("mario");
		System.out.println(gameSoftList.get(0));
		System.out.println(gameSoftList.get(1));
		System.out.println(gameSoftList.get(2));
		//for文
		for(String gameSoft : gameSoftList ){
			System.out.println(gameSoft);
		}
		//Map
		java.util.HashMap<String, String> review = new java.util.HashMap<String,String>();
		review.put("zelda","神ゲー");
		review.put("spla","糞ゲー");
		review.put("mario","notorious");
		System.out.println(review.get("spla"));
		//変数に代入してみる
		String zeldaReview = review.get("zelda");
		System.out.println(zeldaReview);

		
	}
}
