package examples;

public class Q20GoodOrBadStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println(isGoodOrBad("aeiou?ae?i"));
	}
	public static boolean isGoodOrBad(String str)
	{
		int vowelCount = 0;
		int consonantsCount = 0;
		for (char c : str.toCharArray()) {
			if (c == '?' || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				vowelCount++;
				consonantsCount = 0;
			} else {
				vowelCount = 0;
				consonantsCount++;
			}

			if (vowelCount > 5 || consonantsCount > 3) {
				return false;
			}
		}
		return true;

	}

}
