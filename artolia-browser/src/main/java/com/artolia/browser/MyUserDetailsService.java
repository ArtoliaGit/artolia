/**
 * 
 */
package com.artolia.browser;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

/**
 * @author Artolia Pendragon
 *
 */
@Component
public class MyUserDetailsService implements UserDetailsService {
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	private Logger logger = LoggerFactory.getLogger(getClass());

	/* (non-Javadoc)
	 * @see org.springframework.security.core.userdetails.UserDetailsService#loadUserByUsername(java.lang.String)
	 */
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		logger.info("登陆用户名：" + username);
		
		return new User(username, passwordEncoder.encode("12345"),
				true, true, true, true,
				AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
	}

}
