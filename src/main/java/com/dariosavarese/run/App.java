package com.dariosavarese.run;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.Arrays;

import com.dariosavarese.HedgehogProblemSolver;

public class App {

	public static void main(String[] args) throws IOException {
		System.out.println("Here is the Hedgeog Sulution!\n");

		final String gardenPlan = args.length > 0 ? args[0] : ("input.txt");
		System.out.println(MessageFormat.format("The garden plan is: {0}", gardenPlan));

		// load garden plan
	
		HedgehogProblemSolver app = new HedgehogProblemSolver( Arrays.asList());

		// calc solution
		
		// save solution to output file
	}

}
