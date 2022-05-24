package services.impl;

import dao.CategoriaDao;
import dao.MarcasDao;
import exceptions.GenericException;
import dao.impl.ArticulosDaoImpl;
import dao.impl.CategoriaDaoImpl;
import dao.impl.MarcasDaoImpl;
import domain.Articulos;
import domain.Categorias;
import domain.Marcas;
import services.ArticulosServices;
import services.exceptions.ServiceException;

public class ArticulosServicesImpl extends AbstractBaseService<Articulos> implements ArticulosServices {

	//usar otros daos
	private CategoriaDao categoriaDao;
	private MarcasDao marcasDao;
	
	public ArticulosServicesImpl() {
		super(new ArticulosDaoImpl());
		this.categoriaDao = new CategoriaDaoImpl();
		this.marcasDao = new MarcasDaoImpl();		
	}

	@Override
	public Articulos getOne(Long id) throws ServiceException {
		try {
			Articulos articulo = this.genericDao.getOne(id);
			Marcas marcaDelArticulo = this.marcasDao.getOne(articulo.getMarcasId());
			Categorias categoriaDelArticulo = this.categoriaDao.getOne(articulo.getCategoriasId());
			
			articulo.setMarca(marcaDelArticulo);
			articulo.setCategoria(categoriaDelArticulo);
			return articulo;
		} catch (GenericException e) {
			throw new ServiceException(e.getMessage(), e);
		}
	}
}
