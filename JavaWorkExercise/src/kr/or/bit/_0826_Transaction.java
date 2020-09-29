package kr.or.bit;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class _0826_Transaction {

	public static Calendar cal = Calendar.getInstance();
	public static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm");
	private String transactionDate;
	private String transactionTime;
	private String kind;
	private long amount;
	private long tbalance=0;
	//////////////////////////////////////////////////
	
	public _0826_Transaction(long amount) {
		this.amount = amount;

	}
	
	public String getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}
	public String getTransactionTime() {
		return transactionTime;
	}
	public void setTransactionTime(String transactionTime) {
		this.transactionTime = transactionTime;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmountDepoisit(long amount) {
		this.amount += amount;
	}

	public void setAmountWithdraw(long amount) {
		this.amount -= amount;
	}
	
	public long getTbalance() {
		return tbalance;
	}
	
	public void setTdeposit(long tbalance) {
		this.tbalance += tbalance;
	}
	
	public void setTwithdraw(long tbalance) {
		this.tbalance -= tbalance;
	}



	//////////////////////////////////////////////////
	@Override
	public String toString() {
		return "[구분: "+kind+ ", 거래금액: " + this.amount+", / " + dateFormat.format(cal.getTime())+"]";
	}
	
	
	
	
}
