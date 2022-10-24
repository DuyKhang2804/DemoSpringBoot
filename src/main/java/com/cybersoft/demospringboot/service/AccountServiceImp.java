package com.cybersoft.demospringboot.service;

import com.cybersoft.demospringboot.model.AccountModel;
import com.cybersoft.demospringboot.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //Tầng xử lý logic code đưa lên bean
public class AccountServiceImp implements AccountService {

    @Autowired
    AccountRepository accountRepository;

    @Override
    public void insert(AccountModel accountModel) {
    accountRepository.insert(accountModel);
    }

    @Override
    public AccountModel findById(int id) {
        return accountRepository.findById(id);
    }

    @Override
    public List<AccountModel> getAll() {
        return accountRepository.getAll();
    }
}
