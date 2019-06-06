package defpackage;

import android.support.v7.widget.RecyclerView.ItemAnimator;
import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.mapbox.mapboxsdk.style.sources.RasterSource;
import com.snap.core.db.SnapDbSchemaVersionControllerKt;
import com.snap.core.db.column.LocalMessageBodyType;
import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.column.ScreenshottedOrReplayedState.Record;
import org.opencv.imgproc.Imgproc;

/* renamed from: qwn */
public final class qwn {
    public final String a;
    public final Long b;
    public final boolean c;
    public final Record d;
    public final String e;
    public final Long f;
    public final aetf g;
    public final MessageClientStatus h;
    public final LocalMessageBodyType i;
    public Long j;
    public final Long k;
    private final boolean l;
    private final boolean m;
    private final boolean n;
    private final boolean o;
    private final boolean p;
    private final boolean q;

    /* JADX WARNING: Missing block: B:15:0x007d, code skipped:
            if (r1 == null) goto L_0x0084;
     */
    /* JADX WARNING: Missing block: B:17:0x0082, code skipped:
            if (r1 == null) goto L_0x0084;
     */
    public qwn(java.lang.String r5, java.lang.Long r6, boolean r7, com.snap.core.db.column.ScreenshottedOrReplayedState.Record r8, java.lang.String r9, java.lang.Long r10, defpackage.aetf r11, com.snap.core.db.column.MessageClientStatus r12, com.snap.core.db.column.LocalMessageBodyType r13, java.lang.Long r14, java.lang.Long r15, boolean r16, boolean r17, boolean r18, boolean r19) {
        /*
        r4 = this;
        r0 = r4;
        r1 = r12;
        r2 = r13;
        r3 = "messageClientStatus";
        defpackage.akcr.b(r12, r3);
        r3 = "messageBodyType";
        defpackage.akcr.b(r13, r3);
        r4.<init>();
        r3 = r5;
        r0.a = r3;
        r3 = r6;
        r0.b = r3;
        r3 = r7;
        r0.c = r3;
        r3 = r8;
        r0.d = r3;
        r3 = r9;
        r0.e = r3;
        r3 = r10;
        r0.f = r3;
        r3 = r11;
        r0.g = r3;
        r0.h = r1;
        r0.i = r2;
        r1 = r14;
        r0.j = r1;
        r1 = r15;
        r0.k = r1;
        r1 = r16;
        r0.n = r1;
        r1 = r17;
        r0.o = r1;
        r1 = r18;
        r0.p = r1;
        r1 = r19;
        r0.q = r1;
        r1 = r0.i;
        r2 = com.snap.core.db.column.LocalMessageBodyType.SNAP;
        r3 = 1;
        if (r1 != r2) goto L_0x0048;
    L_0x0046:
        r1 = 1;
        goto L_0x0049;
    L_0x0048:
        r1 = 0;
    L_0x0049:
        r0.l = r1;
        r1 = r0.q;
        r1 = r1 ^ r3;
        r0.m = r1;
        r1 = r0.b;
        if (r1 == 0) goto L_0x0073;
    L_0x0054:
        r1 = r0.f;
        if (r1 != 0) goto L_0x0059;
    L_0x0058:
        goto L_0x0073;
    L_0x0059:
        r1 = new java.lang.IllegalArgumentException;
        r2 = new java.lang.StringBuilder;
        r3 = "snapMessageTimestamp and chatMessageTimestamp cannot both be set! ";
        r2.<init>(r3);
        r3 = r4.toString();
        r2.append(r3);
        r2 = r2.toString();
        r1.<init>(r2);
        r1 = (java.lang.Throwable) r1;
        throw r1;
    L_0x0073:
        r1 = r0.j;
        if (r1 != 0) goto L_0x0087;
    L_0x0077:
        r1 = r0.l;
        if (r1 == 0) goto L_0x0080;
    L_0x007b:
        r1 = r0.b;
        if (r1 != 0) goto L_0x0087;
    L_0x007f:
        goto L_0x0084;
    L_0x0080:
        r1 = r0.f;
        if (r1 != 0) goto L_0x0087;
    L_0x0084:
        defpackage.akcr.a();
    L_0x0087:
        r1 = r1.longValue();
        r1 = java.lang.Long.valueOf(r1);
        r0.j = r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qwn.<init>(java.lang.String, java.lang.Long, boolean, com.snap.core.db.column.ScreenshottedOrReplayedState$Record, java.lang.String, java.lang.Long, aetf, com.snap.core.db.column.MessageClientStatus, com.snap.core.db.column.LocalMessageBodyType, java.lang.Long, java.lang.Long, boolean, boolean, boolean, boolean):void");
    }

    public /* synthetic */ qwn(String str, Long l, boolean z, Record record, String str2, Long l2, aetf aetf, MessageClientStatus messageClientStatus, LocalMessageBodyType localMessageBodyType, Long l3, Long l4, boolean z2, boolean z3, boolean z4, boolean z5, int i) {
        int i2 = i;
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : l, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? null : record, (i2 & 16) != 0 ? null : str2, (i2 & 32) != 0 ? null : l2, (i2 & 64) != 0 ? null : aetf, messageClientStatus, localMessageBodyType, (i2 & RasterSource.DEFAULT_TILE_SIZE) != 0 ? null : l3, (i2 & Imgproc.INTER_TAB_SIZE2) != 0 ? null : l4, (i2 & ItemAnimator.FLAG_MOVED) != 0 ? false : z2, (i2 & 4096) != 0 ? false : z3, (i2 & 8192) != 0 ? false : z4, (i2 & 16384) != 0 ? false : z5);
    }

