package com.phuc.springbootlibrary.dao;
import com.phuc.springbootlibrary.entity.History;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;

public interface HistoryRepository extends JpaRepository<History, Long> {
    Page<History> findBooksByUserEmail(@RequestParam("email") String userEmail, Pageable pageable);
}
