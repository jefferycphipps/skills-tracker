package org.launchcode.skills_tracker.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SkillsController {

    @GetMapping()
    public String hello(){
        String html = "<html>" +
                "<body>" +
                "<form method = 'get' action = '/hello'>" +
                "<input type = 'text' name = 'name' />" +
                "<select name = 'language' id = 'language-select>"+
                "<option value=''>--Please choose an option--</option>"+
                "<option value='english'>English</option>"+
                "<option value='french'>French</option>" +
                "<option value='italian'>Italian</option>" +
                "<option value='spanish'>Spanish</option>" +
                "<option value='german'>German</option>"+
                "</select>" +
                "<input type = 'submit' value = 'Greet Me!' />" +
                "</form>" +
                "</body>" +
                "</html>";

        return html;
    }

}
