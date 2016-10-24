package org.scmad.clamcard;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)
public class ClamCardFixture {
	public String travel(String from, String to) {
		double cost = new ClamCard().travel(from, to);
		return format(cost);
	}

	private String format(double cost) {
		DecimalFormatSymbols symbols = new DecimalFormatSymbols(
				Locale.getDefault());
		symbols.setDecimalSeparator('.');
		symbols.setGroupingSeparator(',');
		DecimalFormat decimalFormat = new DecimalFormat("#.00",
				symbols);
		return decimalFormat.format(cost);
	}
}
