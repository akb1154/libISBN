package com.akb1152.libIsbn;

public class ISBN10 {

	private String ISBN;
	
	public ISBN10 (String ISBN) {
		this.ISBN =  ISBN.replace(" ", "").replace("-", "");
	}
	
	
	/**
	 * checks if the given ISBN is a valid ISBN-10 number. 
	 * @return true if it is a valid ISBN-10 number, false otherwise.
	 */
	public boolean check () {
		int isbnSum = 0;
		if (ISBN.length()==10) {
			for (int i = 1; i < 11; i++)
				isbnSum += i*Integer.valueOf(""+ISBN.charAt((i-1)));
			if (isbnSum % 11 == 0)
				return true;
		}
		return false;
	}

	/**
	 * 
	 * @see ISBN10#check()
	 * @param ISBN10 ISBN-10 to be checked
	 * @return <code>true</code> if <code>ISBN10</code> is a valid ISBN-10 number; <code>false</code> otherwise
	 */
	public static boolean check (String ISBN10) {
		return new ISBN10(ISBN10).check();
	}
	
}
