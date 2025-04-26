package lk.ac.vau.fas.ict.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;



public class CRUDController<K,T> {
    
	private Map<K,T> objects = new HashMap<K,T>();
	
	public Map<K,T> getMap(){
		return objects;
	}
	
	@GetMapping("/")
	public Map<K,T> getAll(){
		return objects;
	}
	
}
