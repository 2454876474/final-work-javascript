package dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import convenience.util.BaseException;
import convenience.util.HibernateUtil;
import model.BeanUser;

@Repository
public class UserDao implements UserDaoI{
	public UserDao(){
	      System.out.println("UserDao Constructor...\n\n\n\n\n\n");
	}
	@Override
	public void addUser() {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void delUser() {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void updateUser() {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public BeanUser searchUser(int rank) throws BaseException{
		// TODO �Զ����ɵķ������
		Session s = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tx = s.beginTransaction();
		String hql = "from BeanUser where rank = '" + rank + "'";
		Query qry = s.createQuery(hql);
		Object user = qry.uniqueResult();
		tx.commit();
		return (BeanUser)user;
	}
	
	@Override
	public void addgrade(BeanUser user) throws BaseException{
		// TODO �Զ����ɵķ������
		Session s = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction tx = s.beginTransaction();
		s.update(user);
		tx.commit();
		}


}
