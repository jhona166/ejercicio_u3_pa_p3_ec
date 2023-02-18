package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.Item;
import com.example.demo.uce.repository.IItemRepo;
@Service
public class ItemServiceImpl implements IItemService{
	@Autowired
	private IItemRepo iItemRepo;
	@Override
	public void insertar(Item item) {
		// TODO Auto-generated method stub
		
		this.iItemRepo.insertar(item);
	}

	@Override
	public void modificar(Item item) {
		// TODO Auto-generated method stub
		this.iItemRepo.modificar(item);
	}

	@Override
	public Item buscarItem(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