    private final iin b() {
        if (this.h == MessageClientStatus.OK && this.n) {
            return iin.PENDING;
        }
        switch (qwo.c[this.h.ordinal()]) {
            case 1:
                return this.l ? iin.SNAP_SENDING : iin.CHAT_SENDING;
            case 2:
                return iin.WAITING_TO_SEND;
            case 3:
                return iin.PENDING;
            case 4:
                return iin.FAILED;
            case 5:
                return iin.FAILED_NON_RECOVERABLE;
            case 6:
                int i = qwo.b[this.i.ordinal()];
                if (i == 1) {
                    return (this.q && this.p) ? iin.MISSED_AUDIO_CALL_RECEIVED_AND_VIEWED : this.q ? iin.MISSED_AUDIO_CALL_RECEIVED_AND_NOT_VIEWED : (this.m && this.p) ? iin.MISSED_AUDIO_CALL_SENT_AND_OPENED : iin.MISSED_AUDIO_CALL_SENT_AND_NOT_OPENED;
                } else {
                    if (i == 2) {
                        return (this.q && this.p) ? iin.MISSED_VIDEO_CALL_RECEIVED_AND_VIEWED : this.q ? iin.MISSED_VIDEO_CALL_RECEIVED_AND_NOT_VIEWED : (this.m && this.p) ? iin.MISSED_VIDEO_CALL_SENT_AND_OPENED : iin.MISSED_VIDEO_CALL_SENT_AND_NOT_OPENED;
                    } else {
                        if (i == 3) {
                            return (!this.q || this.p) ? iin.CHAT_SCREENSHOT_AND_OPEN : iin.CHAT_SCREENSHOT;
                        } else {
                            if (i == 4) {
                                return (this.q && this.p) ? iin.CHAT_MEDIA_SAVE_RECEIVED_AND_OPEN : this.q ? iin.CHAT_MEDIA_SAVE_RECEIVED : iin.CHAT_MEDIA_SAVE_SENT;
                            } else {
                                if (i != 5) {
                                    return c();
                                }
                                aetf aetf = this.g;
                                if (aetf != null) {
                                    i = qwo.a[aetf.ordinal()];
                                    if (i == 1) {
                                        return iin.GROUP_MEMBER_JOINED;
                                    }
                                    if (i == 2) {
                                        return iin.GROUP_CREATED;
                                    }
                                    if (i == 3) {
                                        return iin.GROUP_NAME_UPDATED;
                                    }
                                }
                                return iin.CHAT_RECEIVED_AND_VIEWED;
                            }
                        }
                    }
                }
            default:
                throw new UnsupportedOperationException("Unhandled MessageClientStatus state for message: ".concat(String.valueOf(this)));
        }
    }

