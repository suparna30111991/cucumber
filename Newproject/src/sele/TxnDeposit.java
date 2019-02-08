package sele;

public class TxnDeposit extends Thread {
Bank_acount acc;
double amt;
public TxnDeposit(Bank_acount acc,double amt)
{
	this.acc=acc;
	this.amt=amt;;
}
public void run()
{
	acc.dipost(amt);
	}
}
