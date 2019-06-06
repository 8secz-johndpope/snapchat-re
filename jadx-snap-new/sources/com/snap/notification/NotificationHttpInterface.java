package com.snap.notification;

import defpackage.aejg;
import defpackage.aetr;
import defpackage.ajdx;
import defpackage.akhw;
import defpackage.akxa;
import defpackage.akxk;
import defpackage.akxy;

public interface NotificationHttpInterface {
    @akxy(a = "/monitor/push_notification_delivery_receipt")
    ajdx<akxa<akhw>> acknowledgeNotification(@akxk aetr aetr);

    @akxy(a = "/bq/device")
    ajdx<akxa<akhw>> updateDeviceToken(@akxk aejg aejg);
}
