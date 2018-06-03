/**
 * 
 */
package com.artolia.core.validate.code;

import java.time.LocalDateTime;

/**
 * @author Artolia Pendragon
 *
 */
public class ValidateCode {

	private String code;
	
	private LocalDateTime expireTime;
	
	public ValidateCode(String code, int expireTime) {
		this.code = code;
		this.expireTime = LocalDateTime.now().plusSeconds(expireTime);
	}
	
	public ValidateCode(String code, LocalDateTime expireTime) {
		this.code = code;
		this.expireTime = expireTime;
	}
	
	public boolean isExpried() {
		return LocalDateTime.now().isAfter(expireTime);
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public LocalDateTime getExpireTime() {
		return expireTime;
	}

	public void setExpireTime(LocalDateTime expireTime) {
		this.expireTime = expireTime;
	}
}