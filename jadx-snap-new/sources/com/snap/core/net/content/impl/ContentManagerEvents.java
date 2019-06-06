package com.snap.core.net.content.impl;

import defpackage.akcr;
import defpackage.geg;
import defpackage.gej;
import defpackage.ryz;
import defpackage.sai;
import defpackage.sat;

public final class ContentManagerEvents {

    public static final class OnRequestComplete {
        public final geg a;
        public final gej b;

        public OnRequestComplete(geg geg, gej gej) {
            akcr.b(geg, "contentRequest");
            akcr.b(gej, "contentResult");
            this.a = geg;
            this.b = gej;
        }
    }

    public static final class OnCacheEnd {
        public final geg a;
        public final gej b;

        public OnCacheEnd(geg geg, gej gej) {
            akcr.b(geg, "contentRequest");
            this.a = geg;
            this.b = gej;
        }
    }

    public static final class OnBoltRequestStart {
        public final geg a;

        public OnBoltRequestStart(geg geg) {
            akcr.b(geg, "contentRequest");
            this.a = geg;
        }
    }

    public static final class OnNetworkRequestStart {
        public final geg a;
        private final ryz b;

        public OnNetworkRequestStart(geg geg, ryz ryz) {
            akcr.b(geg, "contentRequest");
            akcr.b(ryz, "networkRequest");
            this.a = geg;
            this.b = ryz;
        }
    }

    public static final class OnRequestReceived {
        private final geg a;

        public OnRequestReceived(geg geg) {
            akcr.b(geg, "contentRequest");
            this.a = geg;
        }
    }

    public static final class OnRequestStart {
        private final geg a;

        public OnRequestStart(geg geg) {
            akcr.b(geg, "contentRequest");
            this.a = geg;
        }
    }

    public static final class OnCacheStart {
        private final geg a;

        public OnCacheStart(geg geg) {
            akcr.b(geg, "contentRequest");
            this.a = geg;
        }
    }

    public static final class OnNetworkRequestMutate {
        private final geg a;
        private final ryz b;

        public OnNetworkRequestMutate(geg geg, ryz ryz) {
            akcr.b(geg, "contentRequest");
            akcr.b(ryz, "networkRequest");
            this.a = geg;
            this.b = ryz;
        }
    }

    public static final class OnNetworkResponseStart {
        private final geg a;
        private final sat<sai> b;

        public OnNetworkResponseStart(geg geg, sat<sai> sat) {
            akcr.b(geg, "contentRequest");
            akcr.b(sat, "networkResult");
            this.a = geg;
            this.b = sat;
        }
    }

    public static final class OnNetworkResponseEnd {
        private final geg a;
        private final sat<sai> b;

        public OnNetworkResponseEnd(geg geg, sat<sai> sat) {
            akcr.b(geg, "contentRequest");
            akcr.b(sat, "networkResult");
            this.a = geg;
            this.b = sat;
        }
    }

    public static final class OnImportRequestStart {
        private final geg a;

        public OnImportRequestStart(geg geg) {
            akcr.b(geg, "contentRequest");
            this.a = geg;
        }
    }

    public static final class OnImportRequestEnd {
        private final geg a;
        private final gej b;

        public OnImportRequestEnd(geg geg, gej gej) {
            akcr.b(geg, "contentRequest");
            akcr.b(gej, "contentResult");
            this.a = geg;
            this.b = gej;
        }
    }
}
