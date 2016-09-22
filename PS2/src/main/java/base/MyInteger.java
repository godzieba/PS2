package base;

public class MyInteger {
	
	 private int iValue;
	 
	 public MyInteger(int value) {
		 this.iValue = value;
	 }
	 
	 public int getiValue() {
		 return iValue;
	 }
	 
	 public boolean isEven() {
		 if (iValue % 2 == 0) {
			 return true;
		 }
		 else {
			 return false;
		 }
	 }
	 
	 public boolean isOdd() {
		 if (iValue % 2 != 0) {
			 return true;
		 }
		 else {
			 return false;
		 }
	 }
	 
	 public boolean isPrime() {
		 if (iValue == 2) {
			 return true;
		 }
		 for (int i = 2; i < (int) Math.sqrt(iValue) + 1; i++) {
			 if (iValue % i == 0) {
				 return false;
			 }
		 }
		 return true;
	 }
	 
	 public static boolean isEven(int value) {
		 if (value % 2 == 0) {
			 return true;
		 }
		 else {
			 return false;
		 }
	 }
	 
	 public static boolean isOdd(int value) {
		 if (value % 2 != 0) {
			 return true;
		 }
		 else {
			 return false;
		 }
	 }
	 
	 public static boolean isPrime(int value) {
		 if (value == 2) {
			 return true;
		 }
		 for (int i = 2; i < (int) Math.sqrt(value) + 1; i++) {
			 if (value % i == 0) {
				 return false;
			 }
		 }
		 return true;
	 }
	 
	 public static boolean isEven(MyInteger i) {
		 if (i.getiValue() % 2 == 0) {
			 return true;
		 }
		 else {
			 return false;
		 }
	 }
	 
	 public static boolean isOdd(MyInteger i) {
		 if (i.getiValue() % 2 != 0) {
			 return true;
		 }
		 else {
			 return false;
		 }
	 }
	 
	 public static boolean isPrime(MyInteger j) {
		 if (j.getiValue() == 2) {
			 return true;
		 }
		 for (int i = 2; i < (int) Math.sqrt(j.getiValue()) + 1; i++) {
			 if (j.getiValue() % i == 0) {
				 return false;
			 }
		 }
		 return true;
	 }
	 
	 public boolean equals(int value) {
		 if (this.iValue == value) {
			 return true;
		 }
		 else {
			 return false;
		 }
	 }
	 
	 public boolean equals(MyInteger i) {
		 if (i.getiValue() == this.iValue) {
			 return true;
		 }
		 else {
			 return false;
		 }
	 }
	 
	 
	
	

}
