package noguchi;

public class GameSoft {

	String title;
	String genre;
	String review;

	public static void main(String[] args) {
		GameSoft gameSoft = new GameSoft();		
		gameSoft.title = "スプラトゥーン";
		gameSoft.genre = "シューティング";
		gameSoft.review = "おもしろい！";
		System.out.println("タイトル:" + gameSoft.title);
		System.out.println("ジャンル:" + gameSoft.genre);
		System.out.println("感想:" + gameSoft.review);
	}

}
