package com.predmod.app.api;

import com.predmod.app.model.Company;
import com.predmod.app.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {
    private final CompanyService companyService;
    @Autowired
    public CompanyController(CompanyService companyService) {

        this.companyService = companyService;
    }
    @PostMapping
    public void addCompany (Company company) {

        companyService.addCompany(company);
    }
}
