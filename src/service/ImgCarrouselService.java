package service;

import java.util.List;

import exceptions.DuplicatedException;
import models.ImgCarrousel;

public interface ImgCarrouselService {
	
	public List<ImgCarrousel> findAll();
	
	public void updateImgById(ImgCarrousel newImg) throws DuplicatedException; 
	
}
