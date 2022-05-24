package dao;

import domain.Socios;
import exceptions.GenericException;

public interface SociosDao extends GenericDao<Socios> {

	Socios getSociosByUserId(Long id) throws GenericException;

	/*public Socios getOne(Long id);
	
	public void delete(Long id);
	
	public Socios save(Socios entity);
	
	public void update(Socios entity);
	
	public Socios[] findAll();*/
}
