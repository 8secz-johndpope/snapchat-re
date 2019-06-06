package com.snap.composer.blizzard;

import com.snap.composer.blizzard.Logging.DefaultImpls;
import defpackage.akcr;
import defpackage.dis;

public final class LoggingImpl implements Logging {
    private final dis a;

    public LoggingImpl(dis dis) {
        akcr.b(dis, "eventLogger");
        this.a = dis;
    }

    public final void logBlizzardEvent(Event event) {
        dis dis;
        LoggingImpl$logBlizzardEvent$1 loggingImpl$logBlizzardEvent$1;
        akcr.b(event, "event");
        if (event.getUserTracked()) {
            dis = this.a;
            loggingImpl$logBlizzardEvent$1 = new LoggingImpl$logBlizzardEvent$1(event);
        } else {
            dis = this.a;
            loggingImpl$logBlizzardEvent$1 = new LoggingImpl$logBlizzardEvent$2(event);
        }
        dis.a(loggingImpl$logBlizzardEvent$1);
    }

    public final Object toJavaScript() {
        return DefaultImpls.toJavaScript(this);
    }
}
