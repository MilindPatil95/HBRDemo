package com.bridgelabz;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class AppMain {

	public static void main(String[] args) {
		Alian alian = new Alian();

		AlianName aname = new AlianName();
		aname.setFname("Shubham");
		aname.setMname("B");
		aname.setLname("Patil");
		alian.setAid(101);
		alian.setAname(aname);
		alian.setColor("red");

		Alian alian1 = new Alian();

		AlianName aname1 = new AlianName();
		aname1.setFname("Shubhu");
		aname1.setMname("M");
		aname1.setLname("Patil");
		alian1.setAid(102);
		alian1.setAname(aname1);
		alian1.setColor("green");

		Alian alian2 = new Alian();
		AlianName aname2 = new AlianName();
		aname2.setFname("Sunil");
		aname2.setMname("P");
		aname2.setLname("Patil");
		alian2.setAid(103);
		alian2.setAname(aname2);
		alian2.setColor("yellow");

		Configuration con = new Configuration().configure().addAnnotatedClass(Alian.class);
		// configuration added

		ServiceRegistry sr = (ServiceRegistry) new ServiceRegistryBuilder().applySettings(con.getProperties())
				.buildServiceRegistry();
		// service registry created

		SessionFactory sf = con.buildSessionFactory(sr);
		// get session
		Session session = sf.openSession();

		// START TRNASACTION...

		Transaction txn = session.beginTransaction();
		// save object in session

		session.save(alian);
		session.save(alian1);
		session.save(alian2);

		// COMMIT THE TRANSACTION...

		txn.commit();

		Query query = session.createQuery("from Alian");

		System.out.println(query.list());
		
		// create criteria
			
		Criteria c=session.createCriteria(Alian.class);
		 c.setFirstResult(0);
		 c.setMaxResults(2);
		 
		 System.out.println("result------------->>   "+c.list());

	}

}
