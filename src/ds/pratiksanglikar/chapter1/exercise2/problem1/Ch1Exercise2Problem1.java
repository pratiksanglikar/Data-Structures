/**
 * 
 */
package ds.pratiksanglikar.chapter1.exercise2.problem1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import ds.pratiksanglikar.lib.StdOut;
import ds.pratiksanglikar.lib.StdRandom;

/**
 * Chapter 1, Exercise 2, Problem 1
 * 
 * Write a Point2D client that takes an integer value N from the command line,
 * generates N random points in the unit square, and computes the distance
 * separating the closest pair of points.
 * 
 * @author Pratik Sanglikar
 */
public class Ch1Exercise2Problem1 {

	/**
	 * main entry point of the program.
	 * Accepts 1 command line argument - N - Number of points.
	 * 
	 * @param args command line arguments.
	 */
	public static void main(String[] args) {
		if (args.length != 1) {
			throw new RuntimeException("Number of command line arguments accepted: 1, got: " + args.length);
		}
		int n = Integer.parseInt(args[0]);
		List<Point> randomPoints = generateNRandomPoints(n);
		double shortestDistance = getShortestDistance(randomPoints);
		StdOut.printf(Locale.ENGLISH, "\nShortest Distance: %.3f", shortestDistance);
	}

	/**
	 * returns the shortest distance between points in the given list of points.
	 * 
	 * @param randomPoints
	 * @return shortest distance between points.
	 */
	private static double getShortestDistance(List<Point> randomPoints) {
		double shortestDistance = Double.MAX_VALUE;
		for (int i = 0; i < randomPoints.size(); i++) {
			for (int j = i + 1; j < randomPoints.size(); j++) {
				double distanceIJ = randomPoints.get(i).getDistance(randomPoints.get(j));
				if (distanceIJ < shortestDistance) {
					shortestDistance = distanceIJ;
				}
			}
		}
		return shortestDistance;
	}

	/**
	 * generates n random points in a unit square.
	 * i.e. whose x & y coordinates lie between 0 and 1.
	 * 
	 * @param n number of points required.
	 * @return list of random points.
	 */
	private static List<Point> generateNRandomPoints(int n) {
		List<Point> randomPoints = new ArrayList<>(0);
		for (int i = 0; i < n; i++) {
			double x = StdRandom.uniform(0.00, 1.00);
			double y = StdRandom.uniform(0.00, 1.00);
			Point point = new Point(x, y);
			StdOut.print(point);
			randomPoints.add(point);
		}
		return randomPoints;
	}
}
