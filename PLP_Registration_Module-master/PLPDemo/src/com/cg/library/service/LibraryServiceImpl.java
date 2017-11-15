package com.cg.library.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.library.dao.ILibraryDao;
import com.cg.library.model.LibraryUser;

@Service
@Transactional
public class LibraryServiceImpl implements ILibraryService
{
	@Autowired
    private ILibraryDao dao;
    

	@Override
	public void register(LibraryUser user)
	{
	 dao.register(user);	
	}

}
