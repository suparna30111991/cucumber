package sele;

public class Mainclass_thread {

	public static void main(String[] args) throws InterruptedException {
		Bank_acount acc1=new Bank_acount(2000);
		TxnDeposit d1=new TxnDeposit(acc1, 500);
		TxnDeposit d2=new TxnDeposit(acc1, 1000);
		TxnWithdraw w1=new TxnWithdraw(acc1, 6000);
		TxnWithdraw w2=new TxnWithdraw(acc1, 600);
		d1.start();
		d2.start();
		w1.start();
		w2.start();
		Thread.sleep(1000);
		acc1.checkbal();

	}

}