    private final iin c() {
        int d = d();
        switch (d) {
            case 0:
                return iin.CHAT_RECEIVED;
            case 1:
                return iin.CHAT_BIRTHDAY_RECEIVED;
            case 2:
            case 3:
                return iin.CHAT_SENT;
            case 4:
            case 5:
                return iin.CHAT_RECEIVED_AND_VIEWED;
            case 6:
            case 7:
                return iin.CHAT_SENT_AND_OPENED;
            default:
                switch (d) {
                    case 128:
                        return iin.SNAP_RECEIVED_AND_NOT_VIEWED_NO_SOUND;
                    case 129:
                        return iin.SNAP_RECEIVED_AND_NOT_VIEWED_BIRTHDAY_NO_SOUND;
                    case 130:
                    case Imgproc.COLOR_RGB2YUV_YV12 /*131*/:
                        return iin.SNAP_SENT_NO_SOUND;
                    case Imgproc.COLOR_BGR2YUV_YV12 /*132*/:
                    case Imgproc.COLOR_RGBA2YUV_YV12 /*133*/:
                        return iin.SNAP_RECEIVED_AND_VIEWED_NO_SOUND;
                    case Imgproc.COLOR_BGRA2YUV_YV12 /*134*/:
                    case 135:
                        return iin.SNAP_SENT_AND_OPENED_NO_SOUND;
                    case 136:
                        return iin.SNAP_RECEIVED_AND_NOT_VIEWED_SOUND;
                    case 137:
                        return iin.SNAP_RECEIVED_AND_NOT_VIEWED_BIRTHDAY_SOUND;
                    case 138:
                    case Imgproc.COLOR_COLORCVT_MAX /*139*/:
                        return iin.SNAP_SENT_SOUND;
                    case 140:
                    case 141:
                        return iin.SNAP_RECEIVED_AND_VIEWED_SOUND;
                    case 142:
                    case 143:
                        return iin.SNAP_SENT_AND_OPENED_SOUND;
                    default:
                        switch (d) {
                            case 148:
                            case 149:
                                return iin.SNAP_RECEIVED_AND_REPLAYED_NO_SOUND;
                            case MapboxConstants.ANIMATION_DURATION_SHORT /*150*/:
                            case 151:
                                return iin.SNAP_SENT_AND_REPLAYED_NO_SOUND;
                            default:
                                switch (d) {
                                    case 156:
                                    case 157:
                                        return iin.SNAP_RECEIVED_AND_REPLAYED_SOUND;
                                    case 158:
                                    case 159:
                                        return iin.SNAP_SENT_AND_REPLAYED_SOUND;
                                    case 160:
                                    case 161:
                                    case 164:
                                    case 165:
                                        return iin.SNAP_RECEIVED_AND_SCREENSHOTTED_NO_SOUND;
                                    case 162:
                                    case 163:
                                    case 166:
                                    case 167:
                                        return iin.SNAP_SENT_AND_SCREENSHOTTED_NO_SOUND;
                                    case 168:
                                    case 169:
                                    case 172:
                                    case 173:
                                        return iin.SNAP_RECEIVED_AND_SCREENSHOTTED_SOUND;
                                    case 170:
                                    case 171:
                                    case 174:
                                    case 175:
                                        return iin.SNAP_SENT_AND_SCREENSHOTTED_SOUND;
                                    case 176:
                                    case 177:
                                    case 180:
                                    case 181:
                                        return iin.SNAP_RECEIVED_AND_REPLAYED_AND_SCREENSHOTTED_NO_SOUND;
                                    case 178:
                                    case 179:
                                    case 182:
                                    case 183:
                                        return iin.SNAP_SENT_AND_REPLAYED_AND_SCREENSHOTTED_NO_SOUND;
                                    case 184:
                                    case 185:
                                    case 188:
                                    case 189:
                                        return iin.SNAP_RECEIVED_AND_REPLAYED_AND_SCREENSHOTTED_SOUND;
                                    case 186:
                                    case 187:
                                    case 190:
                                    case 191:
                                        return iin.SNAP_SENT_AND_REPLAYED_AND_SCREENSHOTTED_SOUND;
                                    case 192:
                                    case 193:
                                    case 196:
                                    case 197:
                                    case 224:
                                    case SnapDbSchemaVersionControllerKt.SNAP_DB_CURRENT_VERSION /*225*/:
                                    case 228:
                                    case 229:
                                        return iin.SNAP_RECEIVED_AND_SCREEN_RECORDED_NO_SOUND;
                                    case 194:
                                    case 195:
                                    case 198:
                                    case 199:
                                    case 226:
                                    case 227:
                                    case 230:
                                    case 231:
                                        return iin.SNAP_SENT_AND_SCREEN_RECORDED_NO_SOUND;
                                    case Callback.DEFAULT_DRAG_ANIMATION_DURATION /*200*/:
                                    case 201:
                                    case 204:
                                    case 205:
                                    case 232:
                                    case 233:
                                    case 236:
                                    case 237:
                                        return iin.SNAP_RECEIVED_AND_SCREEN_RECORDED_SOUND;
                                    case 202:
                                    case 203:
                                    case 206:
                                    case 207:
                                    case 234:
                                    case 235:
                                    case 238:
                                    case 239:
                                        return iin.SNAP_SENT_AND_SCREEN_RECORDED_SOUND;
                                    case 208:
                                    case 209:
                                    case 212:
                                    case 213:
                                    case 240:
                                    case 241:
                                    case 244:
                                    case 245:
                                        return iin.SNAP_RECEIVED_AND_REPLAYED_AND_SCREEN_RECORDED_NO_SOUND;
                                    case 210:
                                    case 211:
                                    case 214:
                                    case 215:
                                    case 242:
                                    case 243:
                                    case 246:
                                    case 247:
                                        return iin.SNAP_SENT_AND_REPLAYED_AND_SCREEN_RECORDED_NO_SOUND;
                                    case 216:
                                    case 217:
                                    case 220:
                                    case 221:
                                    case 248:
                                    case 249:
                                    case 252:
                                    case 253:
                                        return iin.SNAP_RECEIVED_AND_REPLAYED_AND_SCREEN_RECORDED_SOUND;
                                    case 218:
                                    case 219:
                                    case 222:
                                    case 223:
                                    case 250:
                                    case 251:
                                    case 254:
                                    case 255:
                                        return iin.SNAP_SENT_AND_REPLAYED_AND_SCREEN_RECORDED_SOUND;
                                    default:
                                        StringBuilder stringBuilder = new StringBuilder("message interaction #");
                                        stringBuilder.append(d);
                                        stringBuilder.append(" is not a supported type.");
                                        throw new IllegalStateException(stringBuilder.toString());
                                }
                        }
                }
        }
    }

