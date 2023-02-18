package com.example.demo.uce.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.example.demo.uce.modelo.DetalleFactura;
import com.example.demo.uce.modelo.Factura;

public interface IDetalleFacturaRepo {
	public List<DetalleFactura> buscaPorFechaCantidad(LocalDateTime fechaVenta, Integer cantidad);
}
