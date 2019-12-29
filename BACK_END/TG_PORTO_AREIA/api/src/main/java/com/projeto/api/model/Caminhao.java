package com.projeto.api.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;




@Entity
@Table(name="CMN_CAMINHAO")
public class Caminhao implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@Column(name="CMN_ID")
	@NotNull
	@GeneratedValue
	private Long id;
	
    @OneToMany(mappedBy = "caminhao", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Carregamento> carregamento;
	
	@Column(name="CMN_PLACA_CAVALO",length = 7)
	private String placaDoCavalo;
	
	@Column(name="CMN_CIDADE_PLACA",length = 50)
	private String cidadePlaca;
	
	@Column(name="CMN_ESTADO_PLACA",length = 2)
	private String estadoPlaca;
	
	@Column(name="CMN_TIPO_CAMINHAO",length = 50)
	private String tipoCaminhao;
	
	@Column(name="CMN_NOME_MOTORISTA",length = 50)
	private String nomeMotorista;
	
	@Column(name="CMN_NOME_EMPRESA",length=50)
	private String nomeEmpresa;
	
	@Column(name="CMN_PESO_BRUTO_TOTAL",length=10)
	private BigDecimal pesoTotalBruto;
	
	@Column(name="CMN_TARA",length=10)
	private BigDecimal tara;
	
	@Column(name="CMN_CARREGADO",length=1)
	private boolean carregado;
	
	public Caminhao() {
		
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Set<Carregamento> getCarregamento() {
		return carregamento;
	}


	public void setCarregamento(Set<Carregamento> carregamento) {
		this.carregamento = carregamento;
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


	/*
	 * @Override public int hashCode() { final int prime = 31; int result = 1;
	 * result = prime * result + ((carregamento == null) ? 0 :
	 * carregamento.hashCode()); result = prime * result + ((cidadePlaca == null) ?
	 * 0 : cidadePlaca.hashCode()); result = prime * result + ((estadoPlaca == null)
	 * ? 0 : estadoPlaca.hashCode()); result = prime * result + ((id == null) ? 0 :
	 * id.hashCode()); result = prime * result + ((nomeEmpresa == null) ? 0 :
	 * nomeEmpresa.hashCode()); result = prime * result + ((nomeMotorista == null) ?
	 * 0 : nomeMotorista.hashCode()); result = prime * result + ((pesoTotalBruto ==
	 * null) ? 0 : pesoTotalBruto.hashCode()); result = prime * result +
	 * ((placaDoCavalo == null) ? 0 : placaDoCavalo.hashCode()); result = prime *
	 * result + ((tara == null) ? 0 : tara.hashCode()); result = prime * result +
	 * ((tipoCaminhao == null) ? 0 : tipoCaminhao.hashCode()); return result; }
	 */


	


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Caminhao other = (Caminhao) obj;
		if (carregamento == null) {
			if (other.carregamento != null)
				return false;
		} else if (!carregamento.equals(other.carregamento))
			return false;
		if (cidadePlaca == null) {
			if (other.cidadePlaca != null)
				return false;
		} else if (!cidadePlaca.equals(other.cidadePlaca))
			return false;
		if (estadoPlaca == null) {
			if (other.estadoPlaca != null)
				return false;
		} else if (!estadoPlaca.equals(other.estadoPlaca))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nomeEmpresa == null) {
			if (other.nomeEmpresa != null)
				return false;
		} else if (!nomeEmpresa.equals(other.nomeEmpresa))
			return false;
		if (nomeMotorista == null) {
			if (other.nomeMotorista != null)
				return false;
		} else if (!nomeMotorista.equals(other.nomeMotorista))
			return false;
		if (pesoTotalBruto == null) {
			if (other.pesoTotalBruto != null)
				return false;
		} else if (!pesoTotalBruto.equals(other.pesoTotalBruto))
			return false;
		if (placaDoCavalo == null) {
			if (other.placaDoCavalo != null)
				return false;
		} else if (!placaDoCavalo.equals(other.placaDoCavalo))
			return false;
		if (tara == null) {
			if (other.tara != null)
				return false;
		} else if (!tara.equals(other.tara))
			return false;
		if (tipoCaminhao == null) {
			if (other.tipoCaminhao != null)
				return false;
		} else if (!tipoCaminhao.equals(other.tipoCaminhao))
			return false;
		return true;
	}
	
	




	
}
