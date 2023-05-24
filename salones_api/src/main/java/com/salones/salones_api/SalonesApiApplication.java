package com.salones.salones_api;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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

	
	public static void main(String[] args) {
		SpringApplication.run(GraphqlServerApplication.class, args);
	}

	
@RequestMapping("/classrooms")
public class ClassroomController {
    private List<Classroom> classrooms = new ArrayList<>();

    @GetMapping
    public List<Classroom> getClassrooms() {
        return classrooms;
    }

    @GetMapping("/{name}")
    public Classroom getClassroomByName(@PathVariable String name) {
        return classrooms.stream()
                .filter(c -> c.getNumero().equalsIgnoreCase(name))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Classroom not found: " + name));
    }

    @PostMapping
    public void createClassroom(@RequestBody Classroom classroom) {
        classrooms.add(classroom);
    }

    @PostMapping("/{name}/students")
    public void addStudentToClassroom(@PathVariable String name, @RequestBody Profesor student) {
        Classroom classroom = getClassroomByName(name);
        classroom.addStudent(student);
    }

    @DeleteMapping("/{name}/students/{studentName}")
    public void removeStudentFromClassroom(@PathVariable String name, @PathVariable String studentName) {
        Classroom classroom = getClassroomByName(name);
        Profesor student = classroom.getStudents().stream()
                .filter(s -> s.getName().equalsIgnoreCase(studentName))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Student not found: " + studentName));
        classroom.addStudent(student);
    }
}

}