package dao;

import java.util.List;

import exceptions.DuplicatedException;
import models.ImgCarrousel;

public interface ImgCarrouselDao {
	
	public List<ImgCarrousel> findAll();
	
	public void updateImgById(ImgCarrousel newImg);
	
}
