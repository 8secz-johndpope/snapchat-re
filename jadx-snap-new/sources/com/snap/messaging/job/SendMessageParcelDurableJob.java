package com.snap.messaging.job;

import defpackage.ajyl;
import defpackage.ajyw;
import defpackage.akcr;
import defpackage.hwg;
import defpackage.hwh;
import defpackage.hwi;
import defpackage.hwk;
import defpackage.rek;
import java.util.List;

@hwk(a = "SEND_MESSAGE_PARCEL_JOB", b = String.class)
public final class SendMessageParcelDurableJob extends hwg<String> {
    public SendMessageParcelDurableJob(hwh hwh, String str) {
        akcr.b(hwh, "jobConfig");
        akcr.b(str, "id");
        super(hwh, str);
    }

    public SendMessageParcelDurableJob(String str, String str2, rek rek, Integer num) {
        hwh hwh;
        String str3 = str;
        rek rek2 = rek;
        akcr.b(str3, "id");
        akcr.b(rek2, "sendJobType");
        String str4 = "";
        if (rek2 == rek.IMMEDIATE_MESSAGE) {
            List list = ajyw.a;
            hwi hwi = hwi.APPEND;
            StringBuilder stringBuilder = new StringBuilder();
            if (str2 != null) {
                str4 = str2;
            }
            stringBuilder.append(str4);
            stringBuilder.append("~immediate");
            hwh = new hwh(0, list, hwi, stringBuilder.toString(), null, false, false, false, null, num, 432);
        } else {
            hwh hwh2 = new hwh(rek2 == rek.UPDATE_MESSAGE ? 5 : 3, ajyl.a(Integer.valueOf(1)), hwi.APPEND, str2 == null ? str4 : str2, null, true, rek2 == rek.NEW_MEDIA_MESSAGE, false, null, num, 400);
        }
        this(hwh, str3);
    }
}
