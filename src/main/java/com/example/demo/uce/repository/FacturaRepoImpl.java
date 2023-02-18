package com.example.demo.uce.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.modelo.Factura;
import com.example.demo.uce.modelo.Item;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public class FacturaRepoImpl implements IFacturaRepo {

	@Override
	public void insertar(Item item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Factura> buscaPorFechaCantidad(LocalDateTime fechaVenta, Integer cantidad) {
		// TODO Auto-generated method stub
		return null;
	}

}
