package com.cybercom.mastercoder.lightbulbs;

import java.util.Scanner;

public class TestBulbs {

	final static int SIZE = 6;
	final static char HASH = '#';

	final static String TEST = ".#.#..\n...##.\n#..#.#\n..##..\n#.#..#\n.###..";

	public static void main(String[] args) {
		boolean[][] table = getTable(TEST);
		// printTable(table);
		// System.out.println();
		LightBulbs bulbs = Bulbs.getInstance();
		int lightOn = bulbs.countLightsOn(table, 4);
		System.out.println(lightOn);
	}

	private static void printTable(boolean[][] table) {
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				char c = table[i][j] ? '#' : '.';
				System.out.print(c);
			}
			System.out.println();
		}
	}

	private static boolean[][] getTable(String test) {
		boolean[][] table = new boolean[SIZE][SIZE];
		Scanner s = new Scanner(test);
		int line = 0;
		while (s.hasNextLine()) {
			String row = s.nextLine();
			for (int i = 0; i < SIZE; i++) {
				char c = row.charAt(i);
				table[line][i] = HASH == c;
			}
			line = line + 1;
		}
		s.close();
		return table;
	}
}
