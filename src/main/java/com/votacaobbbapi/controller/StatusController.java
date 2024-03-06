package com.votacaobbbapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class StatusController {
	
	@GetMapping("/api/status")
	public ResponseEntity<String> status(){
		return ResponseEntity.ok("Online");
	}
}
