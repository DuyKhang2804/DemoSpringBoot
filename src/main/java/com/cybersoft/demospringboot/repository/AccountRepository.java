package com.cybersoft.demospringboot.repository;

import com.cybersoft.demospringboot.model.AccountModel;

import java.util.List;

public interface AccountRepository {
    public AccountModel findById(int id);
    public void insert(AccountModel accountModel);
    public void update(AccountModel accountModel);
    public List<AccountModel> getAll();
}
