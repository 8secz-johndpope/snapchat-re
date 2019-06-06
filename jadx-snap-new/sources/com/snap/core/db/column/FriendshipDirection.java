package com.snap.core.db.column;

import defpackage.akco;
import defpackage.akcr;

public enum FriendshipDirection {
    UNKNOWN,
    INCOMING,
    OUTGOING,
    BOTH;
    
    public static final Companion Companion = null;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }

        public final FriendshipDirection fromString(String str) {
            akcr.b(str, "value");
            try {
                return FriendshipDirection.valueOf(str);
            } catch (Exception unused) {
                return FriendshipDirection.UNKNOWN;
            }
        }
    }

    static {
        Companion = new Companion();
    }

    public static final FriendshipDirection fromString(String str) {
        return Companion.fromString(str);
    }
}
