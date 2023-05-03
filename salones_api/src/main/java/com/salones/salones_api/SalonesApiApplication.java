package com.salones.salones_api;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@RestController
@SpringBootApplication
public class SalonesApiApplication {
	private HashMap<Salon,String> salones= new HashMap<>();


	ArrayList<Profesor> profesores = new ArrayList<Profesor>();
	
	public static void main(String[] args) {
		SpringApplication.run(SalonesApiApplication.class, args);
	}

	@GetMapping ("/salones")
	 public HashMap<Salon, String> salones(){
		Profesor profesor = new Profesor("Ernesto");
		Profesor profesor2 =new Profesor("Carlos");
		Profesor profesor3 = new Profesor("Favi");
		Profesor profesor4 =new Profesor("Orea");
		profesores.add(profesor);
		profesores.add(profesor2);
		profesores.add(profesor3);
		profesores.add(profesor4);
		Salon salon = new Salon("F402","EL PENULTIMO PISO DEL SALPN", profesores);
		salones.put(salon, salon.getNumero());
		return  salones;
	}

	@GetMapping("/salones/{numero}")
    public String Getsalon(@PathVariable String numero) {
	return salones.get(numero);
	}

	@GetMapping(value="/salones/profes")
	public HashMap<Salon, String> getMethodName() {
		return salones;
	}
	
	@GetMapping("/")
	public String bienvenida(){
		return "Bienvenido al api salones";
	}

	
	@DeleteMapping("/salones/{id}")
	HashMap<Salon, String> deleteEmployee(@PathVariable String id) {
		salones.remove(id);
		return salones;
	}	
	
	@PutMapping(value="/salones/{id}")
	public Salon putMethodName(@PathVariable String id, @RequestBody Salon salon) {
		deleteEmployee(id);
		return salon;
	}

	@RequestMapping(value="/salones", method=RequestMethod.POST)
	public Salon requestMethodName(@RequestBody Salon param) {
	System.out.println();
		return param ;
	}
	
}