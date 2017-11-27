package com.jrd.ems.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.Query;
import javax.persistence.TemporalType;

import org.springframework.stereotype.Repository;

import com.jrd.ems.entity.EnquiryDO;

@Repository
public class EnquiryDaoImpl extends GenericDAO implements EnquiryDao {


	@Override
	public void addEnquiry(EnquiryDO enquiryDO) {

		getEntityManager().persist(enquiryDO);

	}

	@Override
	public EnquiryDO editEnquiry(EnquiryDO enquiryDO) {

		return getEntityManager().merge(enquiryDO);
	}

	@Override
	public EnquiryDO getEnquiry(Long enquiryId) {

		return getEntityManager().find(EnquiryDO.class, enquiryId);
	}

	@Override
	public void deleteEnquiry(EnquiryDO enquiryDO) {
		getEntityManager().remove(enquiryDO);

	}

	@Override
	public List<EnquiryDO> searchEnquiryByName(String name) {
		return getEntityManager().createQuery("from EnquiryDO where type='" + name + "'").getResultList();
	}

	@Override
	public List<EnquiryDO> getTodayEnquiries() {
		Query query = getEntityManager().createQuery(
				"from EnquiryDO where enquiryDate=:today");

		query.setParameter("today", new Date(), TemporalType.DATE);

		return query.getResultList();
	}

}
