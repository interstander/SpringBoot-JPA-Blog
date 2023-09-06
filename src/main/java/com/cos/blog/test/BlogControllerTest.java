package com.cos.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//6강
@RestController //스프링이 com.cos.blog 패키지이하의 모든 클래스를 메모리에 new하는 것이 아닌 특정 어노테이션이 붙은 클래스의 인스턴스를 메모리에 띄워준다
public class BlogControllerTest {

	@GetMapping("/test/hello")
	public String hello() {
		return "<h1>hello spring boot</h1>";
	}
}
