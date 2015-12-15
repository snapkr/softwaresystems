package ss.week6;

import java.util.Scanner;

public class Hello {
	
	public static void main(String[] args){ 
		System.out.print("Please type your name: ");
		Scanner in = new Scanner(System.in);
		while (in.hasNextLine() ){
			String input = in.nextLine();
			if(input.equals("")){
				break;
			}else{
				System.out.println("Hello " + input);
			}
		
			
		}
		in.close();
	}
	

}
