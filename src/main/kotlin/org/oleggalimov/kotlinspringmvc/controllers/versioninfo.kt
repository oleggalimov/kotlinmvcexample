package org.oleggalimov.kotlinspringmvc.controllers

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
 class versioninfo {
    @RequestMapping("/version")
    fun getversion(): String {
        return "1.0.1"
    }
}