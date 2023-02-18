package com.example.demo.uce.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.DetalleFactura;
import com.example.demo.uce.modelo.FacturaReporte;
import com.example.demo.uce.modelo.VentaFac;
import com.example.demo.uce.repository.IDetalleFacturaRepo;

@Service
public class FacturaServiceImpl implements IFacturaService{
	@Autowired
	private IDetalleFacturaRepo iDetalleFacturaRepo;
	@Override
	public List<VentaFac> buscaPorFecha(LocalDateTime fechaVenta, String categoria, Integer cantidad) {
		// TODO Auto-generated method stub
//		List<Factura> detalles = this.iDetalleFacturaRepo.buscaPorFechaCantidad(fechaVenta, cantidad);
//		List<FacturaReporte> facturaReporte = new ArrayList<>();
//		for (DetalleFactura d : detalles) {
//				FacturaReporte venta = new FacturaReporte();
//				venta.setCodigoBarras(d.getProducto().getCodigoBarra());
//				venta.setNombre(d.getProducto().getNombre());
//				venta.setCantidad(d.getCantidad());
//				venta.setPrecioUnitario(d.getPrecioUnitario());
//				venta.setSubtotal(d.getSubtotal());
//				facturaReporte.add(venta);
//			
//		}
//
		return null;
	}

}
