package MainPackage;

public class MyInteger {

	// Fields -----------------------
	private int value;

	// Constructor ------------------
	public MyInteger(int startValue) {
		value = startValue;
	}

	// Getter -----------------------
	public int getValue() {
		return value;
	}

	// Setter -----------------------
	public void setValue(int value) {
		this.value = value;
	}

	// Methods -----------------------

	// isEven()
	public boolean isEven(){
		return (value % 2 == 0);
	}

	// isOdd()
	public boolean isOdd(){
		if (value % 2 == 0){
			return false;
		} else {
			return true;
		}
	}

	// isPrime()
	public boolean isPrime() {
		if (value % 2 == 0){
			return false;
		} else {
			for (int i = 3; i * i <= value; i += 2)
				if (value % i == 0){
					return false;
				}
			return true;
		}
	}

	// isEven(int)
	public static boolean isEven(int value) {
		return (value % 2 == 0);
	}

	// isOdd(int)
	public static boolean isOdd(int value) {
		if (value % 2 == 0) {
			return false;
		} else {
			return true;
		}
	}

	// isPrime(int)   
	public static boolean isPrime(int value) {
		if (value % 2 == 0){
			return false;
		} else {
			for (int i = 3; i * i <= value; i += 2)
				if (value % i == 0){
					return false;
				}
			return true;
		}
	}

	// isEven(MyInt)
	public static boolean isEven(MyInteger x) {
		return (x.value % 2 == 0);
	}

	// isOdd(MyInt)
	public static boolean isOdd(MyInteger x) {
		if (x.value % 2 == 0) {
			return false;
		} else {
			return true;
		}
	}

	// isPrime(MyInt)   
	public static boolean isPrime(MyInteger x) {
		if (x.value % 2 == 0){
			return false;
		} else {
			for (int i = 3; i * i <= x.value; i += 2)
				if (x.value % i == 0){
					return false;
				}
			return true;
		}
	}	
	
	// equals(int)
	public boolean equals(int x){
		return (value == x);
	}
	
	// equals(MyInt)
	public boolean equals(MyInteger m){
		return (value == m.value);
	}
		
	// ParseIntChar
	public static int parseInt(char[] a){
		return Integer.parseInt(new String(a));
	}

	// ParseIntString
	public static int parseInt(String a) {
		return Integer.parseInt(a);
	}


}