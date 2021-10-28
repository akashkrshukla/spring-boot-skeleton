package com.nexttech.springJDBC;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/")
public class MainController {
    private final CustomerService customerService;

    @Autowired
    public MainController(CustomerService customerService){
        this.customerService = customerService;
    }

    @GetMapping(path="/testConnectivity")
    public ResponseEntity<String> testConnectivity() {
        return ResponseEntity.ok(customerService.checkDatabaseConnectivity());
    }
}
