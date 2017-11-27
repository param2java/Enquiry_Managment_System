package com.jrd.ems.dao;

import java.util.List;

import com.jrd.ems.entity.EnquiryDO;


public interface EnquiryDao {

	public void addEnquiry(EnquiryDO enquiryDO);

	public EnquiryDO editEnquiry(EnquiryDO enquiryDO);

	public EnquiryDO getEnquiry(Long enquiryId);

	public void deleteEnquiry(EnquiryDO enquiryDO);

	public List<EnquiryDO> searchEnquiryByName(String name);

	public List<EnquiryDO> getTodayEnquiries();

}
