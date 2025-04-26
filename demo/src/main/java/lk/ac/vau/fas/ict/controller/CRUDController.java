package lk.ac.vau.fas.ict.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@PutMapping("/update/{id}")
	public String updateOne(@PathVariable("id") K id, @RequestBody T objectNew) {
	    if (objects.get(id) != null) {
	        objects.put(id, objectNew);
	        return "Updated object details.";
	    }
	    return "404 couldn't find the object.";
	}
		
	
	
}
