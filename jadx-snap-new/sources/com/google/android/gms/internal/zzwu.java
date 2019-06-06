package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

public interface zzwu extends IInterface {
    String getAdvertiser();

    String getBody();

    String getCallToAction();

    Bundle getExtras();

    String getHeadline();

    List getImages();

    boolean getOverrideClickHandling();

    boolean getOverrideImpressionRecording();

    zzmm getVideoController();

    void recordImpression();

    void zzb(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3);

    void zzh(IObjectWrapper iObjectWrapper);

    void zzi(IObjectWrapper iObjectWrapper);

    void zzj(IObjectWrapper iObjectWrapper);

    IObjectWrapper zzkh();

    zzqo zzki();

    zzqs zzkj();

    IObjectWrapper zzmw();

    IObjectWrapper zzmx();
}
