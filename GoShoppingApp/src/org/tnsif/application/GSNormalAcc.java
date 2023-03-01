package org.tnsif.application;

import org.tnsif.framework.NormalAcc;

public abstract class GSNormalAcc extends NormalAcc {

	public GSNormalAcc(int accno, String accna, float charges, float delivaryCharges) {
		super(accno, accna, charges, delivaryCharges);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "GSNormalAcc [toString()=" + super.toString() + "]";
	}
	

}
