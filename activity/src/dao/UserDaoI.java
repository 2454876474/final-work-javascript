package dao;

import convenience.util.BaseException;
import model.BeanUser;

public interface UserDaoI {
	/** ����û� */
	 public void addUser();
	 /** ɾ���û� */
	 public void delUser();
	 /** �����û� */
	 public void updateUser();
	 public BeanUser searchUser(int rank) throws BaseException;
	 public void addgrade(BeanUser user) throws BaseException;
}
