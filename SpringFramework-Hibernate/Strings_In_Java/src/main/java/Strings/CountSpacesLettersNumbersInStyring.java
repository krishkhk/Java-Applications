package Strings;

public class CountSpacesLettersNumbersInStyring {

	public static void count(String n) {
		char[] ch = n.toCharArray();
		int letter = 0;
		int space = 0;
		int number = 0;
		int others = 0;
		for (int i = 0; i < n.length(); i++) {
			if (Character.isLetter(ch[i])) {
				letter++;
			} else if (Character.isDigit(ch[i])) {
				number++;
			} else if (Character.isSpaceChar(ch[i])) {
				space++;
			} else {
				others++;
			}
		}
		System.out.println("This is krishna , new Java  String 236587. GH kiu: program 1111?? 25.33");
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + number);
		System.out.println("other: " + others);
	}

	public static void main(String[] args) {

		String test = "This is krishna , new Java  String 236587. GH kiu: program 1111?? 25.33";
		count(test);

	}

}
