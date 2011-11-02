package package1;

public class Tracert {
	private long quoteId;
	private double originalBid;
	private double originalAsk;
	private Long filtedId;
	private Boolean isSpike;
	public long getQuoteId() {
		return quoteId;
	}
	public void setQuoteId(long quoteId) {
		this.quoteId = quoteId;
	}
	public double getOriginalBid() {
		return originalBid;
	}
	public void setOriginalBid(double originalBid) {
		this.originalBid = originalBid;
	}
	public double getOriginalAsk() {
		return originalAsk;
	}
	public void setOriginalAsk(double originalAsk) {
		this.originalAsk = originalAsk;
	}
	public Long getFiltedId() {
		return filtedId;
	}
	public void setFiltedId(Long filtedId) {
		this.filtedId = filtedId;
	}
	public Boolean getIsSpike() {
		return isSpike;
	}
	public void setIsSpike(Boolean isSpike) {
		this.isSpike = isSpike;
	}
	
	
}
