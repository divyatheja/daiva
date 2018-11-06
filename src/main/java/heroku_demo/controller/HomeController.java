package heroku_demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import heroku_demo.entity.Villager;
import heroku_demo.repository.CommentRepository;

@Controller
public class HomeController {
	@Autowired // This means to get the bean called commentRepository
    // Which is auto-generated by Spring, we will use it to handle the data
	private CommentRepository commentRepository;
	
	@GetMapping(value = {"/", "/index"})
	@ResponseBody
	public String openHomePage(Model model) {
	/*	
		model.addAttribute("comment", new Comment());
		model.addAttribute("allComments", (List<Comment>)commentRepository.findAll());*/
		return "index";
	}
	
	@GetMapping(value = {"/addVillager"})
	@ResponseBody
	public String addVillager(Model model) {
	/*	
		model.addAttribute("comment", new Comment());
		model.addAttribute("allComments", (List<Comment>)commentRepository.findAll());*/
		return "addVillager";
	}
	 
	
/*	@PostMapping(value = {"/", "/index"})
	public String addComment(@ModelAttribute("comment") Villager comment
			, Model model) {
		
		commentRepository.save(comment);  // save to the database
		
		model.addAttribute("allComments", (List<Comment>)commentRepository.findAll());
		return "redirect:/index"; // redirects
	}
*/
}
