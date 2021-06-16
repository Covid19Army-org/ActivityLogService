package com.covid19army.ActivityLogService.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.covid19army.ActivityLogService.models.ActivityType;

public interface ActivityTypeRepository extends CrudRepository<ActivityType, Long>{
	Optional<ActivityType> findByName(String name);
}
