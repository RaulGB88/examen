package com.ad.examen.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ad.examen.model.Cancion;

@Repository
@Transactional
public interface CancionRepository extends JpaRepository<Cancion, Long> {

	  @Query(value = "SELECT c FROM Cancion c LEFT JOIN FETCH c.listaDiscos discos WHERE discos.id = :iddisco")
	  public List<Cancion> getCancionesByDisco(@Param("iddisco") Long idDisco);	
	  void deleteById(Long id);
}
