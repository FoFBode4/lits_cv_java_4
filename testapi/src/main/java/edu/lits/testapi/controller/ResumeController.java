package edu.lits.testapi.controller;

import edu.lits.testapi.model.Card;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/card")
public class ResumeController {
    @GetMapping("/item")
    @ResponseBody

    public Card getCard(@RequestParam(required = true, defaultValue = "Chernivtsi") Integer id,
                        @RequestParam(required = false,
                                defaultValue = "Chernivtsi") String location) {
        System.out.println("here");
        return new Card();
    }

    @GetMapping("/list")
    @ResponseBody

    public List<Card> getCardList(@RequestParam(required = false, defaultValue = "Chernivtsi") String location) {
        System.out.println("here");

        return List.of(new Card(), new Card()) ;
    }
}
