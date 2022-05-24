package dao;

import domain.Users;
import exceptions.GenericException;

public interface UserDao {

	public Users getUserByUserName(String usename) throws GenericException;
}
