package services.impl;

import dao.impl.SocioDaoImpl;
import domain.Socios;
import services.SociosService;

public class SociosServiceImpl extends AbstractBaseService<Socios> implements SociosService {

	public SociosServiceImpl() {
		super(new SocioDaoImpl());
	}

}
