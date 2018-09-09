package org.oleggalimov.kotlinspringmvc.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*



@Controller

class Uploadform {
    @RequestMapping (value = arrayOf("/form"), method = arrayOf(RequestMethod.GET))
    fun uploadForm () : String {
        return "upload"
    }
}