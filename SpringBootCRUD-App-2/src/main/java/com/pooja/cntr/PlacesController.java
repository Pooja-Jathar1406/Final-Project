package com.pooja.cntr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody; 
import org.springframework.web.bind.annotation.RestController;

import com.pooja.model.Places;
import com.pooja.service.PlacesService;

@RestController
@CrossOrigin
public class PlacesController {
	
	@Autowired
	private PlacesService placesService;
	
	@PostMapping(value = {"/place/add"}) 
	public String placeAdd(@RequestBody Places place) {
		placesService.add(place);
		return "success";
	}
	
	@PutMapping(value = {"/place/update"})
	public String placeUpdate(@RequestBody Places place) {
		placesService.modify(place);
		return "success";
	}
	  
	@DeleteMapping(value = {"/place/delete/{id}"})
	public String placeDelete1(@PathVariable int id) {
		System.out.println("place  deleted");
		placesService.removeById(id);
		return "success";
	}
	
	@GetMapping(value = {"/place/{id}"})
	public Places placeGet(@PathVariable int id) {
		return placesService.getById(id);
	}
	
	@GetMapping(value = {"/place"})
	public List<Places> placeList(){
		return placesService.getAll();
	}
	
	 
}
