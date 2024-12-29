package com.khemesh.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.khemesh.entity.Plan;

public interface PlanRepo extends JpaRepository<Plan, Integer> {

}
