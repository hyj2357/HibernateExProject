package lee;

import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.hibernate.*;
import org.hibernate.cfg.*;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import com.hibernateTst.extendsMappingDomain.Admin;
import com.hibernateTst.extendsMappingDomain.BaseCustomer;
import com.hibernateTst.extendsMappingDomain.Customer;
import com.hibernateTst.extendsMappingDomain.CustomerList;
import com.hibernateTst.extendsMappingDomain.Message;
import com.sun.org.apache.bcel.internal.generic.NEW;


/**
 * Description:
 * <br/>Copyright (C), 2008-2010, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class NewsManager
{
	public static final String FILEPATH = System.getProperty("user.dir")+"\\src\\hibernate.cfg.xml";
	private static Configuration config;
	private static SessionFactory sessionFactory;
	private static Session session;
	private static Transaction tx;
	static{
		 System.out.println(FILEPATH);
		 config = new Configuration().configure(new File(FILEPATH));
	     sessionFactory = config.buildSessionFactory();
		 session = sessionFactory.openSession();
		 tx = session.beginTransaction();		 
	}
	public static void main(String[] args) throws Exception{
		/**
		 Customer cs  = new Customer();
		 cs.setCustomer_name("hyj");
		 Address ad  = new Address();
		 ad.setCity("lingshui");
		 ad.setPart("guangpo");
		 session.persist(ad);
		 cs.setCustomer_address(ad);
		 session.persist(cs);
		 Admin adm = new Admin();
		 adm.setAdmin_name("you");
		 adm.getCustomer_set().add(cs);
		 session.persist(adm);
		 **/
		/**
		 Admin ad = (Admin) session.get(Admin.class, 1);
		 Set<Customer>set = ad.getCustomer_set();
		 for(Iterator<Customer> it=set.iterator();it.hasNext();){
			 Customer cs = it.next();
			 System.out.println(cs.toString());
		 
		 }
		 **/
		 /**
		 Customer cs = (Customer) session.get(Customer.class, 2);
		 System.out.println(cs);
		 **/
		/**
		 Customer cs  = (Customer) session.get(Customer.class, 1);
		 CustomerList cl = new CustomerList();
		 cl.setBaseCustomer(cs);
		 session.persist(cl);
		 **/
		/**
		 Admin ad = new Admin();
		 ad.setName("yj");
		 ad.setAdmin_password("1257");
		 Customer cs = new Customer();
		 cs.setName("de");
		 cs.setCustomer_state(1);
		 cs.setCustomer_sex(0);
		 cs.setCustomer_room("540");
		 cs.setCustomer_qq(213);
		 cs.setCustomer_phone(24234);
		 cs.setCustomer_password("21323434");
		 cs.setCustomer_major("se");
		 cs.setCustomer_grade("2013");
		 cs.setCustomer_email("ww@.com");
		 session.persist(cs);
		 session.persist(ad);
		 **/
		/**
		 Admin  ad = new Admin();
		 ad.setName("ret");
		 ad.setAdmin_password("3525");
		 session.persist(ad);
	    **/
		//findAdminByAdminId_admin_query();
		 //objectQuery();
		 //simpleQuery();		
		//Admin ad = new Admin();
		//ad.setName("er5.0");
		//ad.setAdmin_password("254");
		//session.persist(ad);
		//System.out.println(ad.getId());
		/**
		Address ad = (Address)session.load(Address.class, 1);
		List ls = session.getNamedQuery("findByAddress").setInteger(0, ad.getAddress_id())
		                                                .list();
		 com.hibernateTest.relationmappingdomain.Customer cs =  (com.hibernateTest.relationmappingdomain.Customer)ls.get(0);
		System.out.println(cs.getCustomer_id()+":"+cs.getCustomer_name()+" "+cs.getCustomer_address());
		System.out.println(cs.getCustomer_address()==ad);
		**/
		/**
		Address ad = new Address();
		ad.setCity("ls");
		ad.setPart("gp");
		session.persist(ad);
		com.hibernateTest.relationmappingdomain.Customer cs = new com.hibernateTest.relationmappingdomain.Customer();
		cs.setCustomer_name("yj");
		cs.setCustomer_address(ad);
		session.persist(cs);
	   **/
		/**
		com.hibernateTest.relationmappingdomain.Customer cs 
		     = (com.hibernateTest.relationmappingdomain.Customer) session.get(com.hibernateTest.relationmappingdomain.Customer.class, 2);
		System.out.println(cs);
		session.delete(cs);
		**/
		
		/** 鍘熺敓Sql鐨勫懡鍚嶅垹闄ゆ搷浣� **
		Address ad = (Address)session.get(Address.class, 3);
		
		session.getNamedQuery("deleteCustomerWhereAddress_address")
		       .setInteger(0, ad.getAddress_id())
		       .executeUpdate();
		session.getNamedQuery("deleteAddressWhereAddress_id_address")
	           .setInteger(0, ad.getAddress_id())
	           .executeUpdate();
        **/
		
		
		//Address ad = (Address) session.get(Address.class, 1);
		//Customer cs = (Customer) session.get(Customer.class, 2);
		//session.delete(cs);
		/**
		Set css = ad.getCustomer_set();
		for(Iterator itr = css.iterator();itr.hasNext();){
			Customer cs = (Customer)itr.next();
			System.out.println(cs);
		}
		**/
		//session.delete(ad);
		//putMessage();
		//putAdminAndCustomer();
		
		/** Admin delete cascade**
		Admin ad = (Admin)session.get(Admin.class, 2);
		session.delete(ad);
		**/
		
		//tx.commit();
		//session.close();
	     
		//鍒涘缓鏁版嵁搴撹剼鏈�
		System.out.println(FILEPATH);
		toSQL(new File(FILEPATH));
	    
	}
	public static void toSQL(File f){
		 System.out.println("Creating tables...");
	     SchemaExport schemaExport = new SchemaExport(config);
		 schemaExport.create(true, true);
	     System.out.println("Table created.");
		 tx.commit();
		 session.close();	
	}
	public static void simpleQuery(){
		List ls = session.getNamedQuery("simpleQuery").list();
		for(Iterator itr = ls.iterator();itr.hasNext();){
			Object obj[] = (Object[]) itr.next();
			System.out.println((String)obj[0]+" "+obj[1]);
		}
		tx.commit();
		session.close();
	}
	
	public static void objectQuery(){
		List ls = session.getNamedQuery("objectQuery").setInteger(0, 1).list();
		for(Iterator itr = ls.iterator();itr.hasNext();){
			Admin obj = (Admin) itr.next();
		    //obj.info();
		}
		tx.commit();
		session.close();		
	}
	public static void findAdminByAdminId_admin_query(){
		List ls = session.getNamedQuery("findByIdAndPassword_admin_query").setInteger(0, 5).setString(1, "23525").list();
		for(Iterator itr = ls.iterator();itr.hasNext();){
			BaseCustomer obj = (BaseCustomer) itr.next();
		    System.out.println(obj.getId()+":" + obj.getName());
		}
		tx.commit();
		session.close();		
	
	}
	
	public static void putAdminAndCustomer(){
		Customer cs = new Customer();
		cs.setName("de");
		cs.setCustomer_state(1);
		cs.setCustomer_sex(0);
		cs.setCustomer_room("540");
		cs.setCustomer_qq(213);
		 cs.setCustomer_phone(24234);
		 cs.setCustomer_password("21323434");
		 cs.setCustomer_major("se");
		 cs.setCustomer_grade("2013");
		 cs.setCustomer_email("ww@.com");
		 session.persist(cs);
		Admin ad = new Admin();
		ad.setName("hyj");
		ad.setAdmin_password("234");
		session.persist(ad);
		tx.commit();
	    session.close();
	}
	
	
	
	public static void putMessage(){
		BaseCustomer ad = (BaseCustomer) session.get(BaseCustomer.class, 2);
		BaseCustomer cs = (BaseCustomer) session.get(BaseCustomer.class, 1);
	    Message ms = new Message();	 
	    ms.setMessage_publisher(ad);
	    ms.setMessage_receiver(cs);
	    ms.setMessage_title("waiting for success!");
	    session.persist(ms);
	    tx.commit();
	    session.close();
	 }
}
