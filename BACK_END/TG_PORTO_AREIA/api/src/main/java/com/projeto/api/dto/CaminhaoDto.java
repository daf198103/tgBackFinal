package com.projeto.api.dto;

import java.io.Serializable;
import java.math.BigDecimal;


public class CaminhaoDto  implements Serializable{

	private static final long serialVersionUID = 1L;
	
	

	private String placaDoCavalo;
	private String cidadePlaca;
	private String estadoPlaca;
	private String tipoCaminhao;
	private String nomeMotorista;
	private String nomeEmpresa;
	private BigDecimal pesoTotalBruto;
	private BigDecimal tara;
	private boolean carregado;
	
	
	
	public CaminhaoDto(String placaCavalo, String cidadePlaca, String estadoPlaca,
			String tipoCam, String nomeMotorista, String empresa, BigDecimal pesoBruto, BigDecimal tara, boolean carregado ) 
	{

		this.placaDoCavalo = placaCavalo;
		this.cidadePlaca = cidadePlaca;
		this.estadoPlaca = estadoPlaca;
		this.tipoCaminhao = tipoCam;
		this.nomeMotorista = nomeMotorista;
		this.nomeEmpresa = empresa;
		this.pesoTotalBruto = pesoBruto;
		this.tara = tara;
		this.carregado = carregado;
	}


	public String getPlacaDoCavalo() {
		return placaDoCavalo;
	}


	public void setPlacaDoCavalo(String placaDoCavalo) {
		this.placaDoCavalo = placaDoCavalo;
	}


	public String getCidadePlaca() {
		return cidadePlaca;
	}


	public void setCidadePlaca(String cidadePlaca) {
		this.cidadePlaca = cidadePlaca;
	}


	public String getEstadoPlaca() {
		return estadoPlaca;
	}


	public void setEstadoPlaca(String estadoPlaca) {
		this.estadoPlaca = estadoPlaca;
	}


	public String getTipoCaminhao() {
		return tipoCaminhao;
	}


	public void setTipoCaminhao(String tipoCaminhao) {
		this.tipoCaminhao = tipoCaminhao;
	}


	public String getNomeMotorista() {
		return nomeMotorista;
	}


	public void setNomeMotorista(String nomeMotorista) {
		this.nomeMotorista = nomeMotorista;
	}


	public String getNomeEmpresa() {
		return nomeEmpresa;
	}


	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}


	public BigDecimal getPesoTotalBruto() {
		return pesoTotalBruto;
	}


	public void setPesoTotalBruto(BigDecimal pesoTotalBruto) {
		this.pesoTotalBruto = pesoTotalBruto;
	}


	public BigDecimal getTara() {
		return tara;
	}


	public void setTara(BigDecimal tara) {
		this.tara = tara;
	}


	public boolean isCarregado() {
		return carregado;
	}


	public void setCarregado(boolean carregado) {
		this.carregado = carregado;
	}
	
	


	
		
}
