package com.khemesh.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.khemesh.entity.PlanCateogry;

public interface PlanCategoryRepo extends JpaRepository<PlanCateogry, Integer> {

}
