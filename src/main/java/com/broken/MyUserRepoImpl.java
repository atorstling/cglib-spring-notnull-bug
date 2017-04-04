package com.broken;

import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class MyUserRepoImpl implements MyUserRepo {

    private final char assignedField;

    @Autowired
    public MyUserRepoImpl(@NotNull DataSource dataSource, String otherParam) {
        assignedField = otherParam.charAt(1);
    }

    @Override
    public boolean update(@NotNull MyUser myUser) {
        return true;
    }

    @Override
    public char getIt() {
        return assignedField;
    }
}
