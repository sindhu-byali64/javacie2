package cie2;

public class Simpleinterest{
        public static void main(String[] args) {
            double principal = 1000;  // Principal amount
            double rate = 5;          // Interest rate (in %)
            double time = 2;          // Time (in years)
    
            double interest = (principal * rate * time) / 100;  // Simple Interest formula
    
            System.out.println("Simple Interest: " + interest);
            System.out.println("this is master node");
        }
}
