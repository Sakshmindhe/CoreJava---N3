package org.tnsif.application;

import org.tnsif.framework.PrimeAcc;

public abstract class GSPrimeAcc extends  PrimeAcc {

	public GSPrimeAcc(int accno, String accna, float charges, boolean isPrime) {
		super(accno, accna, charges,isPrime);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "GSPrimeAcc [toString()=" + super.toString() + "]";
	}
	



	}


