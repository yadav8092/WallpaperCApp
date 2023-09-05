package com.chandan.wallpaperc.Listeners;

import com.chandan.wallpaperc.Models.SearchApiResponse;

public interface SearchResponseListener {
    void onFetch(SearchApiResponse response, String message);
    void onError(String message);
}
