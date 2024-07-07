package com.predmod.app.service;

import com.predmod.app.dao.CompanyDao;
import com.predmod.app.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.*;

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

    public List<Company> getAllCompany(){
        return companyDao.getAllCompany();
    }

    public Optional<Company> getCompanyByEmail( String email){
        return companyDao.getCompanyByEmail(email);
    }

    public Optional<Company> getCompanyByLocation(String location){
        return companyDao.getAllCompanyByLocation(location);
    }

    public int deletCompnayByEmail(String email){
        return companyDao.deletCompnayByEmail(email);
    }

    public int updateCompanyInfo(String email, Company company){
        return companyDao.updateCompanyInfo(email, company);
    }
}
