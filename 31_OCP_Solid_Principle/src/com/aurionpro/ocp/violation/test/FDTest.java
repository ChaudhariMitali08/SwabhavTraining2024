package com.aurionpro.ocp.violation.test;

import com.aurionpro.ocp.violation.model.FestivalType;
import com.aurionpro.ocp.violation.model.FixedDeposit;

public class FDTest {

	public static void main(String[] args) {
		FixedDeposit FD1 = new FixedDeposit(123, "Suhas", 22000.0, 5, FestivalType.OTHERS);
		System.out.println(FD1.getInterestRates());
		System.out.println("Simple interest after "+FD1.getDuration()+" years : "+FD1.simpleInterest());

	}

}
