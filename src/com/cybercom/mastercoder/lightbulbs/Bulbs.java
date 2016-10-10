package com.cybercom.mastercoder.lightbulbs;

/**
 * 
 * @author Mazurek
 *
 */
public class Bulbs extends LightBulbs {

	final static int boardSize = 6;

	final static int LAST_X = boardSize - 1;
	final static int lAST_Y = boardSize - 1;

	boolean[][] lightsBoard;

	public static LightBulbs getInstance() {
		return new Bulbs();
	}

	@Override
	public int countLightsOn(boolean[][] lightsBoard, int numberOfSteps) {
		this.lightsBoard = lightsBoard;
		int countLightsOn = 0;
		for (int step = 0; step < numberOfSteps; step++) {
			countLightsOn = countLightsOn();
		}
		return countLightsOn;
	}

	private int countLightsOn() {
		int countLightsOn = 0;
		boolean[][] newLightBoard = new boolean[boardSize][boardSize];
		for (int x = 0; x < boardSize; x++) {
			for (int y = 0; y < boardSize; y++) {
				if (x == 4 && y == 1) {
					int fg = 5;
				}
				Bulp bulp = new Bulp(x, y, this.lightsBoard[x][y]);
				boolean state = bulp.getState();
				if (state) {
					countLightsOn = countLightsOn + 1;
				}
				newLightBoard[x][y] = state;
			}
		}
		this.lightsBoard = newLightBoard;
		return countLightsOn;
	}

	public boolean[][] getNewLightBoard() {
		return lightsBoard;
	}

	class Bulp {
		int x;
		int y;
		boolean prevState;

		Bulp(int x, int y, boolean prevState) {
			this.x = x;
			this.y = y;
			this.prevState = prevState;
		}

		boolean getState() {
			if (isCornerBulp()) {
				return false;
			} else if (isLeftBorderBulp()) {
				return getLeftBorderBulpState();
			} else if (isBottomBorderBulp()) {
				return getBottomBorderBulpState();
			} else if (isTopBorderBulp()) {
				return getTopBorderBulpState();
			} else if (isRightBorderBulp()) {
				return getRightBorderBulpState();
			} else {
				return getMiddleBulpState();
			}
		}

		private boolean getMiddleBulpState() {
			int noOfLightsOn = howManyLightOnIsNear();
			return getActualState(noOfLightsOn);
		}

		private int howManyLightOnIsNear() {
			int count = 0;
			if (lightsBoard[x - 1][y]) {
				count = count + 1;
			}
			if (lightsBoard[x - 1][y - 1]) {
				count = count + 1;
			}
			if (lightsBoard[x][y - 1]) {
				count = count + 1;
			}
			if (lightsBoard[x + 1][y - 1]) {
				count = count + 1;
			}
			if (lightsBoard[x + 1][y]) {
				count = count + 1;
			}
			if (lightsBoard[x - 1][y + 1]) {
				count = count + 1;
			}
			if (lightsBoard[x][y + 1]) {
				count = count + 1;
			}
			if (lightsBoard[x + 1][y + 1]) {
				count = count + 1;
			}
			return count;
		}

		private boolean getRightBorderBulpState() {
			int noOfLightsOn = howManyLightOnIsNearRight();
			return getActualState(noOfLightsOn);
		}

		private int howManyLightOnIsNearRight() {
			int count = 0;
			if (lightsBoard[x][y + 1]) {
				count = count + 1;
			}
			if (lightsBoard[x - 1][y + 1]) {
				count = count + 1;
			}
			if (lightsBoard[x - 1][y]) {
				count = count + 1;
			}
			if (lightsBoard[x - 1][y - 1]) {
				count = count + 1;
			}
			if (lightsBoard[x][y - 1]) {
				count = count + 1;
			}
			return count;
		}

		private boolean getTopBorderBulpState() {
			int noOfLightsOn = howManyLightOnIsNearTop();
			return getActualState(noOfLightsOn);
		}

		private int howManyLightOnIsNearTop() {
			int count = 0;
			if (lightsBoard[x - 1][y]) {
				count = count + 1;
			}
			if (lightsBoard[x + 1][y]) {
				count = count + 1;
			}
			if (lightsBoard[x - 1][y - 1]) {
				count = count + 1;
			}
			if (lightsBoard[x][y - 1]) {
				count = count + 1;
			}
			if (lightsBoard[x + 1][y - 1]) {
				count = count + 1;
			}
			return count;
		}

		private boolean getBottomBorderBulpState() {
			int noOfLightsOn = howManyLightOnIsNearBottom();
			return getActualState(noOfLightsOn);
		}

		private int howManyLightOnIsNearBottom() {
			int count = 0;
			if (lightsBoard[x - 1][y]) {
				count = count + 1;
			}
			if (lightsBoard[x - 1][y + 1]) {
				count = count + 1;
			}
			if (lightsBoard[x][y + 1]) {
				count = count + 1;
			}
			if (lightsBoard[x + 1][y + 1]) {
				count = count + 1;
			}
			if (lightsBoard[x + 1][y]) {
				count = count + 1;
			}
			return count;
		}

		private boolean getLeftBorderBulpState() {
			int noOfLightsOn = howManyLightOnIsNearLeft();
			return getActualState(noOfLightsOn);
		}

		private boolean getActualState(int noOfLightsOn) {
			if (prevState) {
				return noOfLightsOn == 2 || noOfLightsOn == 3;
			} else {
				return noOfLightsOn == 3;
			}
		}

		private int howManyLightOnIsNearLeft() {
			int count = 0;
			if (lightsBoard[x][y + 1]) {
				count = count + 1;
			}
			if (lightsBoard[x][y - 1]) {
				count = count + 1;
			}
			if (lightsBoard[x + 1][y + 1]) {
				count = count + 1;
			}
			if (lightsBoard[x + 1][y]) {
				count = count + 1;
			}
			if (lightsBoard[x + 1][y - 1]) {
				count = count + 1;
			}
			return count;
		}

		private boolean isRightBorderBulp() {
			return x == LAST_X;
		}

		private boolean isTopBorderBulp() {
			return y == lAST_Y;
		}

		private boolean isBottomBorderBulp() {
			return y == 0;
		}

		private boolean isLeftBorderBulp() {
			return x == 0;
		}

		private boolean isCornerBulp() {
			return (x == 0 || x == LAST_X) && (y == 0 || y == lAST_Y);
		}
	}
}
