package org.oleggalimov.kotlinspringmvc.restcontrollers

import org.json.JSONArray
import org.json.JSONObject
import org.oleggalimov.kotlinspringmvc.dto.Event
import org.oleggalimov.kotlinspringmvc.util.createSF
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController
import sun.misc.BASE64Encoder

@RestController
class fetchall {
    @ResponseBody
    @RequestMapping(value = arrayOf("/fetchall"), method = arrayOf(RequestMethod.GET))
    fun getAll(): String {
        val s = createSF().getSessionFactory().openSession()
        s.beginTransaction()

        val result = s.createNamedQuery("findAll").resultList
        if (result.size > 0) {
            val response = JSONArray()
            result.forEach {
                it as Event
                val jsonObj = JSONObject()
                jsonObj.put("title", it.TITLE)
                jsonObj.put("info", it.INFO)
                jsonObj.put("remaind_date", it.REMIND_DATE)
                jsonObj.put("image", BASE64Encoder().encode(it.IMAGEDATA))
                response.put(jsonObj)
            }
            return response.toString()
        } else {
            return JSONObject("error:nodata").toString()
        }

    }
}