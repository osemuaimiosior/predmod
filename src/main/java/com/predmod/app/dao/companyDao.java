package com.predmod.app.dao;

import com.predmod.app.model.Company;
import java.util.*;

public interface CompanyDao {
    int insertCompany(UUID id, Company company);

    default int insertCompany(Company company) {
        UUID id = UUID.randomUUID();
        return insertCompany(id, company);
    }


}
