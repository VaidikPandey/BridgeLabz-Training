import java.util.Scanner;

class SubstringFromString{
	
	//Method to create substring using charAt
	public static String createSubstringUsingCharAt(String str,int start,int end){
		StringBuilder result = new StringBuilder();
		for(int i = start;i < end && i < str.length(); i++){
			result.append(str.charAt(i));
		}
		return result.toString();
	}
	
	// Method to compare two strings using charAt()
    public static boolean compareStringsUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
	
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a string:");
		String text = scan.next();
		
		System.out.println("Enter the starting index");
		int start = scan.nextInt();
		
		System.out.println("Enter the ending index");
		int end = scan.nextInt();
		
		String substring1 = createSubstringUsingCharAt(text , start , end); // creating substring using charAt();
		
		String substring2 = text.substring(start,end);// creating substring using built-in substring() method;
		
		//Displaying results
		System.out.println("Substring using charAt:" + substring1);
		System.out.println("Substring using substring():" + substring2);
		
		//comapring the two strings
		boolean areEqual = compareStringsUsingCharAt(substring1 , substring2);
		System.out.println("Are both substrings equal? " +areEqual);
		
		scan.close();
	}
}