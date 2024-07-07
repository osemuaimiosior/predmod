package com.predmod.app.dao;

import com.predmod.app.model.Company;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("Postgress")
public class CompanyDataAccessService implements CompanyDao{
    @Override
    public int insertCompany(int id, Company company) {
        return 0;
    }

    @Override
    public List<Company> getAllCompany() {
        return List.of();
    }

    @Override
    public Optional<Company> getCompanyByEmail(String email) {
        return Optional.empty();
    }

    @Override
    public Optional<Company> getAllCompanyByLocation(String location) {
        return Optional.empty();
    }

    @Override
    public int deletCompnayByEmail(String email) {
        return 0;
    }

    @Override
    public int updateCompanyInfo(String email, Company company) {
        return 0;
    }
}
