
package org.tnsif.framework;

public abstract class SavingAcc extends BankAcc {
	
	private boolean isSalary;
	private static final float creditLimit=0.0f;
	public SavingAcc(int accNo, String accNm, float accBal,boolean isSalary)
	{
		super(accNo, accNm, accBal);
		this.isSalary=isSalary;
	}
	public void withdraw(float charges)
	{
		System.out.println(" Acc no:"+this.getAccNo()+" Acc name: "+this.getAccNm()+
				" "+" creditLimit :"+(this.getAccBal()+this.creditLimit));
	}
	@Override
	public String toString() {
		return String.format("SavingAcc [isSalary=%s]", isSalary);
	}
	
	

}
