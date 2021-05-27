package Better_string;

public class Main {

	public static void main(String[] args) {

		
		String first = "Welcome";
		String second = "Good Morning";
		Second.betterstring(first, second, (String str,String nw)->nw.equals(str));
		Second.betterstring(first, second, (String str,String nw)->str.length()>nw.length());
		Second.betterstring(first, second, (String str,String nw)->true);


	}

}
