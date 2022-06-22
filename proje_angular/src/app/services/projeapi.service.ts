import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class ProjeapiService {


  apiurl:any ="http://localhost:81/api/project-filter";

  constructor(private http: HttpClient) { }


  getProjects(proje_adi:string, proje_konusu:string, baslangic_tarihi:string, bitis_tarihi:string, proje_yoneticisi:string, proje_durumu:string, proje_grup_sayisi:string, proje_gozetmeni:string, proje_puani:string, proje_kategorisi:string){


  return this.http.get(this.apiurl+"?proje_adi="+proje_adi+"&proje_konusu="+proje_konusu+"&baslangic_tarih="+baslangic_tarihi+"&bitis_tarih="+bitis_tarihi+"&proje_yonetici="+proje_yoneticisi+"&proje_durum="+proje_durumu+"&proje_grup_sayisi="+proje_grup_sayisi+"&proje_gozetmeni="+proje_gozetmeni+"&proje_puani="+proje_puani+"&proje_kategorisi="+proje_kategorisi);

  }


}
