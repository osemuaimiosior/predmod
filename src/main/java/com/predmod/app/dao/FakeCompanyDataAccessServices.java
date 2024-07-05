package com.predmod.app.dao;

import com.predmod.app.model.Company;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("fakeDaO")
public class FakeCompanyDataAccessServices implements CompanyDao {

    private static List<Company> db = new ArrayList<>();

    @Override
    public int insertCompany(UUID id, Company company) {
        db.add(new Company(company.getId(),
                company.getCompanySize(),
                company.getLocation(),
                company.getIndustry(),
                company.getEstYear(),
                company.getAbout(),
                company.getName()));
        return 1;
    }
}


