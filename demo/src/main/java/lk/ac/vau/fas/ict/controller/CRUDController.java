package lk.ac.vau.fas.ict.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;



public class CRUDController<K,T> {
    
	private Map<K,T> objects = new HashMap<K,T>();
	
	public Map<K,T> getMap(){
		return objects;
	}
	
	@GetMapping("/")
	public Map<K,T> getAll(){
		return objects;
	}
	
	@GetMapping("/{id}")
	public T get(@PathVariable("id") K id){
		return objects.get(id);
	}
	
	 @PostMapping("/add")
	    public T addNew(@RequestBody T object, @RequestParam("id") K id) {
	        objects.put(id, object);
	        return object; // Return the newly added object
	    }
	
	
	
}
