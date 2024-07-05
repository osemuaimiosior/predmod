package com.predmod.app.api;

import com.predmod.app.model.Company;
import com.predmod.app.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/v1/company")
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
}
