package com.study.rest.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.study.rest.model.Study;

@Repository
public interface StudyRepo extends CrudRepository<Study, Long> {
	
//	public List<Study>getall();
	@Modifying
	@Query(value="insert into study (name,pass) values(:name,:pass)",nativeQuery=true)
	@Transactional
	public void addStudy(@Param("name")String name,@Param("pass")String pass);

}
