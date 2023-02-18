package com.example.demo.uce.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="factura")
public class Factura {
	//Id
//	• Número
//	• Fecha
//	• Cedula Cliente
//	• Total Venta
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "fact_sec")
	@SequenceGenerator(name = "fact_sec", sequenceName = "fact_sec", allocationSize = 1)
	@Column(name = "fact_id")
	private Integer id;

	@Column(name = "fact_numero")
	private String numero;

	@Column(name = "fact_fecha")
	private LocalDateTime fecha;

	@Column(name = "fact_cedula_cliente")
	private String cedulaCliente;

	@Column(name = "fact_total")
	private BigDecimal totalVenta;

	@OneToMany(mappedBy = "factura", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<DetalleFactura> detalles;

	

	@Override
	public String toString() {
		return "Factura [id=" + id + ", numero=" + numero + ", fecha=" + fecha + ", cedulaCliente=" + cedulaCliente
				+ ", totalVenta=" + totalVenta + ", detalles=" + detalles + "]";
	}

	// SET Y GET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public String getCedulaCliente() {
		return cedulaCliente;
	}

	public void setCedulaCliente(String cedulaCliente) {
		this.cedulaCliente = cedulaCliente;
	}

	public BigDecimal getTotalVenta() {
		return totalVenta;
	}

	public void setTotalVenta(BigDecimal totalVenta) {
		this.totalVenta = totalVenta;
	}

	public List<DetalleFactura> getDetalles() {
		return detalles;
	}

	public void setDetalles(List<DetalleFactura> detalles) {
		this.detalles = detalles;
	}
}
