package com.okanbahadirsoygur.proje.Dto;

import lombok.Getter;
import lombok.Setter;

public class ProjectCriteriaDto {


    @Getter
    @Setter
    private String proje_adi;

    @Getter
    @Setter
    private String proje_konusu;

    @Getter
    @Setter
    private java.sql.Date proje_baslangic_tarih;

    @Getter
    @Setter
    private java.sql.Date proje_bitis_tarih;

    @Getter
    @Setter
    private String proje_yoneticisi;

    @Getter
    @Setter
    private String proje_durumu;

    @Getter
    @Setter
    private int proje_grup_sayisi;

    @Getter
    @Setter
    private String proje_gozetmeni;

    @Getter
    @Setter
    private  int proje_puani;

    @Getter
    @Setter
    private  String proje_kategorisi;



}
