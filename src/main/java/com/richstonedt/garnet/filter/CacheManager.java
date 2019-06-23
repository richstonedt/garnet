package com.richstonedt.garnet.filter;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * <b><code>CacheManagerImpl</code></b>
 * <p>
 * class_comment
 * </p>
 * <b>Create Time:</b> 2018/11/22 11:39
 *
 * @author Xuan Rui
 */
public class CacheManager {

    /**
     * The constant caches.
     */
    private static Map<String, String> caches = new ConcurrentHashMap<String, String>();

    private static CacheManager cm = null;

    /**
     * Instantiates a new Cache manager.
     */
    public CacheManager() {
    }

    public static CacheManager getInstance(){
        if(cm==null){
            cm = new CacheManager();
        }
        return cm;
    }

    /**
     * 存入缓存
     *
     * @param key
     * @param cache
     */
    public void putCache(String key, String cache) {
        try {
            caches.put(key, cache);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取对应缓存
     *
     * @param key
     * @return
     */
    public String getCacheByKey(String key) {
        if (this.isContains(key)) {
            return caches.get(key);
        }
        return null;
    }

    /**
     * 获取对应缓存
     *
     * @param key
     * @return
     */
    public Object getCacheDataByKey(String key) {
        if (this.isContains(key)) {
            return caches.get(key);
        }
        return null;
    }


    /**
     * Gets cache all.
     *
     * @return the cache all
     */
    public Map<String, String> getCacheAll() {
        return caches;
    }

    /**
     * 判断是否在缓存中
     *
     * @param key
     * @return
     */
    public boolean isContains(String key) {
        return caches.containsKey(key);
    }

    /**
     * 清除所有缓存
     */
    public void clearAll() {
        caches.clear();
    }

    /**
     * 清除对应缓存
     *
     * @param key
     */
    public void clearByKey(String key) {
        if (this.isContains(key)) {
            caches.remove(key);
        }
    }

    /**
     * 获取所有key
     *
     * @return
     */
    public Set<String> getAllKeys() {
        return caches.keySet();
    }
}
