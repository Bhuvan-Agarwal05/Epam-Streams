import java.util.Scanner;
import java.util.stream.IntStream;
public class StreamDemoOne
{
    	 public static void main(String[] args) 
    	    {
    	        //Take input string from the user
    	        Scanner sc = new Scanner(System.in);
    	         
    	        System.out.println("Enter input string :");
    	         
    	        String inputString = sc.nextLine().replaceAll(" ", "").toLowerCase();
    	        boolean isItPalindrome = IntStream.range(0, inputString.length()/2).
    	                noneMatch(i -> inputString.charAt(i) != inputString.charAt(inputString.length() - i -1));
    	         
    	        if (isItPalindrome)
    	        {
    	            System.out.println(inputString+" is a palindrome");
    	        }
    	        else
    	        {
    	            System.out.println(inputString+" is not a palindrome");
    	        }
    	         
    	        sc.close();
    	    }  	
}

