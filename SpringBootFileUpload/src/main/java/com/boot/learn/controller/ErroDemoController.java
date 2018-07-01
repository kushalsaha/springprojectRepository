/**
 * 
 */
package com.boot.learn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sanjeev
 *
 */
@RestController
public class ErroDemoController {

	@RequestMapping("/test")
	public RuntimeException demoCauseError(){
		return new RuntimeException("Demo test exception");
	}
}
