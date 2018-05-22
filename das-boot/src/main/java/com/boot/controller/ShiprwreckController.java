package com.boot.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.boot.model.Shipwreck;
import com.boot.repository.ShipwreckRepository;

@RestController
@RequestMapping("api/v1")
public class ShiprwreckController {

	@Autowired
	private ShipwreckRepository shipwreckRepository;

	// @Value("${spring.servlet.multipart.location}")
	private String tempLocation;

	@RequestMapping(value = "shipwrecks", method = RequestMethod.GET)
	public List<Shipwreck> list() {
		return this.shipwreckRepository.findAll();
	}

	/*
	 * uploading files https://spring.io/guides/gs/uploading-files/
	 */
	@RequestMapping(value = "shipwrecks", method = RequestMethod.POST)
	public Shipwreck create(@RequestPart Shipwreck wreck, @RequestPart MultipartFile image) {
		System.out.print(image.getOriginalFilename());
		return this.shipwreckRepository.saveAndFlush(wreck);
	}

	@RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.GET)
	public Shipwreck get(@PathVariable Long id) {
		return this.shipwreckRepository.getOne(id);
	}

	@RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.PUT)
	public Shipwreck update(@PathVariable Long id, @RequestBody Shipwreck wreck) {
		Shipwreck existingShipwreck = this.shipwreckRepository.getOne(id);
		BeanUtils.copyProperties(wreck, existingShipwreck);
		return this.shipwreckRepository.saveAndFlush(existingShipwreck);
	}

	@RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.DELETE)
	public Shipwreck delete(@PathVariable Long id) {
		Shipwreck wreck = this.shipwreckRepository.getOne(id);
		this.shipwreckRepository.deleteById(id);
		return wreck;
	}

}
