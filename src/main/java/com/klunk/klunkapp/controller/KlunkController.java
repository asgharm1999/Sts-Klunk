package com.klunk.klunkapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klunk.klunkapp.model.Logs;
import com.klunk.klunkapp.services.KlunkService;

@RestController
public class KlunkController {
	
	@Autowired
	private KlunkService klunkService;
	
	@RequestMapping("/logs")
	public Logs getLogs() {
		return klunkService.getLogs();
	}
}
