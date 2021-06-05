package com.example.android.quakereport;

public class Earthquake {
    double mmag;
    String mplace;
    long mTimeInMs;
    String mUrl;

   public Earthquake(double mag,String place, long timeInMs, String Url){
        mmag = mag;
        mplace = place;
        mTimeInMs = timeInMs;
        mUrl = Url;
    }

    public double getMagnitude() {
        return mmag;
    }

    public String getPlace() {
        return mplace;
    }

    public long getTimeInMs() {
        return mTimeInMs;
    }

    public String getUrl() {
        return mUrl;
    }

}
