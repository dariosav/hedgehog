package com.dariosavarese;


import org.junit.Assert;
import org.junit.Test;

public class HedgeogSolutionTest {

    @Test
    public void getSolutionTest33() {
    	TreeZone[][] garden = new TreeZone[3][3];
    	garden[0] = new TreeZone []{new TreeZone(1),new TreeZone(2),new TreeZone(3)};
    	garden[1] = new TreeZone []{new TreeZone(1),new TreeZone(2),new TreeZone(3)};
    	garden[2] = new TreeZone []{new TreeZone(1),new TreeZone(2),new TreeZone(3)};
    	
		HedgehogProblemSolver hedgehogSolution = new HedgehogProblemSolver(garden);
    	Assert.assertEquals(12, hedgehogSolution.getSolution());
    }
    
    @Test
    public void getSolutionTest00() {
    	TreeZone[][] garden = new TreeZone[0][0];
		HedgehogProblemSolver hedgehogSolution = new HedgehogProblemSolver(garden);
    	Assert.assertEquals(0, hedgehogSolution.getSolution());
    }
    
    @Test
    public void getSolutionTest55() {
    	TreeZone[][] garden = new TreeZone[5][5];
    	garden[0] = new TreeZone []{new TreeZone(1),new TreeZone(2),new TreeZone(3),new TreeZone(4),new TreeZone(5)};
    	garden[1] = new TreeZone []{new TreeZone(1),new TreeZone(2),new TreeZone(3),new TreeZone(4),new TreeZone(5)};
    	garden[2] = new TreeZone []{new TreeZone(1),new TreeZone(2),new TreeZone(3),new TreeZone(4),new TreeZone(5)};
    	garden[3] = new TreeZone []{new TreeZone(1),new TreeZone(2),new TreeZone(3),new TreeZone(4),new TreeZone(5)};
    	garden[4] = new TreeZone []{new TreeZone(1),new TreeZone(2),new TreeZone(3),new TreeZone(4),new TreeZone(5)};
		HedgehogProblemSolver hedgehogSolution = new HedgehogProblemSolver(garden);
    	Assert.assertEquals(35, hedgehogSolution.getSolution());
    }

    @Test
    public void getSolutionTest33_scrumble() {
    	TreeZone[][] garden = new TreeZone[3][3];
    	garden[0] = new TreeZone []{new TreeZone(2),new TreeZone(0),new TreeZone(3)};
    	garden[1] = new TreeZone []{new TreeZone(3),new TreeZone(2),new TreeZone(0)};
    	garden[2] = new TreeZone []{new TreeZone(0),new TreeZone(2),new TreeZone(1)};
    	
		HedgehogProblemSolver hedgehogSolution = new HedgehogProblemSolver(garden);
    	Assert.assertEquals(10, hedgehogSolution.getSolution());
    }
    
}


