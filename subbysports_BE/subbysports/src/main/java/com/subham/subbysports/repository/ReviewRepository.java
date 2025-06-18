package com.subham.subbysports.repository;

import com.subham.subbysports.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends JpaRepository<Review,Long> {
    List<Review> findReviewsByUserId(Long userId);
    List<Review> findReviewsByProductId(Long productId);
}
