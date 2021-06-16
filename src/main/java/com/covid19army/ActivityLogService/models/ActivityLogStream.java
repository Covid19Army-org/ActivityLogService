package com.covid19army.ActivityLogService.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Subselect;

@Entity
@Immutable
@Table(name="vw_activitylog_stream")
@Subselect("select uuid() as id, als.* from vw_activitylog_stream als")
public class ActivityLogStream implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id	
	private String id;
	
	private long activitylogid;

	private int activitytypeid;
	
	private String activitytext;

	private String clientip;

	
	@Column(name="date_created")
	private long dateCreated;

	private long entityid;

	private String entitytype;

	@Column(name="from_userid")
	private long fromUserid;

	@Column(name="to_userid")
	private long toUserid;
	
	private String entityname;
	private String fromuser;
	private String touser;
	private Long parententityid;
	private String parententityname;

	public ActivityLogStream() {
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

	public String getEntityname() {
		return entityname;
	}

	public void setEntityname(String entityname) {
		this.entityname = entityname;
	}

	public String getFromuser() {
		return fromuser;
	}

	public void setFromuser(String fromuser) {
		this.fromuser = fromuser;
	}

	public String getTouser() {
		return touser;
	}

	public void setTouser(String touser) {
		this.touser = touser;
	}

	public Long getParententityid() {
		return parententityid;
	}

	public void setParententityid(Long parententityid) {
		this.parententityid = parententityid;
	}

	public String getParententityname() {
		return parententityname;
	}

	public void setParententityname(String parententityname) {
		this.parententityname = parententityname;
	}

	public String getActivitytext() {
		return activitytext;
	}

	public void setActivitytext(String activitytext) {
		this.activitytext = activitytext;
	}

	
}
