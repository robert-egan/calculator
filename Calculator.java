import java.util.Scanner;
import java.lang.Math;

public class Calculator{
	
	int x, y, result, choice;
	float m, n, result2; 

	public void getTwoNum() {
		System.out.println("Enter the first number: ");
		Scanner scanX = new Scanner(System.in);
		this.x = scanX.nextInt();
		System.out.println("Enter the second number: ");
		Scanner scanY = new Scanner(System.in);
		this.y = scanY.nextInt();
	}
	
	public void getOneNum() {
		System.out.println("Enter the number: ");
		Scanner scan1 = new Scanner(System.in);
		this.x = scan1.nextInt();
	}
	
	public void getOneFloat() {
		System.out.println("Enter the floating point number: ");
		Scanner scan2 = new Scanner(System.in);
		this.m = scan2.nextFloat();
	}
	
	public void getTwoFloat() {
		System.out.println("Enter the first number: ");
		Scanner scanM = new Scanner(System.in);
		this.m = scanM.nextFloat();
		System.out.println("Enter the second number: ");
		Scanner scanN = new Scanner(System.in);
		this.n = scanN.nextFloat();
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
		float check = (float)Math.sqrt(x);
		float root = 1 ,inc = 1;
		if(x==0 || x==1) {
			result2=(float) x;
		}
		else {
			while(inc>.00002) {
				//this loop controls the decimal place that the next loop is on
				while(root*root<=x) {
					//this loop incrementally searches for the square root
					//and stops once it has gone 1 too far
					root += inc;
				}
				root -= inc;
				inc = inc/10;
				//decimal place of the incrementer moves 1 to the right
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
		Scanner scanC = new Scanner(System.in);
		this.choice = scanC.nextInt();
	}
	public void chooseOperation() {
		switch(this.choice) {
			case 1: this.getTwoNum();
					this.addNumbers(this.x, this.y);
					break;
			case 2: this.getTwoNum();
					this.subtractNumbers(this.x, this.y);
					break;
			case 3: this.getTwoNum();
					this.multiplyNumbers(this.x, this.y);
					break;
			case 4: this.getTwoFloat();
					this.divideNumbers(this.m, this.n);
					break;
			case 5: this.getOneNum();
					this.squareRootNumber(this.x);
					break;
			case 6: this.getTwoNum();
					this.numberToPower(this.x, this.y);
					break;
			case 7: this.getOneFloat();
					this.getAbValue(this.m);
					break;
			case 8: this.getOneNum();
					this.getFactorial(this.x);
					break;
			case 9: this.getOneFloat();
					this.findFloor(this.m);
					break;
			case 10:this.getOneFloat();
					this.findCeiling(this.m);
					break;
		}
		

	}

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		myCalc.getChoice();
		myCalc.chooseOperation();
	}
	
}