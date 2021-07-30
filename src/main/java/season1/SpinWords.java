package season1;

public class SpinWords {

	/*
	 * Write a function that takes in a string of one or more words, and returns the same string, 
	 * but with all five or more letter words reversed (like the name of this kata).
	 *
	 *	Strings passed in will consist of only letters and spaces.
	 *	Spaces will be included only when more than one word is present.
	 *
	 *	Examples:
	 *
	 *	spinWords("Hey fellow warriors") => "Hey wollef sroirraw" 
	 *	spinWords("This is a test") => "This is a test" 
	 *	spinWords("This is another test") => "This is rehtona test"
	 * 
	 * 
	 * 
	 * */
	
	
	//Elapsed Time: 30 Min.
	public String spinWords(String sentence) {
		/// 1st attempt (Entendi mal el problema)
//		sentence = sentence.trim();
//		char[] stringArray = sentence.toCharArray();
//		int length = stringArray.length;
//		if(length<4) 
//			return sentence;
//		char[] reversedArray = new char[length];
//		for(int i = 0; i < length; i++ ) {
//			reversedArray[i] = stringArray[(length -1)- i];
//		}
//		
//		return new String(reversedArray);
		sentence = sentence.trim();
		String[] wordsArray = sentence.split(" ");
		String[] arrangedArray = new String[wordsArray.length];
		int i = 0;
		for(String word : wordsArray) {
			if(word.length() > 4) {
				arrangedArray[i] = new StringBuilder(word).reverse().toString();
			}else {
				arrangedArray[i] = word;
			}
			i++;
		}
		return String.join(" ", arrangedArray);
	  }
}
