package in.bushansirgur.springrestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;

import in.bushansirgur.springrestapi.model.PersonaNatural;
import in.bushansirgur.springrestapi.service.PersonaService;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5502")
public class PersonaController {
	

	@Autowired
	private PersonaService eService;
	
	
	@GetMapping("/persona")
	public  List<PersonaNatural> getEmployees() {
		return eService.getEmployees();
	}
	
	@GetMapping("/persona/prueba")
	public List<String> getNames(){
		return List.of("Cris","Daniela","Mark");
	}
	
	@GetMapping("/persona/{id}")
	public String getEmployee(@PathVariable Long id) {
		return "Fetching the emplyee detail for the id "+id;
	}
	
	@PostMapping("/persona")
	public String saveEmployee(@RequestBody PersonaNatural employee) {
		return "saving the employee details to the database "+ employee;
	}
	
	@PutMapping("/persona/{id}")
	public PersonaNatural updateEmployee(@PathVariable Long id, @RequestBody PersonaNatural employee) {
		System.out.println("updating the employee data for the id "+id);
		return employee;
	}
	
	@DeleteMapping("/persona")
	public String deleteEmployee(@RequestBody PersonaNatural employee) {
		return "Deleting the empoyee details fot the id " + employee;
	}
}
	
