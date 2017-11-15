package com.cg.library.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cg.library.model.LibraryUser;

@Repository
public class LibraryDaoImpl implements ILibraryDao
{
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void register(LibraryUser user) 
	{
		entityManager.persist(user);	
		 
	}

}
