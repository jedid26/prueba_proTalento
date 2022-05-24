package services.impl;

import dao.impl.MarcasDaoImpl;
import domain.Marcas;
import services.MarcasService;

public class MarcasServiceImpl extends AbstractBaseService<Marcas> implements MarcasService{
	
	public MarcasServiceImpl() {
		super(new MarcasDaoImpl());
	}
}
