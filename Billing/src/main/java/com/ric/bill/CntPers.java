package com.ric.bill;

import java.util.Set;

import com.ric.bill.model.ps.Registrable;

/**
 * Хранение кол-ва проживающих, записи о их регистрациях
 * @author lev
 *
 */
public class CntPers {
	
	public int cnt; //кол-во проживающих
	public int cntEmpt; //кол-во проживающих для анализа пустых квартир
	public Set<Registrable> reg; //постоянная регистрация 
	public Set<Registrable> regSt; //временная регистрация-отсутствие
	
}