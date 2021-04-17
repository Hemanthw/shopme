package com.shopme.site;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShopmeMainController {
	@GetMapping("")
	public String viewHomePage()
	{
		return "index";
	}
}
