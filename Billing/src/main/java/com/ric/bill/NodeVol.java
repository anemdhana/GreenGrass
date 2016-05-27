package com.ric.bill;

/**
 * Текущий расчет по узлу 
 * @author lev
 *
 */
public class NodeVol {

	//значения за расчетный период:
	private Double vol;//объем
	private Double partArea;//доля площади
	private Double partPers;//доля проживающих
	
	private int recur;//счетчик рекурсии

	public NodeVol(){
		vol  = new Double(0);
		partArea = new Double(0);
		partPers = new Double(0);
		setRecur(0);
	}
	
	//рекурсия +1
	public void addRecur() {
		setRecur(getRecur() + 1);
	}

	//рекурсия -1
	public void decRecur() {
		setRecur(getRecur() - 1);
	}

	public Double getVol() {
		return vol;
	}
	
	public void setVol(Double vol) {
		this.vol = vol;
	}
	
	public void addVol(Double vol) {
		this.vol = this.vol+vol;
	}

	public Double getPartArea() {
		return partArea;
	}
	
	public void setPartArea(Double partArea) {
		this.partArea = partArea;
	}
	
	public Double getPartPers() {
		return partPers;
	}
	
	public void setPartPers(Double partPers) {
		this.partPers = partPers;
	}

	public int getRecur() {
		return recur;
	}

	public void setRecur(int recur) {
		this.recur = recur;
	}
	
}
