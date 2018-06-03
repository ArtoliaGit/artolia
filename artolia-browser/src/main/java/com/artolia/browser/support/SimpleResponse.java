/**
 * 
 */
package com.artolia.browser.support;

/**
 * @author Artolia Pendragon
 *
 */
public class SimpleResponse {
	
	public SimpleResponse(Object object) {
		this.object = object;
	}
	
	private Object object;

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

}
