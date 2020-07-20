package com.qlam.demo.service;

import com.qlam.demo.entity.News;

import java.util.Optional;

public interface NewsService {
    Iterable<News> findAll();

    News findOne(Integer id);

    void save(News contact);

    void delete(Integer id);
}
