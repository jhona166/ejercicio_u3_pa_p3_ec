package com.example.demo.uce.service;

import com.example.demo.uce.modelo.Item;

public interface IItemService {
	public void insertar(Item item);
	public void modificar(Item item);
	public Item buscarItem(Integer id);
}
