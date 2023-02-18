package com.example.demo.uce.repository;

import com.example.demo.uce.modelo.Item;

public interface IItemRepo {
	public void insertar(Item item);
	public void modificar(Item item);
	public Item buscarItem(Integer id);
	
}
