package com.snap.network.transport.impl.client;

import com.brightcove.player.event.EventType;
import defpackage.akcr;
import defpackage.sai;
import defpackage.sak;
import defpackage.sao;
import defpackage.saq;

public final class FilterChainClientEvents {

    public static final class OnRequestReceived {
        private final sak<sai> a;

        public OnRequestReceived(sak<sai> sak) {
            akcr.b(sak, "request");
            this.a = sak;
        }
    }

    public static final class OnRequestStart {
        private final sak<sai> a;

        public OnRequestStart(sak<sai> sak) {
            akcr.b(sak, "request");
            this.a = sak;
        }
    }

    public static final class OnResponseStart {
        private final saq<sai> a;

        public OnResponseStart(saq<sai> saq) {
            akcr.b(saq, "request");
            this.a = saq;
        }
    }

    public static final class OnResponseEnd {
        private final sak<sai> a;
        private final Throwable b;

        public OnResponseEnd(sak<sai> sak, Throwable th) {
            akcr.b(sak, EventType.RESPONSE);
            this.a = sak;
            this.b = th;
        }
    }

    public static final class OnRequestFinishedInfo {
        private final sao a;

        public OnRequestFinishedInfo(sao sao) {
            akcr.b(sao, "requestFinishedInfo");
            this.a = sao;
        }
    }

    public static final class OnRequestCancel {
        private final sak<sai> a;

        public OnRequestCancel(sak<sai> sak) {
            akcr.b(sak, "request");
            this.a = sak;
        }
    }
}
