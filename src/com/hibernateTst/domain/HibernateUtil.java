package com.hibernateTst.domain;

import org.hibernate.*;
import org.hibernate.cfg.*;

/**
 * @author  yeeku.H.lee kongyeeku@163.com
 * @version  1.0
 * <br>Copyright (C), 2008-2010, yeeku.H.Lee
 * <br>This program is protected by copyright laws.
 * <br>Program Name:
 * <br>Date: 
 */
public class HibernateUtil
{
	public static final SessionFactory sessionFactory;

	static
	{
		try
		{
			//����Ĭ�ϵ�hibernate.cfg.xml������һ��Configuration��ʵ��
			Configuration configuration=new Configuration().configure();
			//��Configuration��ʵ��������һ��SessionFactoryʵ��
			sessionFactory = configuration.buildSessionFactory();
		}
		catch (Throwable ex)
		{
			// Make sure you log the exception, as it might be swallowed
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	//ThreadLocal�������̱߳��ػ���ʵ��,�����ֲ߳̾�������Ҳ����˵ÿ��ʹ�øñ������̶߳�����Ϊ
	//�ñ����ṩһ������,ÿ���̸߳ı�ñ�����ֵ�����Ǹı�ø�����ֵ,���Ӱ�������̵߳ĸñ���
	//��ֵ.

	//ThreadLocal�Ǹ������̵߳���ݹ��?�����ڶ���߳�֮�乲����Դ,��˲�����Ҫ���߳�ͬ��    
	public static final ThreadLocal session = new ThreadLocal();

	public static Session currentSession() throws HibernateException
	{
		Session s = (Session) session.get();
		//�����̻߳�û��Session,�򴴽�һ���µ�Session
		if (s == null)
		{
			s = sessionFactory.openSession();
			//����õ�Session�����洢��ThreadLocal����session��
			session.set(s);
		}
		return s;
	}

	public static void closeSession() throws HibernateException 
	{
		Session s = (Session) session.get();
		if (s != null)
		s.close();
		session.set(null);
	}
}