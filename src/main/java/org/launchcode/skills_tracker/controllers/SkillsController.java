package org.launchcode.skills_tracker.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {

    @GetMapping("/")
    @ResponseBody
    public String hello(){
        String html = "<html>" +
                "<body>" +
                "<h1> Skills Tracker </h1>" +
                "<h2> On the next screen you will sort your language choice </h2>" +
                "<ol>"+
                "<li>Java</li>"+
                "<li>Python</li>"+
                "<li>JavaScript</li>"+
                "</ol>" +
                "<a href = '/form'>Click here</a>" +
                "</body>" +
                "</html>";

        return html;
    }

    @GetMapping("form")
    @ResponseBody
    public String displaySkillsForm(){
        String html = "<html>" +
                "<body>" +
                "<form method = 'get' action = '/form-results'>" +
                "<p>Enter your name!</p>"+
                "<input type = 'text' name = 'name' />" +
                "<ol>"+
                "<p>Select your first choice</p>"+
                "<li>"+
                    "<select name = 'section1' id = 'language-select>"+
                    "<option value=''>--Please choose an option--</option>"+
                    "<option value='Java'>Java</option>"+
                    "<option value='Python'>Python</option>" +
                    "<option value='JavaScript'>JavaScript</option>" +
                    "<option value='C++'>C++</option>" +
                    "<option value='C#'>C#</option>"+
                    "</select>" +
                "<p>Select your second choice</p>"+
                "<li>"+
                    "<select name = 'section2' id = 'language-select>"+
                    "<option value=''>--Please choose an option--</option>"+
                    "<option value='Java'>Java</option>"+
                    "<option value='Python'>Python</option>" +
                    "<option value='JavaScript'>JavaScript</option>" +
                    "<option value='C++'>C++</option>" +
                    "<option value='C#'>C#</option>"+
                    "</select>" +
                "<p>Select your third choice</p>"+
                "<li>"+
                    "<select name = 'section3' id = 'language-select>"+
                    "<option value=''>--Please choose an option--</option>"+
                    "<option value='Java'>Java</option>"+
                    "<option value='Python'>Python</option>" +
                    "<option value='JavaScript'>JavaScript</option>" +
                    "<option value='C++'>C++</option>" +
                    "<option value='C#'>C#</option>"+
                    "</select>" +
                "</ol>" +
                "<input type = 'submit' value = 'See Results!' />" +
                "</form>" +
                "</body>" +
                "</html>";
        return html;
    }

    @RequestMapping("form-results")
    @ResponseBody
    public String displayFormResults(@RequestParam String name, @RequestParam String section1, @RequestParam String section2, @RequestParam String section3){
        String html = "<html>"+"<body>" +
                        "<h1>" + name + "</h1>" +
                        "<table>"+ "<tr><td> Selection One: " + section1 + "</td></tr>" +
                                    "<tr><td> Selection Two: " + section2 + "</td></tr>" +
                                    "<tr><td> Selection Three: " + section3 + "</td></tr>" +
                        "</table>" + "</body>" +"</html>";

        return html;
    }



}
