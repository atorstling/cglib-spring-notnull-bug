package com.broken;

import org.junit.Assert;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by alext on 2017-04-04.
 */
public class ReflectionTest {
    public static void main(String[] args) {
        final List<Method> methods = Arrays.asList(MyUserRepoImpl.class.getMethods())
                .stream()
                .filter(m -> m.getName().equals("update"))
                .collect(Collectors.toList());
        final String stringReprs = methods.stream()
                .map(m -> String.format("%s: bridge: %s, synthetic: %s", m, m.isBridge(), m.isSynthetic()))
                .collect(Collectors.joining("\n"));
        Assert.assertEquals("public boolean com.broken.MyUserRepoImpl.update(com.broken.MyUser): bridge: false, synthetic: false\n" +
                "public boolean com.broken.MyUserRepoImpl.update(com.broken.User): bridge: true, synthetic: true", stringReprs);
    }
}
