package com.predmod.app.dao;

import com.predmod.app.model.Company;
import java.util.*;

public interface CompanyDao {
    
    int insertCompany(int id, Company company);

    default int insertCompany(Company company) {
        //UUID id = UUID.randomUUID();
        Random random = new Random();
        int id = random.nextInt();
        return insertCompany(id, company);
    }

    List<Company> getAllCompany();

    Optional<Company> getCompanyByEmail(String email);

    Optional<Company> getAllCompanyByLocation(String location);

    int deletCompnayByEmail(String email);

    int updateCompanyInfo(String email, Company company);
}
