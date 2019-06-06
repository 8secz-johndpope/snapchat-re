package com.snap.messaging.job;

import defpackage.akcr;
import defpackage.hwg;
import defpackage.hwh;
import defpackage.hwi;
import defpackage.hwk;
import defpackage.hwq;
import defpackage.reh;
import defpackage.rei;
import java.util.List;

@hwk(a = "SEND_CONVERSATION_MESSAGE_JOB", b = reh.class)
public final class SendConversationMessageDurableJob extends hwg<reh> {

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
    }

    public SendConversationMessageDurableJob(hwh hwh, reh reh) {
        akcr.b(hwh, "jobConfig");
        akcr.b(reh, "conversationMessageData");
        super(hwh, reh);
    }

    public SendConversationMessageDurableJob(String str, reh reh) {
        akcr.b(str, "conversationId");
        akcr.b(reh, "conversationMessageData");
        hwh hwh = rei.a;
        int i = hwh.a;
        List list = hwh.b;
        hwi hwi = hwh.c;
        hwq hwq = hwh.e;
        boolean z = hwh.f;
        boolean z2 = hwh.g;
        boolean z3 = hwh.h;
        String str2 = hwh.i;
        Integer num = hwh.j;
        akcr.b(list, "constraints");
        akcr.b(hwi, "existingJobPolicy");
        akcr.b(str, "uniqueSubTag");
        akcr.b(str2, "jobGroupTag");
        this(new hwh(i, list, hwi, str, hwq, z, z2, z3, str2, num), reh);
    }
}
