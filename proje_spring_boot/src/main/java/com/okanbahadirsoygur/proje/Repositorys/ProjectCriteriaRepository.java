package com.okanbahadirsoygur.proje.Repositorys;


import com.okanbahadirsoygur.proje.Dto.ProjectCriteriaDto;
import com.okanbahadirsoygur.proje.Entities.Projects;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProjectCriteriaRepository {

    @PersistenceContext
    EntityManager entityManager;


    /*
    public List<Projects> findProjeAdiAndProjeKonusu(String projeAdi, String projeKonusu){
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Projects> cq = cb.createQuery(Projects.class);

        Root<Projects> book = cq.from(Projects.class);
        Predicate authorNamePredicate = cb.equal(book.get("proje_adi"), projeAdi);
        Predicate authorNamePredicate2 = cb.equal(book.get("proje_konusu"), projeKonusu);
      //  Predicate titlePredicate = cb.like(book.get("title"), "%" + title + "%");
        cq.where(authorNamePredicate, authorNamePredicate2);



        TypedQuery<Projects> query = entityManager.createQuery(cq);
        return query.getResultList();

    }
*/

    /**
     * Dto objesi ile gönderilen kriterler kontrol edilir, sadece dolu değişkenler kriter olarak eklenir.
     * @param projectCriteriaDto
     * @return
     */
    public List<Projects> findWithCriteria(ProjectCriteriaDto projectCriteriaDto) {

        List<Projects> projectsList = new ArrayList<>();

        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Projects> cq = cb.createQuery(Projects.class);

        Root<Projects> projectsRoot = cq.from(Projects.class);



        /**
         * Gelen dto'yu kontrol edelim. Boş olan değişkenleri kriter olarak almayalım.
         */


        List<Predicate> predicateList = new ArrayList<Predicate>();

        if(projectCriteriaDto.getProje_adi() != null && !projectCriteriaDto.getProje_adi().equals("")){

            //burda özellikle like kullandım. equals'de kullanılabilirdi, ama arama yaparken çok kullanışlı olmazdı.

              Predicate projectProjeAdiPredicate = cb.like(projectsRoot.get("proje_adi"),"%"+projectCriteriaDto.getProje_adi()+"%");
               //Predicate projectProjeAdiPredicate = cb.equal(projectsRoot.get("proje_adi"),projectCriteriaDto.getProje_adi());
            
              predicateList.add(projectProjeAdiPredicate);

        }

        if(projectCriteriaDto.getProje_konusu() != null && !projectCriteriaDto.getProje_konusu().equals("")){
            //burda özellikle like kullandım. equals'de kullanılabilirdi, ama arama yaparken çok kullanışlı olmazdı.

            Predicate projectProjeKonusuPredicate = cb.like(projectsRoot.get("proje_konusu"),"%"+projectCriteriaDto.getProje_konusu()+"%");
            //projectProjeKonusuPredicate = cb.equal(projectsRoot.get("proje_konusu"),projectCriteriaDto.getProje_konusu());
            
            predicateList.add(projectProjeKonusuPredicate);
        }

        if(projectCriteriaDto.getProje_baslangic_tarih() != null && !projectCriteriaDto.getProje_baslangic_tarih().equals("")){

            Predicate projectBaslangicTarihiPredicate = cb.greaterThanOrEqualTo(projectsRoot.get("proje_baslangic_tarih"), projectCriteriaDto.getProje_baslangic_tarih());

            predicateList.add(projectBaslangicTarihiPredicate);

        }


        if(projectCriteriaDto.getProje_bitis_tarih() != null && !projectCriteriaDto.getProje_bitis_tarih().equals("")){

           Predicate  projectBitisTarihiPredicate = cb.lessThanOrEqualTo(projectsRoot.get("proje_bitis_tarih"), projectCriteriaDto.getProje_bitis_tarih());

           predicateList.add(projectBitisTarihiPredicate);

        }


        if(projectCriteriaDto.getProje_yoneticisi() != null && !projectCriteriaDto.getProje_yoneticisi().equals("")){
            //burda özellikle like kullandım. equals'de kullanılabilirdi, ama arama yaparken çok kullanışlı olmazdı.

            Predicate projectProjeYoneticisiPredicate = cb.like(projectsRoot.get("proje_yoneticisi"),"%"+projectCriteriaDto.getProje_yoneticisi()+"%");
            //projectProjeYoneticisiPredicate = cb.equal(projectsRoot.get("proje_yoneticisi"),projectCriteriaDto.getProje_yoneticisi());
            
            predicateList.add(projectProjeYoneticisiPredicate);
        }


        if(projectCriteriaDto.getProje_durumu() != null && !projectCriteriaDto.getProje_durumu().equals("")){
            //burda özellikle like kullandım. equals'de kullanılabilirdi, ama arama yaparken çok kullanışlı olmazdı.

            Predicate projectProjeYoneticisiPredicate = cb.like(projectsRoot.get("proje_durumu"),"%"+projectCriteriaDto.getProje_durumu()+"%");
            //projectProjeDurumuPredicate = cb.equal(projectsRoot.get("proje_durumu"),projectCriteriaDto.getProje_durumu());

            predicateList.add(projectProjeYoneticisiPredicate);
        }


        if(projectCriteriaDto.getProje_grup_sayisi() != -1){

            Predicate projectProjeGrupSayisiPredicate = cb.equal(projectsRoot.get("proje_grup_sayisi"),projectCriteriaDto.getProje_grup_sayisi());


            predicateList.add(projectProjeGrupSayisiPredicate);
        }


        if( projectCriteriaDto.getProje_gozetmeni() != null && !projectCriteriaDto.getProje_gozetmeni().equals("")){

            Predicate projectProjeGozetmeniPredicate = cb.like(projectsRoot.get("proje_gozetmeni"),"%"+projectCriteriaDto.getProje_gozetmeni()+"%");


            predicateList.add(projectProjeGozetmeniPredicate);
        }


        if(projectCriteriaDto.getProje_puani() != -1){

            Predicate projectProjePuanPredicate = cb.equal(projectsRoot.get("proje_puani"),projectCriteriaDto.getProje_puani());


            predicateList.add(projectProjePuanPredicate);
        }


        if( projectCriteriaDto.getProje_kategorisi() != null && !projectCriteriaDto.getProje_kategorisi().equals("")){

            Predicate projectProjeKategorisiPredicate = cb.like(projectsRoot.get("proje_kategorisi"),"%"+projectCriteriaDto.getProje_kategorisi()+"%");

            predicateList.add(projectProjeKategorisiPredicate);
        }




        //  Predicate titlePredicate = cb.like(book.get("title"), "%" + title + "%");
       // cq.where(projectProjeAdiPredicate,projectProjeKonusuPredicate,projectBaslangicTarihiPredicate,projectBitisTarihiPredicate,projectProjeYoneticisiPredicate,projectProjeDurumuPredicate);

       cq.where(predicateList.toArray(new Predicate[] {}));

        TypedQuery<Projects> query = entityManager.createQuery(cq);
        return query.getResultList();

    }

}
