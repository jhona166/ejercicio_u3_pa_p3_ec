package com.example.demo.uce.service;

import java.time.LocalDateTime;
import java.util.List;

import com.example.demo.uce.modelo.VentaFac;

public interface IFacturaService {

	public List<VentaFac> buscaPorFecha(LocalDateTime fechaVenta, String categoria, Integer cantidad);
	
}
