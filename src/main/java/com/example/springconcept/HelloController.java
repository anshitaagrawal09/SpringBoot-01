package com.example.springconcept;

//UC-3
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from BridgeLabz";
    }
}





//UC-2
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//
//@Controller
//public class HelloController {
//
//    @GetMapping("/hello")
//    public String sayHello(Model model) {
//        model.addAttribute("message", "Hello from BridgeLabz");
//        return "hello"; // This will look for hello.html in src/main/resources/templates/
//    }
//}

//UC-1
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class HelloController {
//
//    @GetMapping("/hello")
//    public String sayHello() {
//        return "Hello from BridgeLabz";
//    }
//}
