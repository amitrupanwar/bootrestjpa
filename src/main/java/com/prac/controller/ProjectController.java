package com.prac.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prac.model.Project;
import com.prac.service.ProjectDAO;

@RestController
@RequestMapping("/projects")
public class ProjectController {
	@Autowired
	ProjectDAO projectDAO;

	@GetMapping 
	public List<Project> getProjects() {
		return projectDAO.findAll();
	}

	@GetMapping("/{id}")
	public Project getProject(@PathVariable long id) {
		return projectDAO.findById(id);
	}

	@DeleteMapping("/{id}")
	public boolean deleteProject(@PathVariable long id) {
		return projectDAO.deleteById(id);
	}

	@PostMapping
	public Project addProject(@Valid @RequestBody Project Project) {
		return projectDAO.add(Project);

	}
}
