package com.broken;

import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class MyUserRepoImpl implements UserRepo<MyUser> {

    @Autowired
    public MyUserRepoImpl() {
    }

    @Override
    public boolean update(@NotNull MyUser myUser) {
        return true;
    }
}
