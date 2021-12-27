package com.laptrinhweb.utils;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUtil {
	private static final EntityManagerFactory emf = 
			Persistence.createEntityManagerFactory("DoAnWeb");
	public static EntityManagerFactory getEmFactory() {
			return emf;
	}
}
