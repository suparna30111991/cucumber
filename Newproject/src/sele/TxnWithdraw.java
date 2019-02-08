package sele;

public class TxnWithdraw extends Thread{
	Bank_acount acc;
	double amt;
	public TxnWithdraw(Bank_acount acct,double amt)
	{
	this.acc=acc;
	this.amt=amt;
	}
public void run()
{
	try {
		acc.withdraw(amt);
	}catch(InterruptedException e)
	{
		e.printStackTrace();
	}
	}
}
