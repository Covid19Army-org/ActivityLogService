package com.covid19army.ActivityLogService.models;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;



/**
 * The persistent class for the activitylog database table.
 * 
 */
@Entity
@NamedQuery(name="ActivityLog.findAll", query="SELECT a FROM ActivityLog a")
public class ActivityLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long activitylogid;

	private int activitytypeid;

	private String clientip;

	
	@Column(name="date_created")
	private long dateCreated;

	private long entityid;

	private String entitytype;

	@Column(name="from_userid")
	private long fromUserid;

	@Column(name="to_userid")
	private long toUserid;

	public ActivityLog() {
	}

	public long getActivitylogid() {
		return this.activitylogid;
	}

	public void setActivitylogid(long activitylogid) {
		this.activitylogid = activitylogid;
	}

	public int getActivitytypeid() {
		return this.activitytypeid;
	}

	public void setActivitytypeid(int activitytypeid) {
		this.activitytypeid = activitytypeid;
	}

	public String getClientip() {
		return this.clientip;
	}

	public void setClientip(String clientip) {
		this.clientip = clientip;
	}

	public long getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(long dateCreated) {
		this.dateCreated = dateCreated;
	}

	public long getEntityid() {
		return this.entityid;
	}

	public void setEntityid(long entityid) {
		this.entityid = entityid;
	}

	public String getEntitytype() {
		return this.entitytype;
	}

	public void setEntitytype(String entitytype) {
		this.entitytype = entitytype;
	}

	public long getFromUserid() {
		return this.fromUserid;
	}

	public void setFromUserid(long fromUserid) {
		this.fromUserid = fromUserid;
	}

	public long getToUserid() {
		return this.toUserid;
	}

	public void setToUserid(long toUserid) {
		this.toUserid = toUserid;
	}

}