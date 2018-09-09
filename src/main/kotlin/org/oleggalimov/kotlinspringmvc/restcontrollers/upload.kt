package org.oleggalimov.kotlinspringmvc.restcontrollers

import org.oleggalimov.kotlinspringmvc.dto.Event
import org.oleggalimov.kotlinspringmvc.util.createSF
import org.springframework.web.bind.annotation.*
import org.springframework.web.multipart.MultipartFile
import java.sql.Timestamp

@RestController
class upload {
    val UPLOADFILE_SIZE=1024*1024*5
    @ResponseBody
    @RequestMapping(value = arrayOf("/upload"), method = arrayOf(RequestMethod.POST))
    fun createEvent (@RequestParam("file") file : MultipartFile) : String {
        if (!file.isEmpty && file.size<UPLOADFILE_SIZE) {
            val imagedata=file.bytes
            val event= Event(
                    IMAGEDATA=imagedata,
                    CREATE_DATE = Timestamp(System.currentTimeMillis()),
                    REMIND_DATE = Timestamp(System.currentTimeMillis()),
                    INFO = "InfoIndfo",
                    TITLE = "TESTSTRING"
            )

            val s = createSF().getSessionFactory().openSession()
            s.beginTransaction()
            s.save(event)
            s.getTransaction().commit()
            s.close()
            return "success"
        } else {
            return "Файл пуст, либо его размер превышает 5 МБ, попытка зугрузить файл размером ${file.size.toString()}"
        }
    }
}