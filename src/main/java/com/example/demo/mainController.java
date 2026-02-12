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
	    model.addAttribute("message", "Hey estas en la pantalla principal, usa /perfile!");
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

	 		    User user = new User();
	 		    user.setName("Ivan Mtz");
	 		    user.setEmail("a376967@uach.com");
	 		    user.setGithub("https://github.com/Phantomg34k");
	 		    user.setProfilePictureUrl("https://avatars.githubusercontent.com/u/211022680?v=4");

	 		    model.addAttribute("user", user);

	 		    String cardColor = "primary";
	 		    model.addAttribute("cardColor", cardColor);

	 		    return "profile";
	 		}
	 

}