package be.vdab.controller;

import be.vdab.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PostController {

    @Autowired
    PostService postService;

    @GetMapping("/readAllPosts")
    public ModelAndView readAllPosts(ModelMap modelMap) {
        modelMap.addAttribute("posts",postService.readAllPosts());
        return new ModelAndView("readAllPosts",modelMap);
    }

}
