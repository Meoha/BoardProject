// / 경로로 오는 요청을 처리하는 Controller

package com.example.myboard.controller;

import com.example.myboard.config.auth.SessionUser;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@RequiredArgsConstructor
@Controller
public class BaseController {

    private final HttpSession httpSession;

    @GetMapping("/")
    public String index(Model model){

        SessionUser user = (SessionUser) httpSession.getAttribute("user");

        if(user != null){

            model.addAttribute("userName", user.getName());
            model.addAttribute("userImg", user.getPicture());

        }

        return  "index";
    }
}
