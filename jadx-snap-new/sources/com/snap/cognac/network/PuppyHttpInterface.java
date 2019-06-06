package com.snap.cognac.network;

import defpackage.aebx;
import defpackage.aeby;
import defpackage.aebz;
import defpackage.aeca;
import defpackage.ajdx;
import defpackage.akxk;
import defpackage.akxs;
import defpackage.akxu;
import defpackage.akxy;
import defpackage.akyh;

public interface PuppyHttpInterface {
    public static final String APPLICATION_X_PROTOBUF = "Accept: application/x-protobuf";
    public static final String BASE_URL = "https://puppy.snapchat.com/cognac-api/v1";
    public static final String LIST_BUILD = "https://puppy.snapchat.com/cognac-api/v1/list_builds";
    public static final String LIST_PROJECT = "https://puppy.snapchat.com/cognac-api/v1/list_projects";
    public static final String PUPPY_ANDROID = "X-Snapchat-Puppy-Android: true";
    public static final String SNAP_TOKEN_HEADER_KEY = "X-Snap-Access-Token";

    @akxu(a = {"Accept: application/x-protobuf"})
    @akxy
    ajdx<aeby> getBuildList(@akyh String str, @akxs(a = "X-Snap-Access-Token") String str2, @akxk aebx aebx);

    @akxu(a = {"Accept: application/x-protobuf"})
    @akxy
    ajdx<aeca> getProjectList(@akyh String str, @akxs(a = "X-Snap-Access-Token") String str2, @akxk aebz aebz);
}
