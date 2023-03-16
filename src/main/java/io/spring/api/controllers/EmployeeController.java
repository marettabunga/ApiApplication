// package io.spring.api.controllers;

// import java.util.List;

// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// import io.spring.api.dto.ResponseHandler;
// import io.spring.api.services.EmployeeService;

// @RestController
// @RequestMapping("api")
// public class EmployeeController {
//     private EmployeeService employeeService;

//     public EmployeeController(EmployeeService employeeService) {
//         this.employeeService = employeeService;
//     }
    
//     @GetMapping("employee")
//     public ResponseEntity<Object> get(){
//         List<Employee> employee = employeeService.get();
//         return ResponseHandler
//     }

// }
