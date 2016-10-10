package com.cybercom.mastercoder.lightbulbs;

public abstract class LightBulbs {
	public static LightBulbs getInstance() {
		throw new RuntimeException("Please implement me");
	}
	
	/**
	 * @param lightsBoard - size [78][78]
	 * @param numberOfSteps
	 * @return number of active light bulbs
	 */
	public abstract int countLightsOn(boolean[][] lightsBoard, int numberOfSteps);
	
	protected static final int boardSize = 78;
}
