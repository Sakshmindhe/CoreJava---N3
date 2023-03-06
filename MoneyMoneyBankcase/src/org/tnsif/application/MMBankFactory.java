
package org.tnsif.application;

import org.tnsif.framework.BankFactory;
/*import org.tnsif.framework.CurrentAcc;
import org.tnsif.framework.SavingAcc;*/  

public class MMBankFactory extends BankFactory {

	@Override
	public MMSavingAcc getNewSavingAcc(int accNo, String accNm, float accBal, boolean isSalary) 
	{
		MMSavingAcc s=new MMSavingAcc(accNo,accNm,accBal,isSalary);
		return s;
	}

	@Override
	public MMCurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) 
	{
		MMCurrentAcc c=new MMCurrentAcc(accNo,accNm,accBal,creditLimit);
		return c;
	}

}