package com.first.note.data.dao;

import com.first.note.data.entity.DataEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataDo extends JpaRepository<DataEntity, Integer> {}
