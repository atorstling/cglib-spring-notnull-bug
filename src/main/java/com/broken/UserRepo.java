package com.broken;

import org.jetbrains.annotations.NotNull;

public interface UserRepo<T extends User<I>, I> {
    //Change return type between boxed Boolean and primitive boolean for different exceptions
    Boolean update(@NotNull T T);
}
