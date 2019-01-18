package com.yourl.service;

/**
 * Created by Sridharan.
 */
public interface IUrlStoreService {
    String findUrlById(String id);

    void storeUrl(String id, String url);
}
