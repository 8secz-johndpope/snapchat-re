package org.chromium.net.impl;

import defpackage.akpi.b;
import java.util.Date;

public final class CronetMetrics extends b {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final long mConnectEndMs;
    private final long mConnectStartMs;
    private final long mDnsEndMs;
    private final long mDnsStartMs;
    private final long mPushEndMs;
    private final long mPushStartMs;
    private final Long mReceivedByteCount;
    private final long mRequestEndMs;
    private final long mRequestStartMs;
    private final long mResponseStartMs;
    private final long mSendingEndMs;
    private final long mSendingStartMs;
    private final Long mSentByteCount;
    private final boolean mSocketReused;
    private final long mSslEndMs;
    private final long mSslStartMs;
    private final Long mTotalTimeMs;
    private final Long mTtfbMs;

    public CronetMetrics(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, boolean z, long j14, long j15) {
        long j16 = j;
        long j17 = j12;
        long j18 = j13;
        this.mRequestStartMs = j16;
        this.mDnsStartMs = j2;
        this.mDnsEndMs = j3;
        this.mConnectStartMs = j4;
        this.mConnectEndMs = j5;
        this.mSslStartMs = j6;
        this.mSslEndMs = j7;
        this.mSendingStartMs = j8;
        this.mSendingEndMs = j9;
        this.mPushStartMs = j10;
        this.mPushEndMs = j11;
        this.mResponseStartMs = j17;
        this.mRequestEndMs = j18;
        this.mSocketReused = z;
        this.mSentByteCount = Long.valueOf(j14);
        this.mReceivedByteCount = Long.valueOf(j15);
        if (j16 == -1 || j17 == -1) {
            this.mTtfbMs = null;
        } else {
            this.mTtfbMs = Long.valueOf(j17 - j16);
        }
        if (j16 == -1 || j18 == -1) {
            this.mTotalTimeMs = null;
        } else {
            this.mTotalTimeMs = Long.valueOf(j18 - j16);
        }
    }

    private static Date a(long j) {
        return j != -1 ? new Date(j) : null;
    }

    private static boolean a(long j, long j2) {
        return (j2 >= j && j != -1) || j2 == -1;
    }

    public final Date a() {
        return a(this.mRequestStartMs);
    }

    public final Date b() {
        return a(this.mDnsStartMs);
    }

    public final Date c() {
        return a(this.mDnsEndMs);
    }

    public final Date d() {
        return a(this.mConnectStartMs);
    }

    public final Date e() {
        return a(this.mConnectEndMs);
    }

    public final Date f() {
        return a(this.mSslStartMs);
    }

    public final Date g() {
        return a(this.mSslEndMs);
    }

    public final Date h() {
        return a(this.mSendingStartMs);
    }

    public final Date i() {
        return a(this.mRequestEndMs);
    }

    public final boolean j() {
        return this.mSocketReused;
    }

    public final Long k() {
        return this.mTtfbMs;
    }

    public final Long l() {
        return this.mTotalTimeMs;
    }
}
