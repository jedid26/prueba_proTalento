package services.impl;

import dao.impl.CategoriaDaoImpl;
import domain.Categorias;
import services.CategoriaService;

public class CategoriaServiceImpl extends AbstractBaseService<Categorias> implements CategoriaService{
	
	public CategoriaServiceImpl() {
		super(new CategoriaDaoImpl());
	}
}
