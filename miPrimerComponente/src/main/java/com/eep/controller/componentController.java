package com.eep.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eep.component.primerComponente;

@Controller
@RequestMapping("/componente")
public class componentController {

	private static String COMPONENT_VIEW = "exampleComponent";

	@Autowired
	@Qualifier("ejemploComponente")
	private primerComponente ejemploComponente;

	@GetMapping("/example")
	public String ejemplo(Model model) {
		ejemploComponente.msg();
		return COMPONENT_VIEW;
	}
}
