package com.snap.core.db.column;

import com.snap.core.db.record.DdmlDataModel;
import defpackage.ajym;
import defpackage.ajyu;
import defpackage.ajyw;
import defpackage.akbl;
import defpackage.akco;
import defpackage.akcr;
import defpackage.akgc;
import defpackage.ppy;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public final class ScreenshottedOrReplayedState {
    public static final Companion Companion = new Companion();
    private static final ScreenshottedOrReplayedState EMPTY = new ScreenshottedOrReplayedState(null, 1, null);
    private final List<Record> sortedInteractions;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }

        public final ScreenshottedOrReplayedState create(List<Record> list) {
            akcr.b(list, "records");
            return new ScreenshottedOrReplayedState(ajyu.a((Iterable) list, (Comparator) new ScreenshottedOrReplayedState$Companion$create$$inlined$sortedByDescending$1()), null);
        }

        public final ScreenshottedOrReplayedState empty() {
            return ScreenshottedOrReplayedState.EMPTY;
        }
    }

    public static final class Record {
        public static final Companion Companion = new Companion();
        private final boolean replayed;
        private final long screenRecordCount;
        private final long screenshotCount;
        private final long timestamp;
        private final long userId;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(akco akco) {
                this();
            }

            public final Record fromString(String str) {
                akcr.b(str, "databaseValue");
                List a = akgc.a((CharSequence) str, new String[]{ppy.b}, 0, 6);
                return new Record(Long.parseLong((String) a.get(0)), Long.parseLong((String) a.get(1)), Boolean.parseBoolean((String) a.get(2)), Long.parseLong((String) a.get(3)), a.size() > 4 ? Long.parseLong((String) a.get(4)) : 0);
            }

            public final String toString(Record record) {
                akcr.b(record, DdmlDataModel.RECORD);
                return ajyu.a((Iterable) ajym.b(Long.valueOf(record.getUserId()), String.valueOf(record.getTimestamp()), String.valueOf(record.getReplayed()), String.valueOf(record.getScreenshotCount()), String.valueOf(record.getScreenRecordCount())), (CharSequence) ppy.b, null, null, 0, null, null, 62);
            }
        }

        public Record(long j, long j2, boolean z, long j3, long j4) {
            this.userId = j;
            this.timestamp = j2;
            this.replayed = z;
            this.screenshotCount = j3;
            this.screenRecordCount = j4;
        }

        public /* synthetic */ Record(long j, long j2, boolean z, long j3, long j4, int i, akco akco) {
            this(j, j2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? 0 : j3, (i & 16) != 0 ? 0 : j4);
        }

        public static /* synthetic */ Record copy$default(Record record, long j, long j2, boolean z, long j3, long j4, int i, Object obj) {
            Record record2 = record;
            return record.copy((i & 1) != 0 ? record2.userId : j, (i & 2) != 0 ? record2.timestamp : j2, (i & 4) != 0 ? record2.replayed : z, (i & 8) != 0 ? record2.screenshotCount : j3, (i & 16) != 0 ? record2.screenRecordCount : j4);
        }

        public static final Record fromString(String str) {
            return Companion.fromString(str);
        }

        public static final String toString(Record record) {
            return Companion.toString(record);
        }

        public final long component1() {
            return this.userId;
        }

        public final long component2() {
            return this.timestamp;
        }

        public final boolean component3() {
            return this.replayed;
        }

        public final long component4() {
            return this.screenshotCount;
        }

        public final long component5() {
            return this.screenRecordCount;
        }

        public final Record copy(long j, long j2, boolean z, long j3, long j4) {
            return new Record(j, j2, z, j3, j4);
        }

        public final boolean equals(Object obj) {
            int i = 0;
            if (obj == null || !(obj instanceof Record)) {
                return false;
            }
            Record record = (Record) obj;
            int i2 = ((this.userId == record.userId ? 1 : 0) & (this.replayed == record.replayed ? 1 : 0)) & (this.screenshotCount == record.screenshotCount ? 1 : 0);
            if (this.screenRecordCount == record.screenRecordCount) {
                i = 1;
            }
            return i2 & i;
        }

        public final boolean getReplayed() {
            return this.replayed;
        }

        public final long getScreenRecordCount() {
            return this.screenRecordCount;
        }

        public final long getScreenshotCount() {
            return this.screenshotCount;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public final long getUserId() {
            return this.userId;
        }

        public final int hashCode() {
            return Objects.hash(new Object[]{Long.valueOf(this.userId), Boolean.valueOf(this.replayed), Long.valueOf(this.screenshotCount), Long.valueOf(this.screenRecordCount)});
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("Record(userId=");
            stringBuilder.append(this.userId);
            stringBuilder.append(", timestamp=");
            stringBuilder.append(this.timestamp);
            stringBuilder.append(", replayed=");
            stringBuilder.append(this.replayed);
            stringBuilder.append(", screenshotCount=");
            stringBuilder.append(this.screenshotCount);
            stringBuilder.append(", screenRecordCount=");
            stringBuilder.append(this.screenRecordCount);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    private ScreenshottedOrReplayedState(List<Record> list) {
        this.sortedInteractions = list;
    }

    /* synthetic */ ScreenshottedOrReplayedState(List list, int i, akco akco) {
        if ((i & 1) != 0) {
            list = ajyw.a;
        }
        this(list);
    }

    public /* synthetic */ ScreenshottedOrReplayedState(List list, akco akco) {
        this(list);
    }

    public static final ScreenshottedOrReplayedState create(List<Record> list) {
        return Companion.create(list);
    }

    public static final ScreenshottedOrReplayedState empty() {
        return Companion.empty();
    }

    public final List<Record> getSortedInteractions() {
        return this.sortedInteractions;
    }

    public final boolean isReplayed() {
        Iterable<Record> iterable = this.sortedInteractions;
        if (!((iterable instanceof Collection) && ((Collection) iterable).isEmpty())) {
            for (Record replayed : iterable) {
                if (replayed.getReplayed()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean isScreenRecorded() {
        Iterable<Record> iterable = this.sortedInteractions;
        if (!((iterable instanceof Collection) && ((Collection) iterable).isEmpty())) {
            for (Record screenRecordCount : iterable) {
                Object obj;
                if (screenRecordCount.getScreenRecordCount() > 0) {
                    obj = 1;
                    continue;
                } else {
                    obj = null;
                    continue;
                }
                if (obj != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean isScreenshotted() {
        Iterable<Record> iterable = this.sortedInteractions;
        if (!((iterable instanceof Collection) && ((Collection) iterable).isEmpty())) {
            for (Record screenshotCount : iterable) {
                Object obj;
                if (screenshotCount.getScreenshotCount() > 0) {
                    obj = 1;
                    continue;
                } else {
                    obj = null;
                    continue;
                }
                if (obj != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Record latestScreenshottedOrReplayedRecord() {
        return (Record) ajyu.g(this.sortedInteractions);
    }

    public final Set<Long> replayedUserIdSet() {
        Set linkedHashSet = new LinkedHashSet();
        for (Record record : this.sortedInteractions) {
            if (record.getReplayed()) {
                linkedHashSet.add(Long.valueOf(record.getUserId()));
            }
        }
        return linkedHashSet;
    }

    public final Set<Long> screenRecordedUserIdSet() {
        Set linkedHashSet = new LinkedHashSet();
        for (Record record : this.sortedInteractions) {
            if (record.getScreenRecordCount() > 0) {
                linkedHashSet.add(Long.valueOf(record.getUserId()));
            }
        }
        return linkedHashSet;
    }

    public final long screenshotCountForUser(long j) {
        for (Record record : this.sortedInteractions) {
            if (record.getUserId() == j) {
                return record.getScreenshotCount();
            }
        }
        return 0;
    }

    public final Set<Long> screenshottedUserIdSet() {
        Set linkedHashSet = new LinkedHashSet();
        for (Record record : this.sortedInteractions) {
            if (record.getScreenshotCount() > 0) {
                linkedHashSet.add(Long.valueOf(record.getUserId()));
            }
        }
        return linkedHashSet;
    }

    public final ScreenshottedOrReplayedState signal(Record record) {
        akcr.b(record, "newInteraction");
        Companion companion = Companion;
        Set p = ajyu.p(this.sortedInteractions);
        p.add(record);
        return companion.create(ajyu.a((Iterable) p, (Comparator) new ScreenshottedOrReplayedState$signal$$inlined$sortedByDescending$1()));
    }

    public final String toString() {
        return ajyu.a((Iterable) this.sortedInteractions, (CharSequence) ";", null, null, 0, null, (akbl) ScreenshottedOrReplayedState$toString$1.INSTANCE, 30);
    }
}
