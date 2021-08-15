package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.ResourceModel;
import com.example.demo.repository.ResourceRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/")
public class ResourceController {

	public ResourceController() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	private ResourceRepository resourceRepository;
	
	// get all resources
	@GetMapping("/home")
	public List<ResourceModel> getResource(){
		return resourceRepository.findAll();
	}		
	
	// create resource rest api
	@PostMapping("/home")
	public ResourceModel resourceSave(@RequestBody ResourceModel res) {
		return resourceRepository.save(res);
	}
	
	// get resource by id rest api
	@GetMapping("/home/{id}")
	public ResponseEntity<ResourceModel> resourceById(@PathVariable String id) {
		ResourceModel res = resourceRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Resource not exist with id :" + id));
		return ResponseEntity.ok(res);
	}
	
	// update resource rest api
	
	@PutMapping("/home/{id}")
	public ResponseEntity<ResourceModel> resourceEditSave(@PathVariable String id, @RequestBody ResourceModel rm){
		ResourceModel res = resourceRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Resource not exist with id :" + id));
		
		res.setResourceName(rm.getResourceName());
		res.setResourceLink(rm.getResourceLink());
		res.setImageUrl(rm.getImageUrl());
		
		ResourceModel updatedres = resourceRepository.save(res);
		System.out.println("Updated Success");
		return ResponseEntity.ok(updatedres);
	}
	
	// delete resource rest api
	@DeleteMapping("/home/{id}")
	public ResponseEntity<Map<String, Boolean>> resourceDelete(@PathVariable String id){
		ResourceModel res = resourceRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Resource not exist with id :" + id));
		
		resourceRepository.delete(res);
		Map<String, Boolean> response = new HashMap<>();
		response.put("Resource Deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
	

	
	
	
	
	
	
	
		
	
	
	
}
