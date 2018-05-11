package com.boot.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.boot.model.Shipwreck;

@RestController
@RequestMapping("api/v1")
public class ShiprwreckController {

	@RequestMapping(value = "shipwrecks", method = RequestMethod.GET)
	public List<Shipwreck> list() {
		return ShipwreckStub.list();
	}
	
	@RequestMapping(value = "shipwrecks", method = RequestMethod.POST)
	public Shipwreck create(@RequestBody Shipwreck wreck) {
		return ShipwreckStub.create(wreck);
	}
	
	@RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.GET)
	public Shipwreck get(@PathVariable Long id) {
		return ShipwreckStub.get(id);
	}
	
	@RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.PUT)
	public Shipwreck update(@PathVariable Long id, @RequestBody Shipwreck wreck) {
		return ShipwreckStub.update(id, wreck);
	}

	
	@RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.DELETE)
	public Shipwreck delete(@PathVariable Long id) {
		return ShipwreckStub.delete(id);
	}
	
}
