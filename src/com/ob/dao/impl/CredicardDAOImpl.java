package com.ob.dao.impl;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;

import com.ob.dao.CreditcardDAO;
import com.ob.model.Creditcard;

public class CredicardDAOImpl implements CreditcardDAO {
	private static final Logger log = LoggerFactory
			.getLogger(CreditcardDAO.class);
	// property constants
	public static final String SPASSWORD = "spassword";
	public static final String CPASSWORD = "cpassword";
	public static final String AMOUNT = "amount";
	public static final String INTEGRATE = "integrate";
	public static final String ISLOSS = "isloss";
	public static final String ISACTIVE = "isactive";

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	protected void initDao() {
		// do nothing
	}

	public void save(Creditcard transientInstance) {
		log.debug("saving Creditcard instance");
		try {
			getCurrentSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Creditcard persistentInstance) {
		log.debug("deleting Creditcard instance");
		try {
			getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Creditcard findById(java.lang.Integer id) {
		log.debug("getting Creditcard instance with id: " + id);
		try {
			Creditcard instance = (Creditcard) getCurrentSession().get(
					"com.ob.model.Creditcard", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Creditcard instance) {
		log.debug("finding Creditcard instance by example");
		try {
			List results = getCurrentSession()
					.createCriteria("com.ob.model.Creditcard")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Creditcard instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Creditcard as model where model."
					+ propertyName + "= ?";
			Query queryObject = getCurrentSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findBySpassword(Object spassword) {
		return findByProperty(SPASSWORD, spassword);
	}

	public List findByCpassword(Object cpassword) {
		return findByProperty(CPASSWORD, cpassword);
	}

	public List findByAmount(Object amount) {
		return findByProperty(AMOUNT, amount);
	}

	public List findByIntegrate(Object integrate) {
		return findByProperty(INTEGRATE, integrate);
	}

	public List findByIsloss(Object isloss) {
		return findByProperty(ISLOSS, isloss);
	}

	public List findByIsactive(Object isactive) {
		return findByProperty(ISACTIVE, isactive);
	}

	public List findAll() {
		log.debug("finding all Creditcard instances");
		try {
			String queryString = "from Creditcard";
			Query queryObject = getCurrentSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Creditcard merge(Creditcard detachedInstance) {
		log.debug("merging Creditcard instance");
		try {
			Creditcard result = (Creditcard) getCurrentSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Creditcard instance) {
		log.debug("attaching dirty Creditcard instance");
		try {
			getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Creditcard instance) {
		log.debug("attaching clean Creditcard instance");
		try {
			getCurrentSession().buildLockRequest(LockOptions.NONE).lock(
					instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static CreditcardDAO getFromApplicationContext(ApplicationContext ctx) {
		return (CreditcardDAO) ctx.getBean("CreditcardDAO");
	}
}
