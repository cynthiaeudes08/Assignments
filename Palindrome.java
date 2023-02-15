package Assingment5;



public class Palindrome {
	public static void main(String[] args) {
		String word="mom";
		char[] charArray=word.toCharArray();
		String word2="";
		for (int i = charArray.length-1; i >= 0; i--)
		{

			word2=word2+charArray[i];
			System.out.println(word2);
		}
		
			if(word.equals(word2)) 
			{
				System.out.println("It is palindrome");
			}
			else
			{
				System.out.println("It is not palindrome");
			}
			
		}
		}
//Convert to String into character
//char[] charArray=input.toCharArray();
//


