package com.example.friends.domain;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;

public class Friends {
    @Id //private key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //프로젝트에 연결된 DB의 넘버링 방식을 따른다.
    @Column(name = "friendsId")
    private Long id; //oracle은 시퀀스, mysql은 auto_increment방식. 이 프로젝트는 mysql의 auto_increment방식을 따름
}
