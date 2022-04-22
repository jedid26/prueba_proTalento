package service.impl;

import java.util.List;

import dao.ImgCarrouselDao;
import dao.impl.ImgCarrouselDaoImpl;
import exceptions.DuplicatedException;
import models.ImgCarrousel;
import service.ImgCarrouselService;

public class ImgCarrouselServiceImpl implements ImgCarrouselService {
	
	ImgCarrouselDao dao = new ImgCarrouselDaoImpl();
	
	@Override
	public List<ImgCarrousel> findAll() {		
		return dao.findAll();
	}

	@Override
	public void updateImgById(ImgCarrousel newImg) throws DuplicatedException {
		dao.updateImgById(newImg);
	}
	
}
