package com.addlive.djinni;

public final class CommunicationError {
    public static final int ALREADY_JOINED = 2009;
    public static final int BAD_AUTH = 2003;
    public static final int CLIENT_VERSION_NOT_SUPPORTED = 2011;
    public static final int COMM_AUTH_ERROR = 2004;
    public static final int INTERNAL = 2007;
    public static final int INVALID_HOST = 2001;
    public static final int INVALID_PORT = 2002;
    public static final int MEDIA_LINK_FAILURE = 2005;
    public static final int NEW_USER_CONNECTED_SAME_ID = 2015;
    public static final int REMOTE_END_DIED = 2006;

    public final String toString() {
        return "CommunicationError{}";
    }
}
