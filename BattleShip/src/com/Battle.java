package com;

import java.util.Arrays;

public class Battle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Player player = new Player();

		Coordinate[] c = new Coordinate[] { new Coordinate(1, 2, false), new Coordinate(3, 4, false),
				new Coordinate(5, 61, false) };

		Ship[] ship = new Ship[] { new Ship(c) };
		// ship.setCoordinate(c);
		player.setShip(ship);
		// String result1 = getHit(ship[0], 3, 4);
		// String result2 = getHit(ship[0], 5, 6);

		String r1 = shipHit(player, 1, 2);
		System.out.println("r1 hit-=" + r1);
		String r2 = shipHit(player, 3, 4);
		System.out.println("r2 hit-=" + r2);
		String r3 = shipHit(player, 5, 6);
		System.out.println("r3 hit-=" + r3);

		System.out.println("-----indiuval-" + getHit(ship[0], 31, 4));
		for (Coordinate cc : c) {
			System.out.println(cc.getStatus());
		}

	}

	private static String getHit(Ship ship, int x, int y) {

		boolean isHit = false;
		String result = "No-Hit";

		Coordinate[] cor = ship.getCoordinate();

		for (int i = 0; i < cor.length; i++) {
			if (x == cor[i].getX() && y == cor[i].getY()) {
				isHit = true;
				result = "Hit";
				cor[i].setStatus(true); // cor[i].setStatus("Hit");
				break;
			}
		}
		System.out.println("isHit-->" + isHit);
		if (isHit) {
			boolean isSunk = true;
			for (Coordinate c : cor) {
				if (!c.getStatus()) {
					isSunk = false;
					break;
				}
			}

			if (isSunk) {
				result = "Sunk";
			}
		}/* else {
			System.out.println("-------------No-Hit-->");
			result = "No-Hit";
		}*/
		return result;
	}

	private static String shipHit(Player player, int x, int y) {
		String result = "No-Hit";
		for (Ship s : player.getShip()) {
			result = getHit(s, x, y);
		}
		System.out.println("shipHit Result-->" + result);
		return result;
	}
}
