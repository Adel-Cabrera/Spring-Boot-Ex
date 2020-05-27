package com.darkonnen.routes;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DojoController {
	
	@RequestMapping("/{location}")

	public String dojo(@PathVariable("location") String location) {
		// Event handler for location
		if (location.equals("dojo")) {
			return "El Dojo es pésimo";
		} else if (location.equals("burbank-dojo")) {
			return "El Dojo Burbank está localizado al sur de California";
		} else if (location.equals("san-jose")) {
			return "El Dojo SJ es el cuartel general";
		} else {
			return "ERROR, wrong route";
		}
	}

	
	
}
