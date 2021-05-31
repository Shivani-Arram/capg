package com.test.controller;

import javax.validation.Valid;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.test.model.Train;

@Controller
public class TrainController{

	@RequestMapping("/")
	public String home() {

		return "index";
	}

	@GetMapping("/booking")
	public String showForm(Model model, Train train) {

		model.addAttribute("train", train);

		return "booking_form";
	}

	@PostMapping("/booking")
	public String submitForm(@Valid @ModelAttribute("train") Train train ,BindingResult bindindResult, Model model ) {

		if(bindindResult.hasErrors())
		{

			return "booking_form";
		}

		return "booking_success";
	}
}

