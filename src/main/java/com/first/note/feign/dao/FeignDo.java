package com.first.note.feign.dao;

import com.first.note.feign.entity.FeignEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeignDo extends JpaRepository<FeignEntity, Integer> {
    FeignEntity getByCityName(String cityName);
}
