package com.qlam.demo.repository;

import com.qlam.demo.entity.News;
import org.springframework.data.repository.CrudRepository;

public interface NewsRepository extends CrudRepository<News, Integer> {

}
