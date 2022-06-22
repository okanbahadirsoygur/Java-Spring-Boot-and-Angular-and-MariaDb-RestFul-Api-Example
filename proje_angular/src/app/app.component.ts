import {Component, ElementRef, ViewChild} from '@angular/core';
import {ProjeapiService} from "./services/projeapi.service";
import {Subject} from "rxjs";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {

    projects: any;


    form_proje_adi: string = "";
    form_proje_konusu: string = "";
    form_baslangic_tarih: string = "";
    form_bitis_tarih: string = "";
    form_proje_yoneticisi: string = "";
    form_proje_durumu: string = "";
    form_proje_grup_sayisi: string = "";
    form_proje_gozetmen: string = "";
    form_proje_puani: string = "";
    form_proje_kategori: string = "";

  dtOptions: DataTables.Settings = {};



  constructor(private projeapi:ProjeapiService) {

    this.dtOptions = {
      pagingType: 'full_numbers',
      pageLength: 10,
      processing: true
    };


  this.projeapi.getProjects("","","","","","","","","","").subscribe(res =>
  {
    this.projects = res;

  });

  }//kurucu metod




  filtrele_btn(){

    if(this.form_baslangic_tarih == undefined){
      this.form_baslangic_tarih = "";
    }

    if(this.form_bitis_tarih == undefined){
      this.form_bitis_tarih = "";
    }

    if(this.form_proje_adi == undefined){
      this.form_proje_adi = "";
    }

    if(this.form_proje_konusu == undefined){
      this.form_proje_konusu = "";
    }

    if(this.form_proje_yoneticisi == undefined){
      this.form_proje_yoneticisi = "";
    }

    if(this.form_proje_durumu == undefined){
      this.form_proje_durumu = "";
    }


    this.projeapi.getProjects(this.form_proje_adi, this.form_proje_konusu, this.form_baslangic_tarih , this.form_bitis_tarih, this.form_proje_yoneticisi, this.form_proje_durumu,this.form_proje_grup_sayisi,this.form_proje_gozetmen, this.form_proje_puani, this.form_proje_kategori).subscribe(res => this.projects = res);

  }



}
