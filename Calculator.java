import java.util.Scanner;
import java.lang.Math;

public class Calculator{
	
	int x, y, result, choice, num;
	float m, n, result2;
	boolean run = true;
	

	public void getNum(int num) {
		Scanner scanA = new Scanner(System.in);
		Scanner scanB = new Scanner(System.in);
		switch(num) {
			case 1:	System.out.println("Enter the number: ");
					this.x = scanA.nextInt();
					break;
			case 2: System.out.println("Enter the first number: ");
					this.x = scanA.nextInt();
					System.out.println("Enter the second number: ");
					this.y = scanB.nextInt();
					break;
			case 3: System.out.println("Enter the floating point number: ");
					this.m = scanA.nextFloat();
					break;
			case 4: System.out.println("Enter the first number: ");
					this.m = scanA.nextFloat();
					System.out.println("Enter the second number: ");
					this.n = scanB.nextFloat();
					break;
		}
		//scanA.close();
		//scanB.close();
	}
	
	public void addNumbers(int x, int y){
		result = x + y;
		System.out.println("The sum is " + this.result);
		
	}
	
	public void subtractNumbers(int x, int y){
		result = x - y; 
		System.out.println("The difference is " + this.result);	
	}
	
	public void multiplyNumbers(int x, int y) {
		result = x * y;
		System.out.println("The product is " + this.result);
	}
	
	public void divideNumbers(float m, float n) {
		if(n==0) {
			//Checks for 0 in the denominator
			System.out.println("Zero division error");
		}
		else {
			result2 = m / n;
			System.out.println("The quotient is " + this.result2);
		}
	}
	
	public void squareRootNumber(double x) {
		//result2 = (float) Math.sqrt(x);
		//float check = (float)Math.sqrt(x);
		float root = 1 ,inc = 1;
		if(x==0 || x==1) {
			result2=(float) x;
		}
		else {
			while(inc>.00002) {
				//this loop controls the decimal place that the inner loop is on
				while(root*root<=x) {
					//this loop incrementally searches for the square root
					//and stops once it has gone 1 too far
					root += inc;
				}
				root -= inc;
				inc = inc/10;
				//decimal place of inc moves 1 to the right
				if(root*root==x) {
					//catches perfect squares
					result2 = root;
					break;
				}
			}
			result2=root;
		}
		System.out.println("The square root of " + this.x + " is approximately " + this.result2);
		//System.out.println(check);
		//For testing the result against the Math utility
	}
	
	public void numberToPower(int x, int y) {
		//result = (int) Math.pow(x, y);
		if(y==0) {
			result = 1;
			System.out.println(this.x + " to the power of " + this.y + " is " + this.result);
		}
		else if (y>=1) {
			int num = 1;
			for (int power = 1; power <= y; power++) {
				//multiplies num by x, y number of times
				num *= x;
			}
			result = num;
			System.out.println(this.x + " to the power of " + this.y + " is " + this.result);
		}
		else if (y<0) {
			//for negative powers does the same thing but takes the inverse
			int num = 1;
			for (int power = 1; power <= (y * -1); power++) {
				num *= x;
			}
			result2 =(float) 1/num;
			System.out.println(this.x + " to the power of " + this.y + " is " + this.result2);
		}
	}
	
	public void getAbValue(float m) {
		//result = Math.abs(x);
		if (m<0) {
			//if the number is negative, its multiplied by -1 to become positive
			result2 = m * -1;
		}
		else {
			result2 = m;
		}
		System.out.println("The absolute value of " + this.m + " is " + this.result2);
	}
	
	public void getFactorial(int x) {
		if(x==0) {
			result = 1;
		}
		else if(x<3) {
			result = x;
		}
		else {
			int factorial = 1;
			for (int factor = 2; factor <= x; factor++) {
				//multiplies the factorial variable by factor until factor
				//is equal to x
				factorial *= factor;
			}	
			result = factorial;
		}
		System.out.println("The factorial of " + this.x + " is " + this.result);
	}
	
	public void findFloor(float m) {
		//result = (int) Math.floor(m);
		//stores the values of the decimal in the float variable, then subtracts it off
		float decimal = m % 1;
		result = (int) (m - decimal);
		System.out.println("The floor of " + this.m + " is " + this.result);
	}
	
	public void findCeiling(float m) {
		//result = (int) Math.ceil(m);
		float decimal = m % 1;
		result = (int) (m - decimal + 1);
		System.out.println("The ceiling of " + this.m + " is " + this.result);
	}
	public void getChoice() {
		System.out.println("What would you like to do?");
		System.out.println("Enter 1 for addition.");
		System.out.println("Enter 2 for subtraction.");
		System.out.println("Enter 3 for multiplication.");
		System.out.println("Enter 4 for division.");
		System.out.println("Enter 5 for square root.");
		System.out.println("Enter 6 to raise a number to a power.");
		System.out.println("Enter 7 to get the absolute value of a number.");
		System.out.println("Enter 8 to get the factorial of a number.");
		System.out.println("Enter 9 to find the floor of a number.");
		System.out.println("Enter 10 to find the ceiling of a number.");
		System.out.println("Enter 11 to exit calculator.");
		Scanner scanC = new Scanner(System.in);
		this.choice = scanC.nextInt();
		//scanC.close();
	}
	public void chooseOperation() {
		switch(this.choice) {
			case 1: this.getNum(2);
					this.addNumbers(this.x, this.y);
					break;
			case 2: this.getNum(2);
					this.subtractNumbers(this.x, this.y);
					break;
			case 3: this.getNum(2);
					this.multiplyNumbers(this.x, this.y);
					break;
			case 4: this.getNum(4);
					this.divideNumbers(this.m, this.n);
					break;
			case 5: this.getNum(1);
					this.squareRootNumber(this.x);
					break;
			case 6: this.getNum(2);
					this.numberToPower(this.x, this.y);
					break;
			case 7: this.getNum(3);
					this.getAbValue(this.m);
					break;
			case 8: this.getNum(1);
					this.getFactorial(this.x);
					break;
			case 9: this.getNum(3);
					this.findFloor(this.m);
					break;
			case 10:this.getNum(3);
					this.findCeiling(this.m);
					break;
			case 11:System.out.println("Calculator powering down.");
					this.run = false;
					break;
		}
		

	}
	public void runCalc() {
		while(run==true) {
			this.getChoice();
			this.chooseOperation();
		}
	}

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		myCalc.runCalc();
			
	}
	
}