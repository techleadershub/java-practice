package com.adarsh;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandlingBasics {

	public static void main(String[] args) {

		try {
			int result = 10 / 0; // This will throw ArithmeticException
			System.out.println(result);
		} catch (ArithmeticException ex) {
			System.out.println("ArithmeticException caught: " + ex.getMessage());
		} catch (Exception ex) {
			System.out.println("Exception caught: " + ex.getMessage());
		} finally {
			System.out.println("This block always runs (cleanup, etc.)");
		}

		ExceptionHandlingBasics basics = new ExceptionHandlingBasics();

		try {
			// unchecked exception
			basics.callMethod();
		} catch (RuntimeException e) {
			System.out.println("Handling callMethod unchecked exception ApplicationException");
		}

		try {
			basics.callMethod2();
		} catch (CustomCheckedException e) {
			e.printStackTrace();
		}

		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader("example.txt"));
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException ex) {
			System.out.println("Exception caught: " + ex.getMessage());
			try {
				// compulsory to avoid memory issues
				if (reader != null)
					reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		// The resource (BufferedReader) will be closed automatically
		try (BufferedReader reader2 = new BufferedReader(new FileReader("example.txt"))) {
			String line;
			while ((line = reader2.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException ex) {
			System.out.println("Exception caught: " + ex.getMessage());
		}

		try (CustomBufferedReader reader3 = new CustomBufferedReader()) {
			System.out.println("Inside try block");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void callMethod() throws ApplicationException {

		throw new ApplicationException();

	}

	public void callMethod2() throws CustomCheckedException {
		throw new CustomCheckedException();
	}

}