    private final int d() {
        Record record = this.d;
        int i = 0;
        int i2 = (record == null || !record.getReplayed()) ? 0 : 1;
        Record record2 = this.d;
        int i3 = (record2 != null ? record2.getScreenshotCount() : 0) > 0 ? 1 : 0;
        Record record3 = this.d;
        if ((record3 != null ? record3.getScreenRecordCount() : 0) > 0) {
            i = 1;
        }
        return (((((i2 << 4) | (((i << 6) | (this.l << 7)) | (i3 << 5))) | (this.c << 3)) | (this.p << 2)) | (this.m << 1)) | this.o;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0022  */
    public final defpackage.qwm a() {
        /*
        r7 = this;
        r0 = r7.p;
        if (r0 == 0) goto L_0x0015;
    L_0x0004:
        r0 = r7.l;
        if (r0 == 0) goto L_0x0015;
    L_0x0008:
        r0 = r7.d;
        if (r0 == 0) goto L_0x0015;
    L_0x000c:
        r0 = r0.getUserId();
        r0 = java.lang.Long.valueOf(r0);
        goto L_0x0017;
    L_0x0015:
        r0 = r7.k;
    L_0x0017:
        r5 = r0;
        r0 = new qwm;
        r2 = r7.b();
        r1 = r7.j;
        if (r1 != 0) goto L_0x0025;
    L_0x0022:
        defpackage.akcr.a();
    L_0x0025:
        r3 = r1.longValue();
        r6 = 8;
        r1 = r0;
        r1.<init>(r2, r3, r5, r6);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qwn.a():qwm");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof qwn) {
                qwn qwn = (qwn) obj;
                if (akcr.a(this.a, qwn.a) && akcr.a(this.b, qwn.b)) {
                    if ((this.c == qwn.c ? 1 : null) != null && akcr.a(this.d, qwn.d) && akcr.a(this.e, qwn.e) && akcr.a(this.f, qwn.f) && akcr.a(this.g, qwn.g) && akcr.a(this.h, qwn.h) && akcr.a(this.i, qwn.i) && akcr.a(this.j, qwn.j) && akcr.a(this.k, qwn.k)) {
                        if ((this.n == qwn.n ? 1 : null) != null) {
                            if ((this.o == qwn.o ? 1 : null) != null) {
                                if ((this.p == qwn.p ? 1 : null) != null) {
                                    if ((this.q == qwn.q ? 1 : null) != null) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Long l = this.b;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        int i2 = this.c;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        Record record = this.d;
        hashCode = (hashCode + (record != null ? record.hashCode() : 0)) * 31;
        String str2 = this.e;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        l = this.f;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        aetf aetf = this.g;
        hashCode = (hashCode + (aetf != null ? aetf.hashCode() : 0)) * 31;
        MessageClientStatus messageClientStatus = this.h;
        hashCode = (hashCode + (messageClientStatus != null ? messageClientStatus.hashCode() : 0)) * 31;
        LocalMessageBodyType localMessageBodyType = this.i;
        hashCode = (hashCode + (localMessageBodyType != null ? localMessageBodyType.hashCode() : 0)) * 31;
        l = this.j;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.k;
        if (l != null) {
            i = l.hashCode();
        }
        hashCode = (hashCode + i) * 31;
        i = this.n;
        if (i != 0) {
            i = 1;
        }
        hashCode = (hashCode + i) * 31;
        i = this.o;
        if (i != 0) {
            i = 1;
        }
        hashCode = (hashCode + i) * 31;
        i = this.p;
        if (i != 0) {
            i = 1;
        }
        hashCode = (hashCode + i) * 31;
        i = this.q;
        if (i != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c2  */
    public final java.lang.String toString() {
        /*
        r4 = this;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = r4.l;
        r2 = ", ";
        if (r1 == 0) goto L_0x006b;
    L_0x000b:
        r1 = r4.a;
        if (r1 == 0) goto L_0x0025;
    L_0x000f:
        r1 = new java.lang.StringBuilder;
        r3 = "snapId=";
        r1.<init>(r3);
        r3 = r4.a;
        r1.append(r3);
        r1.append(r2);
        r1 = r1.toString();
        r0.append(r1);
    L_0x0025:
        r1 = r4.b;
        if (r1 == 0) goto L_0x0044;
    L_0x0029:
        r1 = (java.lang.Number) r1;
        r1.longValue();
        r1 = new java.lang.StringBuilder;
        r3 = "snapMessageTimestamp=";
        r1.<init>(r3);
        r3 = r4.b;
        r1.append(r3);
        r1.append(r2);
        r1 = r1.toString();
        r0.append(r1);
    L_0x0044:
        r1 = r4.d;
        if (r1 == 0) goto L_0x005e;
    L_0x0048:
        r1 = new java.lang.StringBuilder;
        r3 = "latestScreenshottedOrReplayed=";
        r1.<init>(r3);
        r3 = r4.d;
        r1.append(r3);
        r1.append(r2);
        r1 = r1.toString();
        r0.append(r1);
    L_0x005e:
        r1 = new java.lang.StringBuilder;
        r3 = "hasSound=";
        r1.<init>(r3);
        r3 = r4.c;
        r1.append(r3);
        goto L_0x00b4;
    L_0x006b:
        r1 = r4.e;
        if (r1 == 0) goto L_0x0085;
    L_0x006f:
        r1 = new java.lang.StringBuilder;
        r3 = "chatMessageId=";
        r1.<init>(r3);
        r3 = r4.e;
        r1.append(r3);
        r1.append(r2);
        r1 = r1.toString();
        r0.append(r1);
    L_0x0085:
        r1 = r4.f;
        if (r1 == 0) goto L_0x00a4;
    L_0x0089:
        r1 = (java.lang.Number) r1;
        r1.longValue();
        r1 = new java.lang.StringBuilder;
        r3 = "chatMessageTimestamp=";
        r1.<init>(r3);
        r3 = r4.f;
        r1.append(r3);
        r1.append(r2);
        r1 = r1.toString();
        r0.append(r1);
    L_0x00a4:
        r1 = r4.g;
        if (r1 == 0) goto L_0x00be;
    L_0x00a8:
        r1 = new java.lang.StringBuilder;
        r3 = "groupUpdateMessageType=";
        r1.<init>(r3);
        r3 = r4.g;
        r1.append(r3);
    L_0x00b4:
        r1.append(r2);
        r1 = r1.toString();
        r0.append(r1);
    L_0x00be:
        r1 = r4.j;
        if (r1 == 0) goto L_0x00dd;
    L_0x00c2:
        r1 = (java.lang.Number) r1;
        r1.longValue();
        r1 = new java.lang.StringBuilder;
        r3 = "interactionTimestamp=";
        r1.<init>(r3);
        r3 = r4.j;
        r1.append(r3);
        r1.append(r2);
        r1 = r1.toString();
        r0.append(r1);
    L_0x00dd:
        r1 = new java.lang.StringBuilder;
        r3 = "senderId=";
        r1.<init>(r3);
        r3 = r4.k;
        r1.append(r3);
        r1.append(r2);
        r1 = r1.toString();
        r0.append(r1);
        r1 = new java.lang.StringBuilder;
        r3 = "messageClientStatus=";
        r1.<init>(r3);
        r3 = r4.h;
        r1.append(r3);
        r1.append(r2);
        r1 = r1.toString();
        r0.append(r1);
        r1 = new java.lang.StringBuilder;
        r3 = "messageBodyType=";
        r1.<init>(r3);
        r3 = r4.i;
        r1.append(r3);
        r1.append(r2);
        r1 = r1.toString();
        r0.append(r1);
        r1 = new java.lang.StringBuilder;
        r3 = "isBirthdayToday=";
        r1.<init>(r3);
        r3 = r4.o;
        r1.append(r3);
        r1.append(r2);
        r1 = r1.toString();
        r0.append(r1);
        r1 = new java.lang.StringBuilder;
        r3 = "isPendingFriendAdd=";
        r1.<init>(r3);
        r3 = r4.n;
        r1.append(r3);
        r1.append(r2);
        r1 = r1.toString();
        r0.append(r1);
        r1 = new java.lang.StringBuilder;
        r3 = "isReceived=";
        r1.<init>(r3);
        r3 = r4.q;
        r1.append(r3);
        r1.append(r2);
        r1 = r1.toString();
        r0.append(r1);
        r1 = new java.lang.StringBuilder;
        r3 = "isViewed=";
        r1.<init>(r3);
        r3 = r4.p;
        r1.append(r3);
        r1.append(r2);
        r1 = r1.toString();
        r0.append(r1);
        r0 = r0.toString();
        r1 = "builder.toString()";
        defpackage.akcr.a(r0, r1);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qwn.toString():java.lang.String");
    }
}
