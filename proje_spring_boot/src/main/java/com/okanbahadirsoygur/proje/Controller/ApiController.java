package com.okanbahadirsoygur.proje.Controller;


import com.okanbahadirsoygur.proje.Entities.Projects;
import com.okanbahadirsoygur.proje.Services.ProjectServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ApiController {


    @Autowired
    ProjectServices projectServices;


    /**
     * Bütün projeleri listeler
     * @return
     */
    @GetMapping("api/projects")
    public List<Projects> getAllProject(){

       return projectServices.getAllProject();

    }


    /**
     * Gelen get parametrelerine göre filtreleme işlemi yapar. Eğer parametre gönderilmez ise bütün tabloyu geriye döndürür.
     * Paremetrelerin(filtrelerin) hepsi doldurulmaz zorunda değil. Sadece istenilen paremetreler(filtreler) doldurulup gönderilebilir.Required = false konumdadır bütün parametreler(filtreler)
     * @param projeAdi
     * @param projeKonusu
     * @param projeBaslangicTarih
     * @param projeBitisTarih
     * @param projeYoneticisi
     * @param projeDurumu
     * @return
     * @throws ParseException
     */
    @RequestMapping(value = "api/project-filter", method = RequestMethod.GET)
    public List<Projects> getFilteringProject(@RequestParam(defaultValue = "", name = "proje_adi") String projeAdi,
                                              @RequestParam(defaultValue = "", name = "proje_konusu") String projeKonusu,
                                              @RequestParam(defaultValue = "", name = "baslangic_tarih")String projeBaslangicTarih,
                                              @RequestParam(defaultValue = "", name = "bitis_tarih")String projeBitisTarih,
                                              @RequestParam(defaultValue = "", name = "proje_yonetici")String projeYoneticisi,
                                              @RequestParam(defaultValue = "", name = "proje_durum")String projeDurumu,
                                              @RequestParam(defaultValue = "", name = "proje_grup_sayisi")String projeGrupSayisi,
                                              @RequestParam(defaultValue = "", name = "proje_gozetmeni")String projeGozetmeni,
                                              @RequestParam(defaultValue = "", name = "proje_puani")String projePuani,
                                              @RequestParam(defaultValue = "", name = "proje_kategorisi")String projeKategorisi) throws ParseException {


    return   projectServices.getAllProjectWithCriteria(projeAdi,projeKonusu,projeBaslangicTarih,projeBitisTarih,projeYoneticisi,projeDurumu, projeGrupSayisi,projeGozetmeni,projePuani,projeKategorisi);

    }



}
