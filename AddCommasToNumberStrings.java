package week3;

import acm.program.ConsoleProgram;

public class AddCommasToNumberStrings extends ConsoleProgram {
	
	public void run() {
			while (true)
			{
					String digits = readLine ("Enter a numeric string: ");
						if (digits.length() == 0)
							break;
						println(addCommasToNumericString(digits));
			}
	}
	  private String addCommasToNumericString(String numbers) {
		String result = "";
		int length = numbers.length();
		int allNumbers = 0;

		
        for (int i = length - 1 ; i >= 0; i--) {
        	result = numbers.charAt(i) + result; 
        	allNumbers++;
        	if (((allNumbers % 3) == 0) && (i > 0)) {
        		result = "," + result;
        	 	}
        	}
        return result;
        }

		
		
	}	
		

	
					 
 

//for (int i=0; i<s.length(); i++)     ForLoop youtube example



//public static void main(String args[]) {

//BACKUP SOLUTION BELOW UNTIL YOU FIGURE OUT HOW TO WORK OUT SOLUTION ABOVE	

//String str1 = String.format("%,04d", 20000);
	//String str2 = String.format("%,04d", 604890540);
	//String str3 = String.format("%,04d", 9000);
//System.out.printf("Original number %d, formatted String : %s %n", 20000, str1);
//System.out.printf("Original number %d, formatted String : %s %n",604890540, str2);
//System.out.printf("Original number %d, formatted String : %s %n",9000, str3);