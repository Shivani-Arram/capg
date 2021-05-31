package com.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "This is hello Controller for greeting friends...", description = "Hello controlller")
public class HelloController {
	
	
	@RequestMapping("/")
	@ApiOperation(value = "greeting method")
	public String sayGoodBye()
	{
		return "hello hi and bye...";
	}
}
