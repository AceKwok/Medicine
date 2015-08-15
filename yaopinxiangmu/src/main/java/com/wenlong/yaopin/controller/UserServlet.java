package com.wenlong.yaopin.controller;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Enumeration;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.wenlong.yaopin.pojo.Enterprise;

public class UserServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		
		Enterprise bean = new Enterprise();
	
	    HashMap map = new HashMap();
	    Enumeration names = request.getParameterNames();
	    while (names.hasMoreElements()) {
	      String name = (String) names.nextElement();
	      map.put(name, request.getParameterValues(name));
	    }
	    try {
			BeanUtils.populate(bean, map);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
		
}
