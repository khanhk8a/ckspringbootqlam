package com.qlam.demo.service;

import com.qlam.demo.entity.News;
import com.qlam.demo.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsRepository newsRepository;

    @Override
    public Iterable<News> findAll() {
        return newsRepository.findAll();
    }

    @Override
    public News findOne(Integer id) {
        return newsRepository.findOne(id);
    }

    @Override
    public void save(News contact) {
        newsRepository.save(contact);
    }

    @Override
    public void delete(Integer id) {
        newsRepository.delete(id);
    }
}
