package Assingment5;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int[] a= {11,22,33,44,55,11,33};
		int b=a.length;
	     for(int i=0;i<b;i++) {
			for(int j=i+1;j<b;j++) {
			 if(a[i]==a[j])
        	  System.out.println(a[j]);
	}

}}}
