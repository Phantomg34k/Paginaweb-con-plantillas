package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;



@Controller
public class mainController {

	  @GetMapping("/")
	  public String home(
	      Model model) {
	    model.addAttribute("message", "Hello, World!");
	    return "index";
	  }

	  @GetMapping("/productos")
	  public String getProducts(Model model) {
	    List<Products> products = List.of(
	        new Products("1", "Product 1", 10.0),
	        new Products("2", "Product 2", 20.0),
	        new Products("3", "Product 3", 30.0));
	    model.addAttribute("products", products);
	    return "products";
	  }

	  @GetMapping("/profile")
	  public String getProfile(Model model) {
	      boolean darkMode = true;

	      User user = new User(
	              "Ivan MTZ",
	              "a376967@uach.com",
	              "https://github.com/Phanto...",
	              List.of("Angular", "NestJS", "Unity", "C++", "C", "Ruby on rails", "MongoDB")
	      );

	      model.addAttribute("darkMode", darkMode);
	      model.addAttribute("user", user);

	      return "profile";
	  }}