package org.scmad.clamcard;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ClamCardTest {

	@Test
	public void whenTravelIntoZoneAPayTwoPointFive() {
		String from = "Asterisk";
		String to = "Antelope";
		assertEquals(2.5, new ClamCard().travel(from, to), 2);
	}

}
