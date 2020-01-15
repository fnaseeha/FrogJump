package com.naseeha.filereading;

import java.util.Scanner;

public class FrogJump {

	public static void main(String[] args) {
		/*A frog 
		 * jump 5m after rest 1s
		 * jump 3m after rest 2s
		 * jump 1m after rest 5s
		 * continue the loop find the distance and time according to 
		 * user input
		 * */
		
		// distance
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter input : Eg. 5m or 5s");
		String input = sc.nextLine();
		sc.close();
		if(input.length() < 2){
			System.out.println("Invalid Input");
		}else{
			String timeOrDistance = input.substring(input.length()-1);
			
			try{
			   int value = Integer.parseInt(input.substring(0, input.length()-1));
			   
			   if(timeOrDistance.equals("s")){
				// time
					int rem_t = value%8;
					int term_t = value/8;
					int dist_u = 0;
					
					if(rem_t == 0){
						
					}else if(rem_t<2){
						dist_u=dist_u+5; //3+1
					}else if((rem_t<4)&&(rem_t>1)){
						dist_u=dist_u+5+3;
					}else{
						dist_u=dist_u+5+3+1;
					}
					
					dist_u = dist_u+term_t*9;//5+3+1+
					   
					System.out.println("Total distance is "+dist_u+" m");
				   
			   }else if(timeOrDistance.equals("m")){
				//distance
					int rem = value%9;
					int term = value/9;
					int time=0;
					if((rem >= 5) && (rem<=7)){
						time++;
					}else if(rem==8){
						time = time+3;
					}
					
					time = time+term*8; //1+2+5
					System.out.println("Total time is "+time+" sec");
				
				   
			   }else{
				   System.out.println("Invalid Type");
			   }
			}catch(NumberFormatException e){
				System.out.println("Invalid Number");
			}catch(Exception e){
				e.printStackTrace();
				System.out.println("Invalid Input");
			}
			
		}
		
	
		
	}

}
