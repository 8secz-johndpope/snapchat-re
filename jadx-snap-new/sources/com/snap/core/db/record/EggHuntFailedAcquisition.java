package com.snap.core.db.record;

import defpackage.akcr;
import defpackage.akfu;

public interface EggHuntFailedAcquisition {

    public static final class Impl implements EggHuntFailedAcquisition {
        private final long _id;
        private final long color;
        private final String eggId;
        private final long pointValue;

        public Impl(long j, String str, long j2, long j3) {
            akcr.b(str, "eggId");
            this._id = j;
            this.eggId = str;
            this.color = j2;
            this.pointValue = j3;
        }

        public static /* synthetic */ Impl copy$default(Impl impl, long j, String str, long j2, long j3, int i, Object obj) {
            return impl.copy((i & 1) != 0 ? impl.get_id() : j, (i & 2) != 0 ? impl.getEggId() : str, (i & 4) != 0 ? impl.getColor() : j2, (i & 8) != 0 ? impl.getPointValue() : j3);
        }

        public final long component1() {
            return get_id();
        }

        public final String component2() {
            return getEggId();
        }

        public final long component3() {
            return getColor();
        }

        public final long component4() {
            return getPointValue();
        }

        public final Impl copy(long j, String str, long j2, long j3) {
            String str2 = str;
            akcr.b(str, "eggId");
            return new Impl(j, str2, j2, j3);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Impl) {
                    Impl impl = (Impl) obj;
                    if ((get_id() == impl.get_id() ? 1 : null) != null && akcr.a(getEggId(), impl.getEggId())) {
                        if ((getColor() == impl.getColor() ? 1 : null) != null) {
                            if ((getPointValue() == impl.getPointValue() ? 1 : null) != null) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final long getColor() {
            return this.color;
        }

        public final String getEggId() {
            return this.eggId;
        }

        public final long getPointValue() {
            return this.pointValue;
        }

        public final long get_id() {
            return this._id;
        }

        public final int hashCode() {
            long j = get_id();
            int i = ((int) (j ^ (j >>> 32))) * 31;
            String eggId = getEggId();
            i = (i + (eggId != null ? eggId.hashCode() : 0)) * 31;
            long color = getColor();
            i = (i + ((int) (color ^ (color >>> 32)))) * 31;
            color = getPointValue();
            return i + ((int) (color ^ (color >>> 32)));
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("\n        |EggHuntFailedAcquisition.Impl [\n        |  _id: ");
            stringBuilder.append(get_id());
            stringBuilder.append("\n        |  eggId: ");
            stringBuilder.append(getEggId());
            stringBuilder.append("\n        |  color: ");
            stringBuilder.append(getColor());
            stringBuilder.append("\n        |  pointValue: ");
            stringBuilder.append(getPointValue());
            stringBuilder.append("\n        |]\n        ");
            return akfu.a(stringBuilder.toString(), "|");
        }
    }

    long getColor();

    String getEggId();

    long getPointValue();

    long get_id();
}
