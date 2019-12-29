package com.projeto.api.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;



public class CarregamentoDto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private Integer caminhaoID;
	private Integer  operadorID;
	private BigDecimal cargaCarregada;
	private Timestamp dataHoraCarregamento;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getCaminhaoID() {
		return caminhaoID;
	}
	public void setCaminhaoID(Integer caminhaoID) {
		this.caminhaoID = caminhaoID;
	}
	public Integer getOperadorID() {
		return operadorID;
	}
	public void setOperadorID(Integer operadorID) {
		this.operadorID = operadorID;
	}
	public BigDecimal getCargaCarregada() {
		return cargaCarregada;
	}
	public void setCargaCarregada(BigDecimal cargaCarregada) {
		this.cargaCarregada = cargaCarregada;
	}
	public Timestamp getDataHoraCarregamento() {
		return dataHoraCarregamento;
	}
	public void setDataHoraCarregamento(Timestamp dataHoraCarregamento) {
		this.dataHoraCarregamento = dataHoraCarregamento;
	}
	
	
}
