/**
 * 
 */
package com.artolia.code;

import org.springframework.web.context.request.ServletWebRequest;

import com.artolia.core.validate.code.ValidateCodeGenerator;
import com.artolia.core.validate.code.image.ImageCode;

/**
 * @author Artolia Pendragon
 *
 */
//@Component("imageCodeGenerator")
public class DemoImageCodeGenerator implements ValidateCodeGenerator {

	/* (non-Javadoc)
	 * @see com.artolia.core.validate.code.ValidateCodeGenerator#generate(org.springframework.web.context.request.ServletWebRequest)
	 */
	@Override
	public ImageCode generate(ServletWebRequest request) {
		System.out.println("更高级的图形验证码生成代码");
		return null;
	}

}
