package com.christien.springbootdemo.common.Bow;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface BowRepository extends CrudRepository<Bow, Integer>{

	public List<Bow> findByArcherId(Integer archerId);
	
}
