package org.oleggalimov.kotlinspringmvc.util

import org.hibernate.cfg.Configuration
import org.hibernate.SessionFactory



class createSF {
    private val SessionFactory = buildSessionFactory()

    fun buildSessionFactory(): SessionFactory {
        try {
            return Configuration().configure().buildSessionFactory()
        } catch (ex: Throwable) {
            System.out.printf("Ошибка создания CF: $ex")
            throw ExceptionInInitializerError(ex)
        }
    }
    fun getSessionFactory(): SessionFactory {
        return SessionFactory
    }
}