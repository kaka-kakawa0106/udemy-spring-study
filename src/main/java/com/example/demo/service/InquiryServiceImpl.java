package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dao.InquiryDao;
import com.example.demo.entity.Inquiry;
//import com.example.demo.repository.InquiryDao;

@Service
public class InquiryServiceImpl implements InquiryService {

	private final InquiryDao dao;
	
	@Autowired InquiryServiceImpl(InquiryDao dao) {
		this.dao = dao;
	}
	
	@Override
	public void save(Inquiry inquiry) {
		dao.insertInquiry(inquiry);
	}

	@Override
	public void update(Inquiry inquiry) {
	  // section 6 comment out
		var count = dao.updateInquiry(inquiry);
		
		if(count == 0) {
			throw new InquiryNotFoundException("can't find the same ID k.kawase");
		}
	}
	
	@Override
	public List<Inquiry> getAll() {
		
	  return dao.getAll();
	  
//		List<Inquiry> list = dao.getAll();
//		if(list.isEmpty()) {
//			throw new InquiryNotFoundException("No inquiry");
//		}
//		return list;
	}

}