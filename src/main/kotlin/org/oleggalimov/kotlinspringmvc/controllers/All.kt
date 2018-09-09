package org.oleggalimov.kotlinspringmvc.controllers

import org.json.JSONArray
import org.json.JSONObject
import org.oleggalimov.kotlinspringmvc.dto.Event
import org.oleggalimov.kotlinspringmvc.util.createSF
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView
import sun.misc.BASE64Encoder
import java.util.*

@Controller
class All {
    @RequestMapping (value = ["/all"])
    fun getAllRecords () : ModelAndView {
        val model = ModelAndView()
        model.viewName="all"
        val s = createSF().getSessionFactory().openSession()
        s.beginTransaction()

        val result = s.createNamedQuery("findAll").resultList
        val response=ArrayList<ArrayList<String>>()
        if (result.size > 0) {
            val tempArray = ArrayList<String>()
            result.forEach {
                it as Event
                tempArray.add(it.TITLE)
                tempArray.add(it.INFO)
                tempArray.add(it.REMIND_DATE.toLocalDateTime().toString())
                tempArray.add(BASE64Encoder().encode(it.IMAGEDATA))
                response.add(tempArray)
            }
        }
        model.addObject("events",response)
        return model
    }
}