package org.oleggalimov.kotlinspringmvc.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping


@Controller
class WelcomeController {

    @RequestMapping("/")
    fun welcome(): String {
        return "index"
    }

}