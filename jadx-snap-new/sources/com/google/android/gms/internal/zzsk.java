package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

public interface zzsk extends IInterface {
    void destroy();

    String getAdvertiser();

    String getBody();

    String getCallToAction();

    String getHeadline();

    List getImages();

    String getMediationAdapterClassName();

    String getPrice();

    double getStarRating();

    String getStore();

    zzmm getVideoController();

    void performClick(Bundle bundle);

    boolean recordImpression(Bundle bundle);

    void reportTouchEvent(Bundle bundle);

    zzqs zzkc();

    IObjectWrapper zzkd();

    IObjectWrapper zzkh();

    zzqo zzki();
}
