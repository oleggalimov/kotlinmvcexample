package org.oleggalimov.kotlinspringmvc.configuration

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.view.InternalResourceViewResolver
import org.springframework.web.servlet.ViewResolver
import org.springframework.context.annotation.Bean




@Configuration
class config {
    @Bean
    fun viewResolver(): ViewResolver {
        val viewResolver = InternalResourceViewResolver()
        //        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix("/WEB-INF/pages/")
        viewResolver.setSuffix(".jsp")

        return viewResolver
    }
}