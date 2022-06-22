package com.okanbahadirsoygur.proje.Services;

import com.okanbahadirsoygur.proje.Dto.ProjectCriteriaDto;
import com.okanbahadirsoygur.proje.Entities.Projects;
import com.okanbahadirsoygur.proje.Repositorys.ProjectCriteriaRepository;
import com.okanbahadirsoygur.proje.Repositorys.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProjectServices {


    @Autowired
    ProjectRepository projectRepository;


    @Autowired
    ProjectCriteriaRepository projectCriteriaRepository;



    public List<Projects> getAllProject(){

        List<Projects> projectsList = new ArrayList<>();
        projectRepository.findAll().forEach(projectsList::add);

        return projectsList;

    }

    public List<Projects> getAllProjectWithCriteria(String projeAdi, String projeKonusu, String projeBaslangicTarih, String projeBitisTarih, String projeYoneticisi, String projeDurumu, String projeGrupSayisi, String projeGozetmeni, String projePuani, String projeKategorisi) throws ParseException {


        ProjectCriteriaDto projectCriteriaDto = new ProjectCriteriaDto();



        //gelen string tarihi önce java.util.Date'ye sonra java.sql.Date'ye dönüştürelim.

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        java.sql.Date baslangicTarihSql = null, bitisTarihSql = null;


        if(projeBaslangicTarih != null && projeBaslangicTarih.length() >1){

            //get ile bize gelen format 2022-01-01 dir. Bunu 2022/01/01 şeklinde değiştirmemiz gerekiyor.


            java.util.Date baslangicTarihiUtil = simpleDateFormat.parse(projeBaslangicTarih.replaceAll("-","/"));
            baslangicTarihSql = new java.sql.Date(baslangicTarihiUtil.getTime());
            System.out.println(baslangicTarihSql);
        }


        if(projeBitisTarih != null && projeBitisTarih.length()>1){

            //get ile bize gelen format 2022-01-01 dir. Bunu 2022/01/01 şeklinde değiştirmemiz gerekiyor.
            java.util.Date bitisTarihUtil = simpleDateFormat.parse(projeBitisTarih.replaceAll("-","/"));
            bitisTarihSql = new java.sql.Date(bitisTarihUtil.getTime());
            System.out.println(bitisTarihSql);

        }

        if(projeGrupSayisi == null || projeGrupSayisi.length() < 1){
            projeGrupSayisi = "-1";
        }


        if(projePuani == null || projePuani.length() < 1){
            projePuani = "-1";
        }



        projectCriteriaDto.setProje_adi(projeAdi);
        projectCriteriaDto.setProje_konusu(projeKonusu);
        projectCriteriaDto.setProje_baslangic_tarih(baslangicTarihSql);
        projectCriteriaDto.setProje_bitis_tarih(bitisTarihSql);
        projectCriteriaDto.setProje_yoneticisi(projeYoneticisi);
        projectCriteriaDto.setProje_durumu(projeDurumu);
        projectCriteriaDto.setProje_grup_sayisi(Integer.parseInt(projeGrupSayisi));
        projectCriteriaDto.setProje_gozetmeni(projeGozetmeni);
        projectCriteriaDto.setProje_puani(Integer.parseInt(projePuani));
        projectCriteriaDto.setProje_kategorisi(projeKategorisi);

        System.out.println(projectCriteriaDto.getProje_puani());





        return projectCriteriaRepository.findWithCriteria(projectCriteriaDto);

    }


}
