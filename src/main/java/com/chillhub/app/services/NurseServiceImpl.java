package com.chillhub.app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chillhub.app.dao.NurseDao;
import com.chillhub.app.entities.Nurse;
import com.chillhub.app.entities.Queuer;

@Service
public class NurseServiceImpl implements INurseService {
	
	@Autowired
	NurseDao dao;
	
	@Override
	public List<Nurse> getAll() {
		return dao.findAll();
	}
	
	@Override
	public Optional<Nurse> getOneById(int id) {
		return dao.findById(id);
	}
	
	@Override
	public void addOrUpdate(Nurse nurse) {
		dao.save(nurse);
	}
	
	@Override
	public void delete(Nurse nurse) {
		dao.delete(nurse);
	}
	
	@Override
	public Nurse findByRef(String ref) {
		return dao.findByRefMedicale(ref);
	}
	
	@Override
	public List<Queuer> getQueuersList(Nurse nurse) {
		return nurse.getCreatedQueuers();
	}

}