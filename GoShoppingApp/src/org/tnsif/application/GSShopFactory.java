
package org.tnsif.application;

import org.tnsif.framework.NormalAcc;
import org.tnsif.framework.PrimeAcc;
import org.tnsif.framework.ShopFactory;

public class GSShopFactory extends ShopFactory {

	@Override
	public GsPrimeAcc getNewPrimeAcc(int accno, String accnm, float charges, boolean isPrime) {
		// TODO Auto-generated method stub
		GsPrimeAcc g=new GsPrimeAcc(accno,accnm,charges,isPrime);
		return g;
		
	}

	@Override
	public GSNormalAcc getNewNormalAcc(int accno, String accnm, float charges, float deliveryCharges) {
		// TODO Auto-generated method stub
		GSNormalAcc n=new GSNormalAcc(accno,accnm,charges,deliveryCharges);
		return n;
		
		
	}

	
		
	}
	