package com.ob.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import com.ob.model.Creditcard;

@Transactional
public interface CreditcardDAO {

	public void setSessionFactory(SessionFactory sessionFactory);

	public void save(Creditcard transientInstance);

	public void delete(Creditcard persistentInstance);

	public Creditcard findById(java.lang.Integer id);

	public List findByExample(Creditcard instance);

	public List findByProperty(String propertyName, Object value);

	public List findBySpassword(Object spassword);

	public List findByCpassword(Object cpassword);

	public List findByAmount(Object amount);

	public List findByIntegrate(Object integrate);

	public List findByIsloss(Object isloss);

	public List findByIsactive(Object isactive);

	public List findAll();

	public Creditcard merge(Creditcard detachedInstance);

	public void attachDirty(Creditcard instance);

	public void attachClean(Creditcard instance);
}