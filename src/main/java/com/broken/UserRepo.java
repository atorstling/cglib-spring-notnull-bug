package com.broken;

import org.jetbrains.annotations.NotNull;

public interface UserRepo<T extends User<I>, I> {
    boolean update(@NotNull T T);
    char getIt();
}
