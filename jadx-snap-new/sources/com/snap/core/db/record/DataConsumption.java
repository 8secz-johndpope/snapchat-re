package com.snap.core.db.record;

import defpackage.adsh;
import defpackage.aina;
import defpackage.akcr;
import defpackage.akfu;

public interface DataConsumption {

    public static final class Adapter {
        private final aina<adsh, byte[]> blobAdapter;

        public Adapter(aina<adsh, byte[]> aina) {
            akcr.b(aina, "blobAdapter");
            this.blobAdapter = aina;
        }

        public final aina<adsh, byte[]> getBlobAdapter() {
            return this.blobAdapter;
        }
    }

    public static final class Impl implements DataConsumption {
        private final long _id;
        private final adsh blob;
        private final String contentObjectId;
        private final String contentType;
        private final String featureType;
        private final Long fetchBeginTimestamp;
        private final Long firstAccessedTimestamp;
        private final String networkRequestId;

        public Impl(long j, String str, String str2, String str3, String str4, Long l, Long l2, adsh adsh) {
            akcr.b(str, "contentObjectId");
            akcr.b(str2, "networkRequestId");
            this._id = j;
            this.contentObjectId = str;
            this.networkRequestId = str2;
            this.contentType = str3;
            this.featureType = str4;
            this.fetchBeginTimestamp = l;
            this.firstAccessedTimestamp = l2;
            this.blob = adsh;
        }

        public static /* synthetic */ Impl copy$default(Impl impl, long j, String str, String str2, String str3, String str4, Long l, Long l2, adsh adsh, int i, Object obj) {
            int i2 = i;
            return impl.copy((i2 & 1) != 0 ? impl.get_id() : j, (i2 & 2) != 0 ? impl.getContentObjectId() : str, (i2 & 4) != 0 ? impl.getNetworkRequestId() : str2, (i2 & 8) != 0 ? impl.getContentType() : str3, (i2 & 16) != 0 ? impl.getFeatureType() : str4, (i2 & 32) != 0 ? impl.getFetchBeginTimestamp() : l, (i2 & 64) != 0 ? impl.getFirstAccessedTimestamp() : l2, (i2 & 128) != 0 ? impl.getBlob() : adsh);
        }

        public final long component1() {
            return get_id();
        }

        public final String component2() {
            return getContentObjectId();
        }

        public final String component3() {
            return getNetworkRequestId();
        }

        public final String component4() {
            return getContentType();
        }

        public final String component5() {
            return getFeatureType();
        }

        public final Long component6() {
            return getFetchBeginTimestamp();
        }

        public final Long component7() {
            return getFirstAccessedTimestamp();
        }

        public final adsh component8() {
            return getBlob();
        }

        public final Impl copy(long j, String str, String str2, String str3, String str4, Long l, Long l2, adsh adsh) {
            String str5 = str;
            akcr.b(str, "contentObjectId");
            String str6 = str2;
            akcr.b(str2, "networkRequestId");
            return new Impl(j, str5, str6, str3, str4, l, l2, adsh);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Impl) {
                    Impl impl = (Impl) obj;
                    if (!((get_id() == impl.get_id() ? 1 : null) != null && akcr.a(getContentObjectId(), impl.getContentObjectId()) && akcr.a(getNetworkRequestId(), impl.getNetworkRequestId()) && akcr.a(getContentType(), impl.getContentType()) && akcr.a(getFeatureType(), impl.getFeatureType()) && akcr.a(getFetchBeginTimestamp(), impl.getFetchBeginTimestamp()) && akcr.a(getFirstAccessedTimestamp(), impl.getFirstAccessedTimestamp()) && akcr.a(getBlob(), impl.getBlob()))) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public final adsh getBlob() {
            return this.blob;
        }

        public final String getContentObjectId() {
            return this.contentObjectId;
        }

        public final String getContentType() {
            return this.contentType;
        }

        public final String getFeatureType() {
            return this.featureType;
        }

        public final Long getFetchBeginTimestamp() {
            return this.fetchBeginTimestamp;
        }

        public final Long getFirstAccessedTimestamp() {
            return this.firstAccessedTimestamp;
        }

        public final String getNetworkRequestId() {
            return this.networkRequestId;
        }

        public final long get_id() {
            return this._id;
        }

        public final int hashCode() {
            long j = get_id();
            int i = ((int) (j ^ (j >>> 32))) * 31;
            String contentObjectId = getContentObjectId();
            int i2 = 0;
            i = (i + (contentObjectId != null ? contentObjectId.hashCode() : 0)) * 31;
            contentObjectId = getNetworkRequestId();
            i = (i + (contentObjectId != null ? contentObjectId.hashCode() : 0)) * 31;
            contentObjectId = getContentType();
            i = (i + (contentObjectId != null ? contentObjectId.hashCode() : 0)) * 31;
            contentObjectId = getFeatureType();
            i = (i + (contentObjectId != null ? contentObjectId.hashCode() : 0)) * 31;
            Long fetchBeginTimestamp = getFetchBeginTimestamp();
            i = (i + (fetchBeginTimestamp != null ? fetchBeginTimestamp.hashCode() : 0)) * 31;
            fetchBeginTimestamp = getFirstAccessedTimestamp();
            i = (i + (fetchBeginTimestamp != null ? fetchBeginTimestamp.hashCode() : 0)) * 31;
            adsh blob = getBlob();
            if (blob != null) {
                i2 = blob.hashCode();
            }
            return i + i2;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("\n        |DataConsumption.Impl [\n        |  _id: ");
            stringBuilder.append(get_id());
            stringBuilder.append("\n        |  contentObjectId: ");
            stringBuilder.append(getContentObjectId());
            stringBuilder.append("\n        |  networkRequestId: ");
            stringBuilder.append(getNetworkRequestId());
            stringBuilder.append("\n        |  contentType: ");
            stringBuilder.append(getContentType());
            stringBuilder.append("\n        |  featureType: ");
            stringBuilder.append(getFeatureType());
            stringBuilder.append("\n        |  fetchBeginTimestamp: ");
            stringBuilder.append(getFetchBeginTimestamp());
            stringBuilder.append("\n        |  firstAccessedTimestamp: ");
            stringBuilder.append(getFirstAccessedTimestamp());
            stringBuilder.append("\n        |  blob: ");
            stringBuilder.append(getBlob());
            stringBuilder.append("\n        |]\n        ");
            return akfu.a(stringBuilder.toString(), "|");
        }
    }

    adsh getBlob();

    String getContentObjectId();

    String getContentType();

    String getFeatureType();

    Long getFetchBeginTimestamp();

    Long getFirstAccessedTimestamp();

    String getNetworkRequestId();

    long get_id();
}
