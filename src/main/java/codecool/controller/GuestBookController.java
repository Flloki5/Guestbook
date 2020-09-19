package codecool.controller;

import codecool.model.GuestBook;
import codecool.service.GuestBookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/guestbook")
public class GuestBookController {
    private GuestBookService guestBookService;

    public GuestBookController(GuestBookService guestBookService){
        this.guestBookService = guestBookService;
    }

    @GetMapping
    public String getAllPosts(Model model){
        model.addAttribute("guestbook", guestBookService.getAllGuestBook());
        model.addAttribute("form", new GuestBook());
        return "guestbook";
    }

    @PostMapping
    public String addPost(@ModelAttribute GuestBook guestBook, Model model) {
        guestBookService.addGuestBook(guestBook);
        model.addAttribute("form", guestBook);
        return "redirect:/guestbook";
    }

    /*@GetMapping("/edit")
    public String editPost(Model model){
        model.addAttribute("guestbook", guestBookService.getAllGuestBook());
        return "editpost";
    }*/

    @GetMapping("guestbook/edit/{id}")
    public String editExam(@PathVariable("id") int id, Model model) {
        if (id == 1) {
            model.addAttribute("item", new GuestBook(1, "Proba", "proba proba proba"));
        }
        return "editpost";
    }

}
