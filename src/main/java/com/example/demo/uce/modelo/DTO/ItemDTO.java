package com.example.demo.uce.modelo.DTO;

public class ItemDTO {
	private String codigoBarra;
	private String nombre;
	private Integer Stock;
	
	public ItemDTO() {
		
	}
	
	
	
	public ItemDTO(String codigoBarra, String nombre, Integer stock) {
		super();
		this.codigoBarra = codigoBarra;
		this.nombre = nombre;
		Stock = stock;
	}



	@Override
	public String toString() {
		return "ItemDTO [codigoBarra=" + codigoBarra + ", nombre=" + nombre + ", Stock=" + Stock + "]";
	}
	
	
	//Set and Get
	public String getCodigoBarra() {
		return codigoBarra;
	}
	public void setCodigoBarra(String codigoBarra) {
		this.codigoBarra = codigoBarra;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getStock() {
		return Stock;
	}
	public void setStock(Integer stock) {
		Stock = stock;
	}
	

}
