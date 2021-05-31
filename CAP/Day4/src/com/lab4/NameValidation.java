package com.lab4;
class NameException extends Exception{
	public NameException(String s) {
		super(s);
	}
}
public class NameValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstname="Shivani";
		String lastname=null;
		try {
			if(firstname==null||lastname==null) {
				throw new NameException("Please enter the name:");
			}
			else {
				System.out.println("Welcome "+firstname+" "+lastname);
			}
		}
		catch(Exception e) {
			System.out.println("Exception occured: "+e);
		}

	}

}
