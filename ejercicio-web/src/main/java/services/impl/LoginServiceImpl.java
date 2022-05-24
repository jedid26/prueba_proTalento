package services.impl;

import at.favre.lib.crypto.bcrypt.BCrypt;
import dao.SociosDao;
import dao.UserDao;
import exceptions.GenericException;
import dao.impl.SocioDaoImpl;
import dao.impl.UserDaoImpl;
import domain.Socios;
import domain.Users;
import services.LoginService;
import services.exceptions.ServiceException;

public class LoginServiceImpl implements LoginService {

	private UserDao userDao;
	private SociosDao socioDao;
	
	public LoginServiceImpl() {
		this.userDao = new UserDaoImpl();
		this.socioDao = new SocioDaoImpl();
	}
	
	@Override
	public Users getUserByUserNameAndPassword(String username, String passwordFromHtml) throws ServiceException {
		try {
			Users users = this.userDao.getUserByUserName(username);
			
			if(users != null) {
				//valido password
				
				BCrypt.Result result = BCrypt.verifyer().verify(passwordFromHtml.getBytes(), users.getPassword().getBytes());				
				if(!result.verified) {
					throw new ServiceException("Usuario/Password incorrectos", null);
				}
			
				Socios socio = this.socioDao.getSociosByUserId(users.getId());
				users.setSocio(socio);
			}
			return users;
		} catch (GenericException e) {
			throw new ServiceException(e.getMessage(), e);
		}
	}

}
