package com.dariosavarese;

import java.text.MessageFormat;
import java.util.Objects;

import org.apache.log4j.Logger;

public class HedgehogProblemSolver {
    static final Logger logger = Logger.getLogger(HedgehogProblemSolver.class);

	TreeZone[][] garden;

	public HedgehogProblemSolver(TreeZone[][] garden) {
		this.garden = garden;
	}

	public int getSolution() {
		return getAppleNumber(0, 0);
	}

	private int getAppleNumber(int i, int j) {
		if(this.garden.length == 0 || this.garden[0].length == 0 || this.garden[0].length != this.garden.length ){
			return 0;
		}
			
		int apples = this.garden[i][j].getApples();
		int applesRight = this.garden[i][j].getApplesIfGoRight();
		int applesDown = this.garden[i][j].getApplesIfGoDown();
		logger.info(MessageFormat.format("Tree {0}{1} apples {2}", i, j, apples));

		if (applesRight < 0 && j < this.garden[0].length - 1) {
			applesRight = getAppleNumber(i, j + 1);
			this.garden[i][j].setApplesIfGoRight(applesRight);
			logger.info(MessageFormat.format("Tree {0}{1} apples if right {2}  ", i, j, applesRight));
		}
		if (applesDown < 0 && i < this.garden.length - 1) {
			applesDown = getAppleNumber(i + 1, j);
			this.garden[i][j].setApplesIfGoDown(applesDown);
			logger.info(MessageFormat.format("Tree {0}{1} apples if down {2}  ", i, j, applesDown));
		}

		if (applesRight >= applesDown) {
			apples += applesRight > -1 ? applesRight : 0;
		} else {
			apples += applesDown > -1 ? applesDown : 0;
		}

		return apples;
	}

}
