package controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import model.Feature;

@RestController
@EnableWebMvc
public class FeatureController {
	@RequestMapping(value="/createFeature", method = RequestMethod.POST)
	public ResponseEntity<Feature> createFeature(@RequestBody Feature feature ){
	    return ResponseEntity.accepted().body(feature);

	}
}
