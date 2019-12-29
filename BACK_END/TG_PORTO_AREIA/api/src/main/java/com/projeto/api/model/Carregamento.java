package com.projeto.api.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="CRG_CRREGAMENTO")
public class Carregamento implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="CRG_ID")
	@GeneratedValue
	private Long id;
	
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "caminhao_id", nullable = false)
	@JsonIgnore
	private Caminhao caminhao;
	
		
	@Column(name="CRG_CARGA_CARREGADA",length=10)
	private BigDecimal cargaCarregada;
	
	@Column(name="CRG_DATA_HORA_CARREGAMENTO",length=50)
	private Timestamp dataHoraCarregamento;
	
	
	
	public Carregamento() {
		
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public Caminhao getCaminhao() {
		return caminhao;
	}



	public void setCaminhao(Caminhao caminhao) {
		this.caminhao = caminhao;
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



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((caminhao == null) ? 0 : caminhao.hashCode());
		result = prime * result + ((cargaCarregada == null) ? 0 : cargaCarregada.hashCode());
		result = prime * result + ((dataHoraCarregamento == null) ? 0 : dataHoraCarregamento.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carregamento other = (Carregamento) obj;
		if (caminhao == null) {
			if (other.caminhao != null)
				return false;
		} else if (!caminhao.equals(other.caminhao))
			return false;
		if (cargaCarregada == null) {
			if (other.cargaCarregada != null)
				return false;
		} else if (!cargaCarregada.equals(other.cargaCarregada))
			return false;
		if (dataHoraCarregamento == null) {
			if (other.dataHoraCarregamento != null)
				return false;
		} else if (!dataHoraCarregamento.equals(other.dataHoraCarregamento))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	
}



	
