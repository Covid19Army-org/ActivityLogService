package com.covid19army.ActivityLogService.models;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the activitytype database table.
 * 
 */
@Entity
@NamedQuery(name="ActivityType.findAll", query="SELECT a FROM ActivityType a")
public class ActivityType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int activitytypeid;

	private String activitytext;

	private String name;

	public ActivityType() {
	}

	public int getActivitytypeid() {
		return this.activitytypeid;
	}

	public void setActivitytypeid(int activitytypeid) {
		this.activitytypeid = activitytypeid;
	}

	public String getActivitytext() {
		return this.activitytext;
	}

	public void setActivitytext(String activitytext) {
		this.activitytext = activitytext;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}