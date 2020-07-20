package com.qlam.demo.controller;

import com.qlam.demo.entity.News;
import com.qlam.demo.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class QController {

	@Autowired
	private NewsService newsService;

	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("news",newsService.findAll());
		return "adpost";
	}
	@GetMapping("/new/{id}")
	public String home(@PathVariable("id") Integer id, Model model) {
		News news = newsService.findOne(id);
		model.addAttribute("news",news);

		return "news";
	}

	@GetMapping("/add")
	public String add(Model model) {
		model.addAttribute("news", new News());
		return "form-post";
	}

	@PostMapping(value="/savenews")
	public String save(@Valid News news, BindingResult result, RedirectAttributes redirect) {
		newsService.save(news);
		//redirect.addFlashAttribute("success", "Saved contact successfully!");
		return "redirect:/";
	}
}
