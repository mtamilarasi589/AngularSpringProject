package com.example.demo.model;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="resource")
public class ResourceModel {
	@Id
	private String resourceId;
	private String resourceName;
	private String resourceLink;
	private String imageUrl;
	private String resourceCategory;
	private Date createdOn;
	private UserModel createdBy;
	private Boolean verified;
	private Boolean active;
	
	
	
	
	public ResourceModel() {
		
	}




	public ResourceModel(String resourceId, String resourceName, String resourceLink, String imageUrl,
			String resourceCategory, Date createdOn, UserModel createdBy, Boolean verified, Boolean active) {
		super();
		this.resourceId = resourceId;
		this.resourceName = resourceName;
		this.resourceLink = resourceLink;
		this.imageUrl = imageUrl;
		this.resourceCategory = resourceCategory;
		this.createdOn = createdOn;
		this.createdBy = createdBy;
		this.verified = verified;
		this.active = active;
	}




	public String getResourceId() {
		return resourceId;
	}




	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}




	public String getResourceName() {
		return resourceName;
	}




	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}




	public String getResourceLink() {
		return resourceLink;
	}




	public void setResourceLink(String resourceLink) {
		this.resourceLink = resourceLink;
	}




	public String getImageUrl() {
		return imageUrl;
	}




	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}




	public String getResourceCategory() {
		return resourceCategory;
	}




	public void setResourceCategory(String resourceCategory) {
		this.resourceCategory = resourceCategory;
	}




	public Date getCreatedOn() {
		return createdOn;
	}




	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}




	public UserModel getCreatedBy() {
		return createdBy;
	}




	public void setCreatedBy(UserModel createdBy) {
		this.createdBy = createdBy;
	}




	public Boolean getVerified() {
		return verified;
	}




	public void setVerified(Boolean verified) {
		this.verified = verified;
	}




	public Boolean getActive() {
		return active;
	}




	public void setActive(Boolean active) {
		this.active = active;
	}




	@Override
	public String toString() {
		return "ResourceModel [resourceId=" + resourceId + ", resourceName=" + resourceName + ", resourceLink="
				+ resourceLink + ", imageUrl=" + imageUrl + ", resourceCategory=" + resourceCategory + ", createdOn="
				+ createdOn + ", createdBy=" + createdBy + ", verified=" + verified + ", active=" + active + "]";
	}

	
	
	
}
