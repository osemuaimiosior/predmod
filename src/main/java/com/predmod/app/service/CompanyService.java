package com.predmod.app.service;

import com.predmod.app.dao.CompanyDao;
import com.predmod.app.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {


    
    private final CompanyDao companyDao;

    @Autowired
    public CompanyService(@Qualifier("fakeDao") CompanyDao companyDao) {
        this.companyDao = companyDao;
    }

    public int addCompany(Company company) {

        return companyDao.insertCompany(company);
    }
}
