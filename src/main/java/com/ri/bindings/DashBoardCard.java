package com.ri.bindings;

public class DashBoardCard {

	private Integer plansCnt;
	private Integer approvedCnt;
	private Integer deniedCnt;
	private Double benifitAmtGiven;
	public DashBoardCard() {
		super();
	}
	public DashBoardCard(Integer plansCnt, Integer approvedCnt, Integer deniedCnt, Double benifitAmtGiven) {
		super();
		this.plansCnt = plansCnt;
		this.approvedCnt = approvedCnt;
		this.deniedCnt = deniedCnt;
		this.benifitAmtGiven = benifitAmtGiven;
	}
	public Integer getPlansCnt() {
		return plansCnt;
	}
	public void setPlansCnt(Integer plansCnt) {
		this.plansCnt = plansCnt;
	}
	public Integer getApprovedCnt() {
		return approvedCnt;
	}
	public void setApprovedCnt(Integer approvedCnt) {
		this.approvedCnt = approvedCnt;
	}
	public Integer getDeniedCnt() {
		return deniedCnt;
	}
	public void setDeniedCnt(Integer deniedCnt) {
		this.deniedCnt = deniedCnt;
	}
	public Double getBenifitAmtGiven() {
		return benifitAmtGiven;
	}
	public void setBenifitAmtGiven(Double benifitAmtGiven) {
		this.benifitAmtGiven = benifitAmtGiven;
	}
}
