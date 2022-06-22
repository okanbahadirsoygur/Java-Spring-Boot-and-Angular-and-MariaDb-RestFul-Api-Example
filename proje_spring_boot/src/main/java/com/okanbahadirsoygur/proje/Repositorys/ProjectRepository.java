package com.okanbahadirsoygur.proje.Repositorys;

import com.okanbahadirsoygur.proje.Entities.Projects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProjectRepository extends JpaRepository<Projects, Long> {

}
