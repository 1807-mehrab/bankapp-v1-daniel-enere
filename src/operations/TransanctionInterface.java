package operations;

public interface TransanctionInterface {
	public void accountDeposit(double amountToDeposit);
	public void accountWithdrawal(double amountToWithdraw);
	public void internalTransfer(Account transferFromAcct, Account transferToAcct, double amountToTransfer);
}
