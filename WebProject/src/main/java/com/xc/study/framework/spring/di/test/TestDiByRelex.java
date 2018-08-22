package com.xc.study.framework.spring.di.test;

import java.lang.reflect.InvocationTargetException;

import com.xc.study.util.PropertiesUtils;

@SuppressWarnings("unused")
public class TestDiByRelex {

	private static final String beanIdDao;
	private static final String beanClassDao;
	private static final String beanIdService;
	private static final String beanClassService;
	private static final String beanPropertyNameService;
	private static final String beanPropertyRefService;
	private static final String beanIdController;
	private static final String beanClassController;
	private static final String beanPropertyNameController;
	private static final String beanPropertyRefController;

	static {
		beanIdDao = PropertiesUtils.getValue("bean.id.dao");
		beanClassDao = PropertiesUtils.getValue("bean.class.dao");
		beanIdService = PropertiesUtils.getValue("bean.id.service");
		beanClassService = PropertiesUtils.getValue("bean.class.service");
		beanPropertyNameService = PropertiesUtils.getValue("bean.property.name.service");
		beanPropertyRefService = PropertiesUtils.getValue("bean.property.ref.service");
		beanIdController = PropertiesUtils.getValue("bean.id.controller");
		beanClassController = PropertiesUtils.getValue("bean.class.controller");
		beanPropertyNameController = PropertiesUtils.getValue("bean.property.name.controller");
		beanPropertyRefController = PropertiesUtils.getValue("bean.property.ref.controller");
	}

	public static void main(String[] args) {

		Class<?> daoClazz;
		try {
			daoClazz = Class.forName(beanClassDao);
			Object daoObj = daoClazz.getDeclaredConstructor().newInstance();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}

	}

}
