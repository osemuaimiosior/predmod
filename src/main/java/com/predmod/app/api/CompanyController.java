package com.predmod.app.api;

import com.predmod.app.model.Company;
import com.predmod.app.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RequestMapping("/company")
@RestController
public class CompanyController {
    private final CompanyService companyService;
    
    @Autowired
    public CompanyController(CompanyService companyService) {

        this.companyService = companyService;
    }

    @PostMapping
    public void addCompany (@RequestBody Company company) {

        companyService.addCompany(company);
    }

    @GetMapping
    public List<Company> getAllCompany(){

        return companyService.getAllCompany();
    }

    @GetMapping(path = "{email}")
    public Company getCompanyByEmail(@PathVariable("email") String email){
        return companyService.getCompanyByEmail(email)
                                .orElse(null);
    }

    @GetMapping(path = "{location}")
    public Optional<Company> getAllCompanyByLocation(@PathVariable("location") String location){
        return companyService.getCompanyByLocation(location);
    }

    @DeleteMapping(path = "{email}")
    public void deletCompnayByEmail(@PathVariable("email") String email){
        companyService.deletCompnayByEmail(email);
    }

    @PutMapping(path = "{email}")
    public void updateCompanyInfo(@PathVariable("email") String email, @RequestBody Company companyUpdate){
        companyService.updateCompanyInfo(email, companyUpdate);
    }

}
