package com.xworkz.app.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.xworkz.app.dto.XeroxDTO;

import jdk.nashorn.internal.runtime.regexp.JoniRegExp.Factory;

public class XeroxDAOImpl implements XeroxDAO {

	SessionFactory factory = (new Configuration()).configure("resources/db.xml").buildSessionFactory();

	@Override
	public String totalCost(XeroxDTO dto) {
		Session session = null;
		try {
			session = factory.openSession();
			session.beginTransaction();

			session.getTransaction().commit();

		} catch (Exception e) {
			System.err.println("ERR : Exception in " + e.getMessage());
			session.getTransaction().rollback();
		} finally {
			if (session != null)
				session.close();
			System.out.println("INFO : Session Closed");
		}

		return null;
	}

}
