package com.first.note.data.dao;

import com.first.note.data.entity.DataEntity;
import com.first.note.data.entity.ThemeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThemeDo extends JpaRepository<ThemeEntity, Integer> {
    ThemeEntity findByFlag(int flag);
    ThemeEntity findById(int id);
}
