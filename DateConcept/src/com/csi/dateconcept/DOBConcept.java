package com.csi.dateconcept;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DOBConcept {
	public static void main(String[] args) {

		int productId = 121;

		String productName = "MI SMART TV";

		double productPrice = 3555.90;

		Date productLaunchDate = null;

		System.out.println("" + productName);

		String datePattern = "dd-MM-yyyy";

		SimpleDateFormat sdf = new SimpleDateFormat(datePattern);

		try {
			productLaunchDate = sdf.parse("28-09-2020");
		} catch (ParseException e) {

			e.printStackTrace();
		}

		String pldate = sdf.format(productLaunchDate);
		System.out.println("Product Launch Date: " + pldate);

	}
}
