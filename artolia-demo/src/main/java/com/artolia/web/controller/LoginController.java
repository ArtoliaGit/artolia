/**
 * 
 */
package com.artolia.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Artolia Pendragon
 *
 */
@RestController
@RequestMapping("/logininfo")
public class LoginController {

	@RequestMapping(value="/get_info", method=RequestMethod.GET)
	public String getUserInfo(HttpServletRequest request) throws JSONException {
//		String token = request.getParameter("token");
		JSONObject jsonObject = new JSONObject("{code:200,data:{" + 
				"name: 'super_admin'," + 
				"user_id: '1'," + 
				"access: ['super_admin']," + 
				"token: 'super_admin'," + 
				"avator: 'https://file.iviewui.com/dist/a0e88e83800f138b94d2414621bd9704.png'" + 
				"},msg:''}");
		return jsonObject.toString();
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(HttpServletRequest request) throws JSONException {
		JSONObject jsonObject = new JSONObject("{code:200,data:{" + 
				"token: 'super_admin'" + 
				"},msg:''}");
		return jsonObject.toString();
	}
	
	@RequestMapping(value="/logout", method=RequestMethod.POST)
	public String logout(HttpServletRequest request) throws JSONException {
		JSONObject jsonObject = new JSONObject("{code:200,data:"+null+",msg:''}");
		return jsonObject.toString();
	}
	
	@RequestMapping(value="/getUserList", method=RequestMethod.GET)
	public String getUserList(HttpServletRequest request) throws JSONException {
		JSONObject jsonObject = new JSONObject("{code:200,data: [{id:'12345',username:'dxf',password:'123',"
				+ "personname:'测试',departname:'1',position:'1',wechatcode:'abvd',status:true}],msg:''}");
		return jsonObject.toString();
	}
}
