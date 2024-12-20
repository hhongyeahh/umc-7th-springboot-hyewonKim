package com.study.repository.ReviewRepository;

import com.study.domain.Member;
import com.study.domain.Review;
import com.study.domain.Store;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review,Long>, ReviewRepositoryCustom {
    Page<Review> findAllByStore(Store store, PageRequest pageRequest);
    Page<Review> findAllByMember(Member member, PageRequest pageRequest);
}
