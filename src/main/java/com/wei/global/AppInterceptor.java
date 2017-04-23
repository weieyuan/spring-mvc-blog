package com.wei.global;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AppInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		System.out.println("AppInterceptor.preHandle");
		String uri = request.getRequestURI();
		StringBuffer sb = request.getRequestURL();
		if (uri.contains("/login") || uri.contains("/userlogin")) {
			return true;
		}
		HttpSession session = request.getSession(false);
		if (null != session && null != session.getAttribute("userName")) {
			return true;
		}

		String reqType = request.getHeader("X-Requested-With");
		// 如果是ajax请求
		if ("XMLHttpRequest".equals(reqType)) {
			response.setContentType("text/html");
			response.setHeader("url", request.getContextPath() + "/login");
		}
		// 如果是普通请求
		else {
			response.sendRedirect(request.getContextPath() + "/login");
		}

		return false;
	}

}
