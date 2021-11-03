package Diary.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Diary.beans.Entries;


public interface DiaryRepository extends JpaRepository<Entries, Long>{

}