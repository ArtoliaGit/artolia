/**
 * 
 */
package com.artolia.core.validate.code.sms;

/**
 * @author Artolia Pendragon
 *
 */
public interface SmsCodeSender {

	public void send(String mobile, String code);
}
