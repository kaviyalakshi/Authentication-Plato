package com.pyt.gauthen;

import java.security.Principal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
@RequestMapping("/home")
public String home()
{
	return "home.jsp";
}
@RequestMapping("/login")
public String login()
{
	return "login.jsp";
}
@RequestMapping("/logout-success")
public String logout()
{
	return "logout.jsp";
}
@RequestMapping("/user")
@ResponseBody
public Principal user(Principal principal)
{
	return principal;
}
}
