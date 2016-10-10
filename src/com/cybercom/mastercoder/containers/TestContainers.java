package com.cybercom.mastercoder.containers;

import java.util.Arrays;
import java.util.List;

public class TestContainers {

	public static void main(String[] args) {
		// int fuelVolume = 40;
		// int fuelVolume = 44;
		// int fuelVolume = 10;

		int fuelVolume1 = 23;
		// int fuelVolume2 = 2;
		// int fuelVolume3 = 10;
		// int fuelVolume4 = 7;
		// int fuelVolume5 = 14;
		// int fuelVolume6 = 10;
		// int fuelVolume7 = 8;
		// int fuelVolume8 = 6;
		// int fuelVolume9 = 40;

		// List<Integer> containers = Arrays.asList(20, 15, 10, 10, 8, 5);
		// List<Integer> containers = Arrays.asList(42, 41, 4, 3, 1, 1);
		// List<Integer> containers = Arrays.asList(7, 3);

		List<Integer> containers1 = Arrays.asList(11, 10, 7, 5, 1, 1);
		// List<Integer> containers2 = Arrays.asList(1, 2, 3, 4, 5);
		// List<Integer> containers3 = Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1,
		// 1,
		// 1, 1, 1);
		// List<Integer> containers4 = Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16,
		// 18, 20);
		// List<Integer> containers5 = Arrays.asList(1, 3, 5, 7, 9, 11, 13, 15,
		// 17, 19);
		// List<Integer> containers6 = Arrays.asList(9, 9, 8, 8, 3, 3, 1, 2, 3,
		// 4,
		// 5); // 10
		// List<Integer> containers7 = Arrays.asList(3, 3, 3, 3, 3, 3, 3, 1); //
		// 8
		// List<Integer> containers8 = Arrays.asList(6, 6, 1, 2, 3); // 6
		// List<Integer> containers9 = Arrays.asList(3, 4, 5, 2, 4, 5, 6); // 40

		int count1 = ContainerSolution.getInstance().countCombinations(
				fuelVolume1, containers1);
		// int count2 = ContainerSolution.getInstance().countCombinations(
		// fuelVolume2, containers2);
		// int count3 = ContainerSolution.getInstance().countCombinations(
		// fuelVolume3, containers3);
		// int count4 = ContainerSolution.getInstance().countCombinations(
		// fuelVolume4, containers4);
		// int count5 = ContainerSolution.getInstance().countCombinations(
		// fuelVolume5, containers5);
		// int count6 = ContainerSolution.getInstance().countCombinations(
		// fuelVolume6, containers6);
		// int count7 = ContainerSolution.getInstance().countCombinations(
		// fuelVolume7, containers7);
		// int count8 = ContainerSolution.getInstance().countCombinations(
		// fuelVolume8, containers8);
		// int count9 = ContainerSolution.getInstance().countCombinations(
		// fuelVolume9, containers9);

		System.out.println("1: " + count1);
		// System.out.println("2: " + count2);
		// System.out.println("3: " + count3);
		// System.out.println("4: " + count4);
		// System.out.println("5: " + count5);
		// System.out.println("6: " + count6);
		// System.out.println("7: " + count7);
		// System.out.println("8: " + count8);
		// System.out.println("9: " + count9);
	}

}
