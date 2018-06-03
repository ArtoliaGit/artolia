/**
 * 
 */
package com.artolia.core.validate.code;

import org.springframework.web.context.request.ServletWebRequest;

/**
 * @author Artolia Pendragon
 *
 */
public interface ValidateCodeGenerator {

	public ValidateCode generate(ServletWebRequest request);
}
