package com.ad.examen.repository;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ad.examen.model.Companyia;
import com.ad.examen.model.Disco;

@Repository
@Transactional
public interface DiscoRepository extends JpaRepository<Disco, Long> {

	@Query(value = "SELECT * FROM disco WHERE idcompanyia = :idcompanyia", nativeQuery = true)
	public List<Disco> getDiscosByCompanyia(@Param("idcompanyia") Long idCompanyia);

	Optional<Disco> findById(Long id);

	void save(Long id);

	void deleteById(Long id);

}
