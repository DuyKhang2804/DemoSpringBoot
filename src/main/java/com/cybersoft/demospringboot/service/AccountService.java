package com.cybersoft.demospringboot.service;

import com.cybersoft.demospringboot.model.AccountModel;

import java.util.List;

public interface AccountService {
    void insert(AccountModel accountModel);
    AccountModel findById(int id);
    List<AccountModel> getAll();
}
