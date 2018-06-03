/**
 * 
 */
package com.artolia.web.interceptor;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Artolia Pendragon
 *
 */
@Component
public class TimeInterceptor implements HandlerInterceptor {

	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.HandlerInterceptor#afterCompletion(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object, java.lang.Exception)
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception e)
			throws Exception {
		System.out.println("afterCompletion");
		
		long start = (long) request.getAttribute("startTime");
		System.out.println("time interceptor 耗时：" + (new Date().getTime() - start));
		
		System.out.println("e is " + e);

	}

	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.HandlerInterceptor#postHandle(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object, org.springframework.web.servlet.ModelAndView)
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
			throws Exception {
		System.out.println("postHandle");
		
		long start = (long) request.getAttribute("startTime");
		System.out.println("time interceptor 耗时：" + (new Date().getTime() - start));

	}

	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.HandlerInterceptor#preHandle(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object)
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		System.out.println("preHandle");
		
		if(handler instanceof HandlerMethod) {
			System.out.println(((HandlerMethod)handler).getBean().getClass().getName());
			System.out.println(((HandlerMethod)handler).getMethod().getName());
		}
		
		request.setAttribute("startTime", new Date().getTime());
		return true;
	}

}
