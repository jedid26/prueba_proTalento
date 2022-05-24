package dao;

import domain.Socios;

public interface ICrud {

	public Socios create(Socios socioACrear);
	
	public Socios findById(Long id);
	
	public Socios[] findAll();
	//despues completo los demas
}
