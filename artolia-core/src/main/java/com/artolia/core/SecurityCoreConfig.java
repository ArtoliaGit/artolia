/**
 * 
 */
package com.artolia.core;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import com.artolia.core.properties.SecurityProperties;

/**
 * @author Artolia Pendragon
 *
 */
@Configuration
@EnableConfigurationProperties(SecurityProperties.class)
public class SecurityCoreConfig {

}
