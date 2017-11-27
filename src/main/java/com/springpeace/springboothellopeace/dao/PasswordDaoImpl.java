package com.springpeace.springboothellopeace.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springpeace.springboothellopeace.model.MyPassword;

@Transactional
@Repository
public class PasswordDaoImpl implements PasswordDao{

	@PersistenceContext	
	private EntityManager entityManager;
	
	@Override
	public void addMyPassword(MyPassword myPassword) {
		entityManager.persist(myPassword);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<MyPassword> getAllMyPassword() {
		String hql = "FROM MyPassword";
		return (List<MyPassword>) entityManager.createQuery(hql).getResultList();
	}
	
	@Override
	public MyPassword getMyPasswordById(int id) {
		return entityManager.find(MyPassword.class, id);
	}
	
	@Override
	public MyPassword getMyPasswordByApplication(String application) {
		String hql = "from MyPassword where application = ?1";
		TypedQuery<MyPassword> query = entityManager.createQuery(hql, MyPassword.class);
		query.setParameter(1, application);
		List<MyPassword> listMyPassword = query.getResultList();
		
		return listMyPassword.get(0);
	}
	
	@Override
	public MyPassword getMyPasswordByUserName(String userName) {
		String hql = "from MyPassword where userName = ?1";
		TypedQuery<MyPassword> query = entityManager.createQuery(hql, MyPassword.class);
		query.setParameter(1, userName);
		List<MyPassword> listMyPassword = query.getResultList();
		
		return listMyPassword.get(0);
	}
	@Override
	public int updateMyPassword(MyPassword myPassword) {
		try {
			MyPassword mp = getMyPasswordById(myPassword.getId());
			mp.setPassword(myPassword.getPassword());
			entityManager.flush();
			return 200;
		}catch(Exception e){
			System.out.println(e.getMessage()+"DSADsadsafdgfds################");
			return 500;
			
		}
		/*MyPassword mp = getMyPasswordById(myPassword.getId());
		if(mp==null) {
			return 500;
		}else {
			mp.setPassword(myPassword.getPassword());
			entityManager.flush();
			return 200;
		}
		*/
	}
	
	@Override
	public void deleteMyPassword(int id) {
		entityManager.remove(getMyPasswordById(id));
	}
}
