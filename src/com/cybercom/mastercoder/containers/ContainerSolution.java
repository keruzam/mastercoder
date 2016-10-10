package com.cybercom.mastercoder.containers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author Tomasz Mazurek
 * 
 */
public class ContainerSolution extends Containers {

	public static Containers getInstance() {
		return new ContainerSolution();
	}

	@Override
	public int countCombinations(final int fuelVolume,
			final List<Integer> containers) {
		if (containers != null && !containers.isEmpty() && fuelVolume > 0) {
			if (containers.contains(fuelVolume)) {
				return 1;
			}
			Collections.sort(containers, Collections.reverseOrder());
			List<Integer> sortedContainers = getSortedContainers(containers,
					fuelVolume);
			int count = 0;
			int depth = 1;
			while (depth < sortedContainers.size() && count == 0) {
				count = countAmountOfContainers(fuelVolume, sortedContainers,
						0, 0, 1, depth);
				depth++;
			}
			return count;

		}
		return 0;
	}

	int countAmountOfContainers(int fuelVolume, List<Integer> containers,
			int numberOfContainer, int containerAmount, int depth, int lastDepth) {
		for (int x = numberOfContainer; x < containers.size(); x++) {
			int containerSumAmount = containerAmount + containers.get(x);
			if (containerSumAmount == fuelVolume)
				return depth;
			if (containerSumAmount > fuelVolume)
				continue;
			if (containerSumAmount < fuelVolume && lastDepth == depth)
				return 0;
			int count = countAmountOfContainers(fuelVolume, containers, x + 1,
					containerSumAmount, depth + 1, lastDepth);
			if (count == 0) {
				continue;
			} else
				return count;
		}
		return 0;
	}

	List<Integer> getSortedContainers(final List<Integer> containers,
			final int fuelVolume) {
		List<Integer> sorted = new ArrayList<Integer>();
		for (Integer container : containers) {
			if (container < fuelVolume) {
				sorted.add(container);
			}
		}
		return sorted;
	}

	int getCounter(final List<Integer> containers, final int fuelVolume) {
		int total = 0;
		int countContainer = 0;
		for (Integer currentItem : containers) {
			if ((total + currentItem) <= fuelVolume) {
				countContainer = countContainer + 1;
				total = total + currentItem;
			}
			if (total == fuelVolume) {
				return countContainer;
			}
		}
		return 0;
	}

}