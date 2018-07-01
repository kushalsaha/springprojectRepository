/**
 * 
 */
package com.boot.learn.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.learn.model.Restaurent;
import com.boot.learn.repository.RestaurentRepository;

/**
 * @author Sanjeev
 *
 */

@RestController
@RequestMapping(value = "/rest/restaurent")
public class RestaurentResourceController {

	@Autowired
	private RestaurentRepository restaurentRepository;

	@GetMapping(value = "/")
	public String checkMessage() {
		return "This is restaurent Page. It works fine!";
	}

	@GetMapping(value = "/all")
	public List<Restaurent> getAllRestaurentDetails() {
		return restaurentRepository.findAll();
	}

	@GetMapping(value = "/{id}")
	public Optional<Restaurent> getRestaurentDetailsById(@PathVariable final long id) {
		return restaurentRepository.findById(id);
	}

	@PostMapping(value = "/addnew")
	public String persistNewRestaurent(@RequestBody final Restaurent restaurent) {
		restaurentRepository.save(restaurent);
		return "New Resturent added successfully!";
	}

	@DeleteMapping(value = "/delete/{id}")
	public String deleteRestaurent(@PathVariable final long id) {
		restaurentRepository.deleteById(id);
		return "Resturent with Id: " + id + " deleted successfully!";
	}

}
