package com.covid19army.ActivityLogService.repositories;

import org.springframework.data.repository.CrudRepository;

import com.covid19army.ActivityLogService.models.ActivityLog;

public interface ActivityLogRepository extends CrudRepository<ActivityLog, Long>{

}
