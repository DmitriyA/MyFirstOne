package package1;

import java.util.Date;

public class Quote {

	private double bid;
	private double ask;
	private String symbol;
	private Date timestamp;
	private int pips = 5;

	public Quote() {
	}

	public Quote(double bid, double ask, String symbol, Date timestamp) {
		super();
		this.bid = bid;
		this.ask = ask;
		this.symbol = symbol;
		this.timestamp = timestamp;
	}

	public Quote(Double bid, Double ask, String symbol, Date timestamp, Integer pips) {
		super();
		this.bid = bid;
		this.ask = ask;
		this.symbol = symbol;
		this.timestamp = timestamp;
		this.pips = pips;
	}


	public void setQuote(double bid, double ask, String symbol, Date timestamp) {
		this.bid = bid;
		this.ask = ask;
		this.symbol = symbol;
		this.timestamp = timestamp;
	}
	
	public void setQuote(double bid, double ask, Date timestamp) {
		this.bid = bid;
		this.ask = ask;
		this.timestamp = timestamp;
	}
	
	public double getBid() {
		return bid;
	}

	public void setBid(Double bid) {
		this.bid = bid;
	}

	public double getAsk() {
		return ask;
	}

	public void setAsk(Double ask) {
		this.ask = ask;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	
	public int getPips() {
		return pips;
	}

	public void setPips(Integer pips) {
		this.pips = pips;
	}
	
	public void setPrice(Double bid, Double ask){
		this.bid = bid;
		this.ask = ask;
	}
	
	public Quote clone(){
		return new Quote(bid, ask, symbol, timestamp, pips);
	}
	
	@Override
	public String toString() {
		return "quote [symbol="+symbol+" bid="+bid+" ask="+ask+" time="+timestamp+" pipsCount="+getPips()+"]";
	}

}
