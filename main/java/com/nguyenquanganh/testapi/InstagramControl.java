package com.nguyenquanganh.testapi;

import android.content.Context;

/**
 * Created by nguyenquanganh on 10/11/15.
 */
public class InstagramControl {
    private static InstagramControl instance;
    private String access_token = "";
    Context context;
    InstagramWebOAuth mOath;

    public static InstagramControl getInstance(){
        if (instance==null)
            instance = new InstagramControl();
        return instance;
    }

    public boolean hasAccessToken(){
        return !access_token.equals("");
    }

    public void authorize(){
        mOath.show();
    }

    public void setContext(Context c){
        context = c;
        mOath = new InstagramWebOAuth(context);
    }
}
