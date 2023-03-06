package org.tnsif.application;

import org.tnsif.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {

	// create constructor from extended class
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal, isSalary);
		// TODO Auto-generated constructor stub
	}

	// tostring method
	@Override
	public String toString() {
		return "MMSavingAcc [toString()=" + super.toString() + "]";
	}

}