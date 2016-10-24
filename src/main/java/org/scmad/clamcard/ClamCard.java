package org.scmad.clamcard;

import java.util.ArrayList;

public class ClamCard {
	ArrayList zoneA = new ArrayList() {
		{
			add("Asterisk");
			add("Antelope");
			add("Aldgate");
			add("Angel");
		}
	};

	public double travel(String from, String to) {
		return ((isZoneA(from) && isZoneA(to)) ? 2.5 : 0.0);
	}

	private boolean isZoneA(String from) {
		return zoneA.contains(from);
	}

}
