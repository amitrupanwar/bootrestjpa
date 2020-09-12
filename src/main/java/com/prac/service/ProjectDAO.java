package com.prac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prac.model.Project;
import com.prac.repo.ProjectRepo;

@Service
public class ProjectDAO {
	@Autowired 
	ProjectRepo projectRepo;

	public List<Project> findAll() {
		// TODO Auto-generated method stub
		return (List<Project>) projectRepo.findAll();
	}

	public Project findById(long id) {
		// TODO Auto-generated method stub
		return projectRepo.findById(id).get();
	}

	public boolean deleteById(long id) {
		// TODO Auto-generated method stub
		if (projectRepo.existsById(id)) {
			projectRepo.deleteById(id);
			return true;
		}
		return false;
	}

	public Project add(Project project) {
		// TODO Auto-generated method stub
		return projectRepo.save(project);
	}
}
