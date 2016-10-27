package org.scmad.clamcard;

import java.util.ArrayList;

public class ClamCard {
	ArrayList<?> zoneA = new ArrayList() {
		{
			add("Asterisk");
			add("Antelope");
			add("Aldgate");
			add("Angel");
		}
	};

	ArrayList<?> zoneB = new ArrayList() {
		{
			add("Bison");
			add("Bugel");
			add("Balham");
			add("Barbican");
			add("Bullhead");
		}
	};

	public double travel(String from, String to) {
		double cost = 0.0;
		if (isZoneA(from) && isZoneA(to))
			cost = 2.5;
		if (isZoneB(from) || isZoneB(to))
			cost = 3.0;
		return cost;
	}

	private boolean isZoneB(String city) {
		return zoneB.contains(city);
	}

	private boolean isZoneA(String city) {
		return zoneA.contains(city);
	}

}
