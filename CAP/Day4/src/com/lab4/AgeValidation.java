package com.lab4;
import java.util.Scanner;
class InvalidAgeException extends Exception{
	public InvalidAgeException(String str){
		super(str);
	}
}

public class AgeValidation {
    static void validate(int n) throws InvalidAgeException {
    	if(n<15) {
    		throw new InvalidAgeException("Invalid Voter");
    	}else {
    		System.out.println("Welcome to Vote");
    	}
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		try {
			validate(n);
		}catch(Exception e) {
			System.out.println("Exception occured:"+e);
		}

	}

}
