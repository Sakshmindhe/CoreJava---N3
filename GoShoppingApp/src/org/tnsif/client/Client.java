
package org.tnsif.client;

import org.tnsif.application.GSNormalAcc;
import org.tnsif.application.GSShopFactory;
import org.tnsif.application.GSPrimeAcc;
import org.tnsif.framework.ShopFactory;

public class Client {
	public static void main(String args[])
	{
		GSShopFactory s= new GSShopFactory();
		GSPrimeAcc g=new GSPrimeAcc(123, "Sakshi Mindhe ", 908f, true);
		GSNormalAcc n=new GSNormalAcc(124,"Pranjal",8956f,90f);
		//prime acc
		System.out.println("Prime Acc");
		System.out.println(g);
		g.bookProduct(g.getCharges());
		
		//normal acc
		System.out.print("Normal Acc");
		System.out.print(n);
		n.bookProduct(n.getCharges());
		
	}

}