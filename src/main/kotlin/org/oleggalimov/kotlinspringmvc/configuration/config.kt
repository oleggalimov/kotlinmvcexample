package org.oleggalimov.kotlinspringmvc.configuration

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.view.InternalResourceViewResolver
import org.springframework.web.servlet.ViewResolver
import org.springframework.context.annotation.Bean
import org.springframework.web.multipart.commons.CommonsMultipartResolver




@Configuration
class config {
    @Bean
    fun viewResolver(): ViewResolver {
        val viewResolver = InternalResourceViewResolver()
        //        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix("/WEB-INF/pages/")
        viewResolver.setSuffix(".jsp")
        println("--------------init views-----------------")
        return viewResolver
    }

    @Bean(name = arrayOf("multipartResolver"))
    fun multipartResolver(): CommonsMultipartResolver {
        val multipartResolver = CommonsMultipartResolver()
        multipartResolver.setMaxUploadSize(5*1024*1024)
        return multipartResolver
    }
}