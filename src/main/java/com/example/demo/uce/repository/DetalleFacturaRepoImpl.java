package com.example.demo.uce.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.modelo.DetalleFactura;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public class DetalleFacturaRepoImpl implements IDetalleFacturaRepo{

	@Override
	public List<DetalleFactura> buscaPorFechaCantidad(LocalDateTime fechaVenta, Integer cantidad) {
		// TODO Auto-generated method stub
		return null;
	}


}
