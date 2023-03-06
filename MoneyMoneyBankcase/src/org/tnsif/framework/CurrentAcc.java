
package org.tnsif.framework;

public abstract class CurrentAcc extends BankAcc {
	
	final private float creditLimit;

	// generate with fields
	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
	}

	//tostring method
	@Override
	public String toString() {
		return String.format("CurrentAcc [creditLimit=%s]", creditLimit);
	}
	
	public void withdraw(float charges)
	{
		System.out.println(" Acc no:"+this.getAccNo()+" Acc name: "+this.getAccNm()+
				" "+" creditLimit :"+(this.getAccBal()+this.creditLimit));
	}
	
}
