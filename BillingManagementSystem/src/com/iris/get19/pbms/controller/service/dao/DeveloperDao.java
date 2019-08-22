package com.iris.get19.pbms.controller.service.dao;

import java.util.List;

import com.iris.get19.pbms.controller.service.dao.model.DataEntryOperator;
import com.iris.get19.pbms.controller.service.dao.model.Developer;
import com.iris.get19.pbms.controller.service.dao.model.ProjectAllocation;



public interface DeveloperDao {
	public List<Developer> getAllDeveloper();
	public List<Developer> getAll();
	public Developer getDeveloper(int id,String pass);
	public boolean setProjectConfig(ProjectAllocation obj);
	public boolean setAttendance(DataEntryOperator obj);
}
