package com.example.demo.uce.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.modelo.Item;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ItemRepoImpl implements IItemRepo {
	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public void insertar(Item item) {
		// TODO Auto-generated method stub
		this.entityManager.persist(item);
	}

	@Override
	public void modificar(Item item) {
		// TODO Auto-generated method stub
		this.entityManager.merge(item);
	}

	@Override
	public Item buscarItem(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
