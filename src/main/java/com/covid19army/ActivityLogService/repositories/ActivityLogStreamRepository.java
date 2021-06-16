package com.covid19army.ActivityLogService.repositories;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.covid19army.ActivityLogService.models.ActivityLogStream;

public interface ActivityLogStreamRepository extends PagingAndSortingRepository<ActivityLogStream, String> {

	List<ActivityLogStream> findByDateCreatedGreaterThanAndToUserid(long date, long touserid);
}
