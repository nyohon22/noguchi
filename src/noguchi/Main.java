package noguchi;

public class Main {

	public static void main(String[] args) {
		Dentaku dentaku = new Dentaku(2,3); 
		
		int add = dentaku.add();
		int subtraction = dentaku.subtraction();
		System.out.println(add);
		System.out.println(subtraction);

	}
	
}
