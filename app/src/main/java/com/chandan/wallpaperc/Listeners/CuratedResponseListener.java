package com.chandan.wallpaperc.Listeners;

import com.chandan.wallpaperc.Models.CuratedApiResponse;

public interface CuratedResponseListener {
    void onFetch(CuratedApiResponse response, String message);
    void onError(String message);
}
