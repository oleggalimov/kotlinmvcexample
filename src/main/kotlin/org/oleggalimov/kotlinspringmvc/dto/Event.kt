package org.oleggalimov.kotlinspringmvc.dto

import java.sql.Blob
import java.sql.Timestamp
import javax.persistence.*

@Entity(name = "events")
@NamedQuery(name = "findAll", query = "FROM events")
data class Event (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val Id:Int?=null,
        @Column(name="IMAGEDATA")
        val IMAGEDATA:ByteArray,
        @Column(name="REMIND_DATE")
        val REMIND_DATE:Timestamp,
        @Column(name="CREATE_DATE")
        val CREATE_DATE:Timestamp,
        @Column(name="TITLE")
        val TITLE:String,
        @Column(name="INFO")
        val INFO:String
)