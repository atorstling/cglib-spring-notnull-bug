package com.broken;

import org.jetbrains.annotations.NotNull;

public interface UserRepo<T extends User> {
    //Change return type between boxed Boolean and primitive boolean for different exceptions
    boolean update(@NotNull T T);
}
