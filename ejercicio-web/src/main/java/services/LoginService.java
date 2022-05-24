package services;

import domain.Users;
import services.exceptions.ServiceException;

public interface LoginService {

	Users getUserByUserNameAndPassword(String username,String password) throws ServiceException;
}
