package com.github.kaydunovdenis.repository;

import com.github.kaydunovdenis.model.Report;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface ReportRepository extends JpaRepository<Report, Long>, QuerydslPredicateExecutor<Report> {
}
