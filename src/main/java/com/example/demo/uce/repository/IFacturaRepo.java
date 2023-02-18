package com.example.demo.uce.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.example.demo.uce.modelo.DetalleFactura;
import com.example.demo.uce.modelo.Factura;
import com.example.demo.uce.modelo.Item;

public interface IFacturaRepo {
	public void insertar(Item item);
	public List<Factura> buscaPorFechaCantidad(LocalDateTime fechaVenta, Integer cantidad);
}
