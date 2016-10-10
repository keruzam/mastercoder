package com.cybercom.mastercoder.containers;

import java.util.List;

abstract public class Containers {

	// Put implementation creating your derived class instance in derived class
	// source code file.
	public static Containers getInstance() {
		// Implement me
		return null;
	}

	/**
	 * @param fuelVolume
	 *            - the amount of fuel to be transported
	 * @param containers
	 *            - list of available containers (their volumes)
	 * @return Minimum amount of containers required to transport given volume
	 *         of fuel. Returns zero if whole volume cannot be fit into
	 *         available containers.
	 */
	public abstract int countCombinations(int fuelVolume,
			List<Integer> containers);

}
