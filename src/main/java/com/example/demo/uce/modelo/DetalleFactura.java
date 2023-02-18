package com.example.demo.uce.modelo;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "detalle_factura")
@NamedQuery(name = "DetalleFactura.buscarPorFechaCantidad", query = "SELECT d FROM DetalleVenta d JOIN d.factura v WHERE v.fecha >= :fecha AND d.cantidad >= :datoCantidad")
public class DetalleFactura {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "defa_sec")
	@SequenceGenerator(name = "defa_sec", sequenceName = "defa_sec", allocationSize = 1)
	@Column(name = "defa_id")
	private Integer id;

	@Column(name = "defa_cantidad")
	private Integer cantidad;

	@Column(name = "defa_precio_unitario")
	private BigDecimal precioUnitario;

	@Column(name = "defa_subtotal")
	private BigDecimal subtotal;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "defa_id_producto")
	private Item item;

	@ManyToOne
	@JoinColumn(name = "defa_id_venta")
	private Factura factura;

	

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	@Override
	public String toString() {
		return "DetalleFactura [id=" + id + ", cantidad=" + cantidad + ", precioUnitario=" + precioUnitario
				+ ", subtotal=" + subtotal + ", item=" + item + ", factura=" + factura + "]";
	}

	// SET Y GET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public BigDecimal getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(BigDecimal precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public BigDecimal getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}



}
