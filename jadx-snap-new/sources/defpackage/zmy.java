package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: zmy */
public class zmy {
    private static final AtomicLong sIdGenerator = new AtomicLong();
    final zlv mAdapterViewType;
    private String mContentDescription;
    private String mDebugInfo;
    protected final long mId;

    public zmy(zlv zlv) {
        this(zlv, zmy.generateItemId());
    }

    public zmy(zlv zlv, long j) {
        this.mAdapterViewType = zlv;
        this.mId = j;
    }

    public static long generateItemId() {
        return sIdGenerator.incrementAndGet();
    }

    public boolean areContentsTheSame(zmy zmy) {
        return true;
    }

    public final boolean areItemsTheSame(zmy zmy) {
        return getId() == zmy.getId() && getType().equals(zmy.getType());
    }

    public String getContentDescription() {
        return this.mContentDescription;
    }

    public String getDebugInfo() {
        return this.mDebugInfo;
    }

    public long getId() {
        return this.mId;
    }

    public zlv getType() {
        return this.mAdapterViewType;
    }

    public void setContentDescription(String str) {
        this.mContentDescription = str;
    }

    public void setDebugInfo(String str) {
        this.mDebugInfo = str;
    }
}
