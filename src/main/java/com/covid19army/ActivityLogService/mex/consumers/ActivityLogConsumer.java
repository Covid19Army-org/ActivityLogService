package com.covid19army.ActivityLogService.mex.consumers;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.covid19army.ActivityLogService.services.ActivityLogService;
import com.covid19army.core.dtos.ActivityLogDto;


@Component
public class ActivityLogConsumer {

	@Autowired
	ActivityLogService _activityLogService;
	
	@RabbitListener(queues = "${covid19army.rabbitmq.activitylogqueue:activitylogqueue}")
	public void requestVolunteerStatusMessageListener(ActivityLogDto message) {
		_activityLogService.createActivityLog(message);
	}
}
