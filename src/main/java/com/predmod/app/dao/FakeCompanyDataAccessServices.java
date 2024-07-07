package com.predmod.app.dao;

import com.predmod.app.model.Company;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("fakeDao")
public class FakeCompanyDataAccessServices implements CompanyDao {

    private static List<Company> db = new ArrayList<>();

    @Override
    public int insertCompany(int id,Company company) {

        db.add(new Company( id,
                            company.getName(),
                            company.getEmail(),
                            company.getLocation(),
                            company.getIndustry(),
                            company.getCompanySize(),
                            company.getEstYear(),
                            company.getAbout()));
        return 1;
    }

    @Override
    public List<Company> getAllCompany() {
        return db;
    }

    @Override
    public Optional<Company> getCompanyByEmail(String email) {
        return db.stream()
                .filter(company -> company.getEmail().equals(email))
                .findFirst();
    }

    @Override
    public Optional<Company> getAllCompanyByLocation(String location) {
            return db.stream()
                    .filter(company -> company.getLocation().equals(location))
                    .findAny();
    }

    @Override
    public int deletCompnayByEmail(String email) {
        Optional<Company> emailMaybe = getCompanyByEmail(email);
        if(emailMaybe.isEmpty()){
            return 0;
        }
        db.remove(emailMaybe.get());
                return 1;
    }

    @Override
    public int updateCompanyInfo(String email, Company company) {
        return getCompanyByEmail(email)
                .map(companies -> {
                    int indexOfCompanyToUpdate = db.indexOf(companies);
                    if(indexOfCompanyToUpdate >= 0){
                        db.set(indexOfCompanyToUpdate, new Company(
                                company.getId(),
                                company.getName(),
                                company.getEmail(),
                                company.getLocation(),
                                company.getIndustry(),
                                company.getCompanySize(),
                                company.getEstYear(),
                                company.getAbout()
                                )
                        );
                        return 1;
                    }
                    return 0;
                })
                .orElse(0);
    }

}


