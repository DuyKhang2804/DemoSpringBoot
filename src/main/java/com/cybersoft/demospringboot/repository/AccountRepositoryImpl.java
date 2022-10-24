package com.cybersoft.demospringboot.repository;

import com.cybersoft.demospringboot.model.AccountModel;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AccountRepositoryImpl implements AccountRepository {

    private List<AccountModel> list = new ArrayList<>();

    @Override
    public AccountModel findById(int id){
        for (AccountModel model : list)
            if(model.getId() == id){
                return model;
            }
        return null;
    };

    @Override
    public void insert(AccountModel accountModel){
        list.add(accountModel);
    };

    @Override
    public void update(AccountModel accountModel){

    }

    @Override
    public List<AccountModel> getAll() {
        return list;
    }

    ;
}
