import java.util.*;
class fi{

	public static void main(String[]args){
	
		Scanner sc =new Scanner(System.in);
		System.out.println("enter num:");
			int num= sc. nextInt();

		if(num==1){
		
			System.out.println("sunday");
		}
		else if(num==2){
		
			System.out.println("monday");
		}
		else if(num==3){
		
			System.out.println("tuesday");
		}else if(num==4){
		
			System.out.println("wensday");

		}
		else if(num==5){
		
			System.out.println("thursday");
		}
		else if(num==6){
		
			System.out.println("friday");
		}
		else if(num==7){
		
			System.out.println("saturday");
		}
		else{
		
			System.out.println("Enter valid number");
		}
	}
}
