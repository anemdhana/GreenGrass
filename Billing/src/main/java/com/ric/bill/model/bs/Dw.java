package com.ric.bill.model.bs;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.ric.bill.Simple;

/*
 * Значение параметра объекта
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "U_HFPXKLSK", schema="ORALV")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region="billCache")
public class Dw implements java.io.Serializable, Simple {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", updatable = false, nullable = false)
	private int id;
	
    @Column(name = "S1", updatable = true)
    private String s1;

    @Column(name = "NS1", updatable = true)
    private Double n1;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="FK_HFP", referencedColumnName="ID")
	@BatchSize(size = 20)
	private Par par; 

	public Dw() {
	}

	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public String getS1() {
		return s1;
	}
	public void setS1(String s1) {
		this.s1 = s1;
	}

	public Double getN1() {
		return n1;
	}

	public void setN1(Double n1) {
		this.n1 = n1;
	}	

	@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)	
	public Par getPar() {
		return par;
	}

	public void setPar(Par par) {
		this.par = par;
	}
	
	
}
