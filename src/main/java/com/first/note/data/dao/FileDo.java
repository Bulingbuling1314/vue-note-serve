package com.first.note.data.dao;

import com.first.note.data.entity.FileEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FileDo extends JpaRepository<FileEntity, Integer> {
}
