package com.realeyes.primetime.mbp_android;

import java.lang.reflect.Array;

/**
 * Created by JohnGainfort on 3/11/15.
 */
public class Media {

    public String mTitle;
    public String mAuthor;
    public String mImageName;
    public String mDescription;

    public Media (String startTitle, String startAuthor, String startImageName, String startDescription) {
        this.mTitle = startTitle;
        this.mAuthor = startAuthor;
        this.mImageName = startImageName;
        this.mDescription = startDescription;
    }
}
