package Assingment5;

public class ReverseEvenWord {
	public static void main(String[] args) {
		String test="I am software tester";
		
		String[] split=test.split(" ");
		
		
			for(int i=0;i<split.length;i++){
				 
				if(i%2==1)
				{
					char[] charArray=split[i].toCharArray();
					for(int j=charArray.length-1;j>=0;j--) {
						
						System.out.print(charArray[j]);
					}}
				else {
					System.out.print(" ");
					System.out.print(split[i]+"");
				}
					
				
						
				
				
				
			}
		}}
	


