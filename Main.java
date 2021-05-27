package check_lambda;

public class Main {

	public static void main(String[] args) {

		
		String first = "Welcome";
		String second = "Good Morning";
		StringUtils.betterstring(first, second, (String str,String nw)->nw.equals(str));
		StringUtils.betterstring(first, second, (String str,String nw)->str.length()>nw.length());
		StringUtils.betterstring(first, second, (String str,String nw)->true);


	}

}
