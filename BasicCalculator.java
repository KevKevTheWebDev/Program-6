import java.util.Scanner;

class apples{
	public static void main(String args[]){
	Scanner UserTyped = new Scanner(System.in);
	
	double fnum, snum, answer;
	System.out.println("Enter a number: ");
	fnum = UserTyped.nextDouble();
	System.out.println("Enter a number: ");
	snum = UserTyped.nextDouble();
	answer = fnum+snum;
	System.out.println(answer);
	}
}
