package com.hibernateTst.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;


public class Manager {
    
	public static void main(String args[]){
       /**
		Configuration conf = new Configuration().configure();
		
		SessionFactory sf = conf.buildSessionFactory();
		Session sess = sf.openSession();
		
		Transaction ts = sess.beginTransaction();
		Admin adtest = new Admin();
		adtest.setAdmin_id(new Integer(1));
		adtest.setAdmin_name("hyj");
		adtest.setAdmin_password("12346849572107791473789");
		sess.save(adtest);
		ts.commit();
		**/
		
		/* 使用 Transaction 实现一个pojo 的持久化和数据库访问 
		
		Customer cs = new Customer(),dcs = new Customer(), mcs = new Customer();
		cs.setCustomer_name("why");
		sess.save(cs);
	
		dcs.setCustomer_name("how");
		sess.save(dcs);
		
		mcs.setCustomer_name("when");
		sess.save(mcs);
        
		Admin ad = new Admin();
		ad.setAdmin_name("hyj");
		sess.save(ad);
        
        ts.commit();
        sess.close();
        sf.close();
        */
		
	  /**
		Customer cs = (Customer)sess.load(Customer.class, new Integer(10));
		cs.setCustomer_name("DNF");
		ts.commit();
		//思考：为什么这里直接使用flush无法将修改的数据保存进数据库中
		sess.flush();
		sess.delete(cs);
		Customer toget = (Customer) sess.get(Customer.class, new Integer(9));
		System.out.println(toget.getCustomer_id() + ":" + toget.getCustomer_name());
		sess.close();
	   **/
		/* 使用 update 方法将一个托管的 pojo 保存至数据库中
		 * 并且该脱管的 pojo 重新变为持久化
		cs.setCustomer_name("DNF");
		
		Session s1 = sf.openSession();
		ts = s1.beginTransaction();
		s1.update(cs);
		ts.commit();
		s1.close();
		*/
		
		//sf.close();
		/**List** 
		Session session = (Session) HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
		
		Person huang = new Person();
		
		huang.setAge(18);
		huang.setName("hyj");
		List<String> schools = new ArrayList<String>();
		schools.add("LsMi");
		schools.add("HnMi");
		schools.add("HgUn");
		
		huang.setSchools(schools);
	    session.save(huang);
	    tx.commit();
	    HibernateUtil.closeSession();
	  **/
	  /**Array**
		Session session = (Session) HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
	    Student st = new Student();
	    st.setName("hyj");
	    st.setSchools(new String[]{ "LsMi","HnMi","HgUn"});
	    session.save(st);
	    tx.commit();
	    HibernateUtil.closeSession();
	  **/
	  /**Map**
		Session sess = (Session) HibernateUtil.currentSession();
		Transaction tx = sess.beginTransaction();
		Worker wk = new Worker();
		wk.setName("hyj");
		Map<Integer,String> im = new HashMap<Integer,String>();
		im.put(0, "SCUT");
		im.put(1, "Microsoft");
		im.put(2, "Oracle");
		wk.setInfoMap(im);
		sess.save(wk);
		tx.commit();
		HibernateUtil.closeSession();		  
	  **/
  
		Session sess = (Session) HibernateUtil.currentSession();
		Transaction tx = sess.beginTransaction();
 
	 /**Map Update**
		Worker wk = new Worker();
		wk = (Worker) sess.get(Worker.class, new Integer("1"));
		System.out.println(wk);
		Map<Integer,String> mp = wk.getInfoMap();
		mp.remove(0);
		mp.put(0,"Tencent");
		sess.update(wk);
		tx.commit();
      **/
		
/**Sorted Set**		
		Teacher tc = new Teacher();
		tc.setName("hyj");
		Set<String>schools = new TreeSet<String>();
		schools.add("SCUT");
		schools.add("MIT");
		schools.add("HNT");
		tc.setSchools(schools);
**/
		/**映射数据库对象**
		  Configuration conf = new Configuration().configure();
		  SessionFactory sf = conf.buildSessionFactory();
         **/
	
		My_Manager mm = new My_Manager();
		Name n  =  new Name();
		n.setFirst("yijun");
		n.setLast("Huang");
		mm.setName(n);
		sess.save(mm);
		tx.commit();
		HibernateUtil.closeSession();		
	}
}
