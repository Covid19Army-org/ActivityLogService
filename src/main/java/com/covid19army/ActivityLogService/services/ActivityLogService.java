package com.covid19army.ActivityLogService.services;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.covid19army.ActivityLogService.dtos.ActivityLogResponseDto;
import com.covid19army.ActivityLogService.models.ActivityLog;
import com.covid19army.ActivityLogService.repositories.ActivityLogRepository;
import com.covid19army.ActivityLogService.repositories.ActivityLogStreamRepository;
import com.covid19army.ActivityLogService.repositories.ActivityTypeRepository;
import com.covid19army.core.dtos.ActivityLogDto;
import com.covid19army.core.extensions.HttpServletRequestExtension;

@Service
public class ActivityLogService {

	@Autowired
	ActivityLogRepository _activityLogRepository;
	
	@Autowired
	ActivityTypeRepository _activityTypeRepository;
	
	ActivityLogStreamRepository _activityStreamRepository;
	
	@Autowired
	ModelMapper _mapper;
	
	@Autowired
	HttpServletRequestExtension _requestExtension;
	
	public void createActivityLog(ActivityLogDto dto) {
		var activityTypeOpt = _activityTypeRepository.findByName(dto.getActivitytype());
		if(activityTypeOpt.isPresent()) {
			var activityModel = _mapper.map(dto, ActivityLog.class);
			var currDate = new Date();
			activityModel.setDateCreated(currDate.getTime());
			activityModel.setActivitytypeid(activityTypeOpt.get().getActivitytypeid());
			_activityLogRepository.save(activityModel);
		}
	}
	
	public List<ActivityLogResponseDto> getActivityLogs(long date ){
		var authUserId = Long.parseLong(_requestExtension.getAuthenticatedUser());
		var activityLogs = _activityStreamRepository.findByDateCreatedGreaterThanAndToUserid(date, authUserId);
		var dto = activityLogs.stream().map(a->_mapper.map(a, ActivityLogResponseDto.class))
				.collect(Collectors.toList());
		return dto;
	}
}
