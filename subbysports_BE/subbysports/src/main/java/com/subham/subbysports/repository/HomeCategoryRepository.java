package com.subham.subbysports.repository;

import com.subham.subbysports.model.HomeCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeCategoryRepository extends JpaRepository<HomeCategory,Long> {
}
