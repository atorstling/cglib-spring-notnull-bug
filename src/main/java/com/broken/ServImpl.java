package com.broken;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServImpl implements Serv {

    private final MyUserRepo myUserRepo;

    @Autowired
    public ServImpl(MyUserRepo myUserRepo) {
        this.myUserRepo = myUserRepo;
    }
    
    @Override
    public char getIt() {
        return myUserRepo.getIt();
    }
}
