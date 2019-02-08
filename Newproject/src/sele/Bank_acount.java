package sele;

public class Bank_acount {
 double accbal;
		Bank_acount(double accbal)
		{
			this.accbal=accbal;
		}
		void dipost(double amt)
		{
			accbal=accbal+amt;
			System.out.println("amount deposited "+amt);
			notifyAll();
		}
	synchronized void withdraw(double amt) throws InterruptedException
	{
		wait();
		accbal=accbal-amt;
		System.out.println("amount withdraw is "+amt);
	}
	void checkbal()
	{
		System.out.println("total balance is "+accbal);
	}

}
