package com.dariosavarese.run;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.List;

import com.dariosavarese.HedgehogProblemSolver;
import com.dariosavarese.TreeZone;
import com.dariosavarese.utils.FileUtil;
import com.dariosavarese.utils.GardenUtil;

public class App {

	private static final String INPUT_TXT = "input.txt";
	private static final String OUTPUT_TXT = "target/output.txt";

	public static void main(String[] args) throws IOException {
		System.out.println("Here is the Hedgeog Sulution!\n");

		final String gardenPlan = args.length > 0 ? args[0] : INPUT_TXT;
		System.out.println(MessageFormat.format("The garden plan is: {0}", gardenPlan));

		List<String> treeLines = FileUtil.read(gardenPlan);
		TreeZone[][] garden = GardenUtil.dataToGarden(treeLines);
	
		HedgehogProblemSolver app = new HedgehogProblemSolver(garden);

		int solution = app.getSolution();
		
		System.out.println(MessageFormat.format("The solution is : {0}", solution));

		FileUtil.write(OUTPUT_TXT, new Integer(solution).toString());
	}



}
