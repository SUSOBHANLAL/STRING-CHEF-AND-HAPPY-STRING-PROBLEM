package chefandhappystring;
import java.util.*;
public class susobhan {
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc =new Scanner (System.in);
		
		int t = sc.nextInt();
		for(int k = 0;k<t;k++){
		    int flag = 0;
		    
		    String s = sc.next();
		    int n = s.length();
		    
		    
		    
		    for(int i =0;i<n-2;i++){
		        
		        char c1 = s.charAt(i);
		        char c2 = s.charAt(i+1);
		        char c3 = s.charAt(i+2);
		        if(isVowel(c1)==1 &&  isVowel(c2) ==1&& isVowel(c3)==1){
		            flag =1;
		        }
		    }
		    
		    if(flag ==1){
		        System.out.println("Happy");
		    }else{
		        System.out.println("sad");
		    }
		    
		    
		}
		
	}
	
	
	
	 static int  isVowel(char c) {
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
          return 1;  
        }
         return 0;   
        
        
        
        }

}
