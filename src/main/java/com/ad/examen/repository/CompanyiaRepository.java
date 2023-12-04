package com.ad.examen.repository;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ad.examen.model.Companyia;

@Repository
@Transactional
public interface CompanyiaRepository extends JpaRepository<Companyia, Long> {

	void save(Long id);
	Optional<Companyia> findById(Long id);
	List<Companyia> findAll();
	void deleteById(Long id);
	

}
