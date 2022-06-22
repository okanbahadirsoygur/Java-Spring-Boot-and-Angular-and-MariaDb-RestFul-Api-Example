package com.okanbahadirsoygur.proje.Entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "projeler")
public class Projects {

    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Basic
    @Getter
    @Setter
    private String proje_adi;


    @Basic
    @Getter
    @Setter
    private String proje_konusu;

    @Basic
    @Getter
    @Setter
    private java.sql.Date proje_baslangic_tarih;


    @Basic
    @Getter
    @Setter
    private java.sql.Date proje_bitis_tarih;


    @Basic
    @Getter
    @Setter
    private String proje_yoneticisi;

    @Basic
    @Getter
    @Setter
    private String proje_durumu;

    @Basic
    @Getter
    @Setter
    private int proje_grup_sayisi;

    @Basic
    @Getter
    @Setter
    private String proje_gozetmeni;

    @Basic
    @Getter
    @Setter
    private  int proje_puani;

    @Basic
    @Getter
    @Setter
    private  String proje_kategorisi;










}
