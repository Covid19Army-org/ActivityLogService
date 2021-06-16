package com.covid19army.ActivityLogService.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.covid19army.ActivityLogService.dtos.ActivityLogResponseDto;
import com.covid19army.ActivityLogService.services.ActivityLogService;

@RestController
@RequestMapping("activity")
public class ActivityLogController {

	@Autowired
	ActivityLogService _activityLogService;
	
	@GetMapping("/health")
	public String health() {
		return "am running!";
	}
	
	@GetMapping("/user/{timestamp}")
	public List<ActivityLogResponseDto> getUserActivityLog(@PathVariable long timestamp){
		return _activityLogService.getActivityLogs(timestamp);
	}
	
}
