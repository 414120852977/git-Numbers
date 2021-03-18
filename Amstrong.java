import java.util.Scanner;
public class Amstrong {
public static void main(String[] args) {
	System.out.println("Enter a number to calculate number is amstrong or not:");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int temp=num;
	int a,c=0;
	while(num>0){
		a=num%10;
		num=num/10;
		c=c+(a*a*a);
		
	}
	if(temp==c){
		System.out.println("given number is a amstrong number :");
		
	}
	else{
		System.out.println("given number is not a amstrong number");
	}
}
}
