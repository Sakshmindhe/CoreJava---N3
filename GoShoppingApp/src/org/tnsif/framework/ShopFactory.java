package org.tnsif.framework;

public abstract class ShopFactory {
	//abstract method 
	public abstract PrimeAcc  getNewPrimeAcc(int accno,String Accnm,float charges,boolean isPrime);
	public abstract NormalAcc getNewNormalAcc(int accno,String Accnm,float charges,boolean delivaryCharges);

}
