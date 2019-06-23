package com.richstonedt.garnet.cache;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

import java.util.concurrent.TimeUnit;

/**
 * 用于记录用户的登录状态  key为用户名，value为用户状态
 */
public class UserStatusCache {
    private final static Cache<String, String> cache = CacheBuilder.newBuilder().
            expireAfterAccess(20, TimeUnit.SECONDS).build();

    public static void setUserStatus(String userName, String userStatus) {
        cache.put(userName, userStatus);
    }

    public static String getUserStatus(String userName) {
        String result = cache.getIfPresent(userName);
        return result == null ? "" : result;
    }
}
