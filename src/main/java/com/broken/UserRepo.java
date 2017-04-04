package com.broken;

import org.jetbrains.annotations.NotNull;

public interface UserRepo<T extends User<I>, I> {
    Boolean update(@NotNull T T);
}
