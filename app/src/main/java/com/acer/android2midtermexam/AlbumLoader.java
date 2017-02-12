package com.acer.android2midtermexam;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.ArrayList;

/**
 * Created by Acer on 11/02/2017.
 */

public class AlbumLoader extends AsyncTaskLoader<ArrayList<Album>>{

    private String mUrl;

    public AlbumLoader(Context context, String mUrl) {
        super(context);
        this.mUrl = mUrl;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public ArrayList<Album> loadInBackground() {
        if(mUrl == null)
            return null;

        return QueryUtils.fetchAlbumData(mUrl);
    }
}
