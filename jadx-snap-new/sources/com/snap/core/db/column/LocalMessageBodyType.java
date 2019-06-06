package com.snap.core.db.column;

import com.snap.core.db.api.model.IntegerEnumColumn;
import defpackage.aesq;
import defpackage.ajxt;
import defpackage.akco;
import defpackage.akcr;
import java.util.Locale;

public enum LocalMessageBodyType implements IntegerEnumColumn {
    ;
    
    public static final String[] CHAT_QUERY_MESSAGE_TYPE_FILTER = null;
    public static final Companion Companion = null;
    public static final LocalMessageBodyType[] SILENT_LOCAL_MESSAGE_BODY_TYPES = null;
    public static final String[] SILENT_LOCAL_MESSAGE_BODY_TYPE_STRINGS = null;
    private final int intValue;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }

        private final LocalMessageBodyType getSojuMessageBodyType(String str) {
            try {
                Object obj = Locale.US;
                akcr.a(obj, "Locale.US");
                if (str != null) {
                    Object toUpperCase = str.toUpperCase(obj);
                    akcr.a(toUpperCase, "(this as java.lang.String).toUpperCase(locale)");
                    return LocalMessageBodyType.valueOf(toUpperCase);
                }
                throw new ajxt("null cannot be cast to non-null type java.lang.String");
            } catch (Exception unused) {
                return LocalMessageBodyType.UNRECOGNIZED_VALUE;
            }
        }

        public final LocalMessageBodyType getEnum(String str) {
            if (str == null) {
                return LocalMessageBodyType.UNRECOGNIZED_VALUE;
            }
            Object obj = Locale.ENGLISH;
            akcr.a(obj, "Locale.ENGLISH");
            obj = str.toLowerCase(obj);
            akcr.a(obj, "(this as java.lang.String).toLowerCase(locale)");
            switch (obj.hashCode()) {
                case -1813565398:
                    if (obj.equals(LocalMessageBodyTypeKt.BUSINESS_PROFILE_SHARE_TYPE)) {
                        return LocalMessageBodyType.BUSINESS_PROFILE;
                    }
                    break;
                case -1395496709:
                    if (obj.equals(LocalMessageBodyTypeKt.RETENTION_RULE_TYPE)) {
                        return LocalMessageBodyType.RETENTION_RULE;
                    }
                    break;
                case -719439438:
                    if (obj.equals(LocalMessageBodyTypeKt.MAP_STORY_SHARE_TYPE)) {
                        return LocalMessageBodyType.MAP_STORY_SHARE;
                    }
                    break;
                case -712920059:
                    if (obj.equals(LocalMessageBodyTypeKt.LOCATION_REQUEST_TYPE)) {
                        return LocalMessageBodyType.REQUEST_LOCATION;
                    }
                    break;
                case -489310007:
                    if (obj.equals(LocalMessageBodyTypeKt.GROUP_INVITE_TYPE)) {
                        return LocalMessageBodyType.GROUP_INVITE;
                    }
                    break;
                case -97320257:
                    if (obj.equals(LocalMessageBodyTypeKt.BUSINESS_PROFILE_SNAP_SHARE_TYPE)) {
                        return LocalMessageBodyType.BUSINESS_PROFILE_SNAP;
                    }
                    break;
                case 15587054:
                    if (obj.equals(LocalMessageBodyTypeKt.GAME_CLOSE_TYPE)) {
                        return LocalMessageBodyType.GAME_CLOSE;
                    }
                    break;
                case 730876285:
                    if (obj.equals(LocalMessageBodyTypeKt.GAME_LAUNCH_TYPE)) {
                        return LocalMessageBodyType.GAME_LAUNCH;
                    }
                    break;
                case 762399831:
                    if (obj.equals(LocalMessageBodyTypeKt.GAME_TERMINATE_TYPE)) {
                        return LocalMessageBodyType.GAME_TERMINATE;
                    }
                    break;
                case 1001873043:
                    if (obj.equals(LocalMessageBodyTypeKt.GAME_STATUS_TYPE)) {
                        return LocalMessageBodyType.GAME_STATUS_MESSAGE;
                    }
                    break;
                case 1806822421:
                    if (obj.equals(LocalMessageBodyTypeKt.LOCATION_SHARE_TYPE)) {
                        return LocalMessageBodyType.SHARE_LOCATION;
                    }
                    break;
            }
            return LocalMessageBodyType.Companion.getSojuMessageBodyType(str);
        }
    }

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
            int[] iArr = new int[LocalMessageBodyType.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[LocalMessageBodyType.RETENTION_RULE.ordinal()] = 1;
            $EnumSwitchMapping$0[LocalMessageBodyType.MAP_STORY_SHARE.ordinal()] = 2;
            $EnumSwitchMapping$0[LocalMessageBodyType.GAME_STATUS_MESSAGE.ordinal()] = 3;
            $EnumSwitchMapping$0[LocalMessageBodyType.SHARE_LOCATION.ordinal()] = 4;
            $EnumSwitchMapping$0[LocalMessageBodyType.REQUEST_LOCATION.ordinal()] = 5;
            $EnumSwitchMapping$0[LocalMessageBodyType.GAME_LAUNCH.ordinal()] = 6;
            $EnumSwitchMapping$0[LocalMessageBodyType.GAME_TERMINATE.ordinal()] = 7;
            $EnumSwitchMapping$0[LocalMessageBodyType.GAME_CLOSE.ordinal()] = 8;
            $EnumSwitchMapping$0[LocalMessageBodyType.BUSINESS_PROFILE.ordinal()] = 9;
            $EnumSwitchMapping$0[LocalMessageBodyType.BUSINESS_PROFILE_SNAP.ordinal()] = 10;
            $EnumSwitchMapping$0[LocalMessageBodyType.GROUP_INVITE.ordinal()] = 11;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:17:0x03c8 in {6, 10, 12, 14, 16} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    static {
        /*
        r0 = 51;
        r0 = new com.snap.core.db.column.LocalMessageBodyType[r0];
        r1 = new com.snap.core.db.column.LocalMessageBodyType;
        r2 = 0;
        r3 = "TEXT";
        r1.<init>(r3, r2, r2);
        TEXT = r1;
        r0[r2] = r1;
        r1 = new com.snap.core.db.column.LocalMessageBodyType;
        r3 = 1;
        r4 = "MEDIA";
        r1.<init>(r4, r3, r3);
        MEDIA = r1;
        r0[r3] = r1;
        r1 = new com.snap.core.db.column.LocalMessageBodyType;
        r4 = 2;
        r5 = "SCREENSHOT";
        r1.<init>(r5, r4, r4);
        SCREENSHOT = r1;
        r0[r4] = r1;
        r1 = new com.snap.core.db.column.LocalMessageBodyType;
        r5 = 3;
        r6 = "HERE_SCREENSHOT";
        r1.<init>(r6, r5, r5);
        HERE_SCREENSHOT = r1;
        r0[r5] = r1;
        r1 = new com.snap.core.db.column.LocalMessageBodyType;
        r6 = 4;
        r7 = "DISCOVER_SHARE_V2";
        r1.<init>(r7, r6, r6);
        DISCOVER_SHARE_V2 = r1;
        r0[r6] = r1;
        r1 = new com.snap.core.db.column.LocalMessageBodyType;
        r7 = 5;
        r8 = "MISSED_AUDIO_CALL";
        r1.<init>(r8, r7, r7);
        MISSED_AUDIO_CALL = r1;
        r0[r7] = r1;
        r1 = new com.snap.core.db.column.LocalMessageBodyType;
        r8 = 6;
        r9 = "MISSED_VIDEO_CALL";
        r1.<init>(r9, r8, r8);
        MISSED_VIDEO_CALL = r1;
        r0[r8] = r1;
        r1 = new com.snap.core.db.column.LocalMessageBodyType;
        r9 = 7;
        r10 = "WELCOME_MESSAGE";
        r1.<init>(r10, r9, r9);
        WELCOME_MESSAGE = r1;
        r0[r9] = r1;
        r1 = new com.snap.core.db.column.LocalMessageBodyType;
        r9 = 8;
        r10 = "STORY_REPLY";
        r1.<init>(r10, r9, r9);
        STORY_REPLY = r1;
        r0[r9] = r1;
        r1 = new com.snap.core.db.column.LocalMessageBodyType;
        r9 = 9;
        r10 = "STORY_REPLY_V2";
        r1.<init>(r10, r9, r9);
        STORY_REPLY_V2 = r1;
        r0[r9] = r1;
        r1 = new com.snap.core.db.column.LocalMessageBodyType;
        r9 = 10;
        r10 = "STICKER";
        r1.<init>(r10, r9, r9);
        STICKER = r1;
        r0[r9] = r1;
        r1 = new com.snap.core.db.column.LocalMessageBodyType;
        r9 = 11;
        r10 = "STICKER_V2";
        r1.<init>(r10, r9, r9);
        STICKER_V2 = r1;
        r0[r9] = r1;
        r1 = new com.snap.core.db.column.LocalMessageBodyType;
        r9 = 12;
        r10 = "STICKER_V3";
        r1.<init>(r10, r9, r9);
        STICKER_V3 = r1;
        r0[r9] = r1;
        r1 = new com.snap.core.db.column.LocalMessageBodyType;
        r9 = 13;
        r10 = "MEDIA_V2";
        r1.<init>(r10, r9, r9);
        MEDIA_V2 = r1;
        r0[r9] = r1;
        r1 = new com.snap.core.db.column.LocalMessageBodyType;
        r9 = 14;
        r10 = "AUDIO_NOTE";
        r1.<init>(r10, r9, r9);
        AUDIO_NOTE = r1;
        r0[r9] = r1;
        r1 = new com.snap.core.db.column.LocalMessageBodyType;
        r9 = "VIDEO_NOTE";
        r10 = 15;
        r11 = 15;
        r1.<init>(r9, r10, r11);
        VIDEO_NOTE = r1;
        r9 = 15;
        r0[r9] = r1;
        r1 = new com.snap.core.db.column.LocalMessageBodyType;
        r9 = "BATCHED_MEDIA";
        r10 = 16;
        r11 = 16;
        r1.<init>(r9, r10, r11);
        BATCHED_MEDIA = r1;
        r9 = 16;
        r0[r9] = r1;
        r1 = new com.snap.core.db.column.LocalMessageBodyType;
        r9 = "MEDIA_V3";
        r10 = 17;
        r11 = 17;
        r1.<init>(r9, r10, r11);
        MEDIA_V3 = r1;
        r9 = 17;
        r0[r9] = r1;
        r1 = new com.snap.core.db.column.LocalMessageBodyType;
        r9 = "MEDIA_V4";
        r10 = 18;
        r11 = 18;
        r1.<init>(r9, r10, r11);
        MEDIA_V4 = r1;
        r9 = 18;
        r0[r9] = r1;
        r1 = new com.snap.core.db.column.LocalMessageBodyType;
        r9 = "SPEEDWAY_STORY";
        r10 = 19;
        r11 = 19;
        r1.<init>(r9, r10, r11);
        SPEEDWAY_STORY = r1;
        r9 = 19;
        r0[r9] = r1;
        r1 = new com.snap.core.db.column.LocalMessageBodyType;
        r9 = "SPEEDWAY_STORY_V2";
        r10 = 20;
        r11 = 20;
        r1.<init>(r9, r10, r11);
        SPEEDWAY_STORY_V2 = r1;
        r9 = 20;
        r0[r9] = r1;
        r1 = new com.snap.core.db.column.LocalMessageBodyType;
        r9 = "SPEEDWAY_SNAP";
        r10 = 21;
        r11 = 21;
        r1.<init>(r9, r10, r11);
        SPEEDWAY_SNAP = r1;
        r9 = 21;
        r0[r9] = r1;
        r1 = new com.snap.core.db.column.LocalMessageBodyType;
        r9 = "SPEEDWAY_SNAP_V2";
        r10 = 22;
        r11 = 22;
        r1.<init>(r9, r10, r11);
        SPEEDWAY_SNAP_V2 = r1;
        r9 = 22;
        r0[r9] = r1;
        r1 = new com.snap.core.db.column.LocalMessageBodyType;
        r9 = "STORY_SHARE";
        r10 = 23;
        r11 = 23;
        r1.<init>(r9, r10, r11);
        STORY_SHARE = r1;
        r9 = 23;
        r0[r9] = r1;
        r1 = new com.snap.core.db.column.LocalMessageBodyType;
        r9 = "SNAPCHATTER";
        r10 = 24;
        r11 = 24;
        r1.<init>(r9, r10, r11);
        SNAPCHATTER = r1;
        r9 = 24;
        r0[r9] = r1;
        r1 = new com.snap.core.db.column.LocalMessageBodyType;
        r9 = "UPDATE_MESSAGE";
        r10 = 25;
        r11 = 25;
        r1.<init>(r9, r10, r11);
        UPDATE_MESSAGE = r1;
        r9 = 25;
        r0[r9] = r1;
        r1 = new com.snap.core.db.column.LocalMessageBodyType;
        r9 = "SNAP";
        r10 = 26;
        r11 = 26;
        r1.<init>(r9, r10, r11);
        SNAP = r1;
        r9 = 26;
        r0[r9] = r1;
        r1 = new com.snap.core.db.column.LocalMessageBodyType;
        r9 = "KHALEESI_SHARE";
        r10 = 27;
        r11 = 27;
        r1.<init>(r9, r10, r11);
        KHALEESI_SHARE = r1;
        r9 = 27;
        r0[r9] = r1;
        r1 = new com.snap.core.db.column.LocalMessageBodyType;
        r9 = "NYC_SHARE";
        r10 = 28;
        r11 = 28;
        r1.<init>(r9, r10, r11);
        NYC_SHARE = r1;
        r9 = 28;
        r0[r9] = r1;
        r1 = new com.snap.core.db.column.LocalMessageBodyType;
        r9 = "SEARCH_SHARE_STORY_SNAP";
        r10 = 29;
        r11 = 29;
        r1.<init>(r9, r10, r11);
        SEARCH_SHARE_STORY_SNAP = r1;
        r9 = 29;
        r0[r9] = r1;
        r1 = new com.snap.core.db.column.LocalMessageBodyType;
        r9 = "SEARCH_SHARE_STORY";
        r10 = 30;
        r11 = 30;
        r1.<init>(r9, r10, r11);
        SEARCH_SHARE_STORY = r1;
        r9 = 30;
        r0[r9] = r1;
        r1 = new com.snap.core.db.column.LocalMessageBodyType;
        r9 = "AD_SHARE";
        r10 = 31;
        r11 = 31;
        r1.<init>(r9, r10, r11);
        AD_SHARE = r1;
        r9 = 31;
        r0[r9] = r1;
        r1 = new com.snap.core.db.column.LocalMessageBodyType;
        r9 = "MEDIA_SAVE";
        r10 = 32;
        r11 = 32;
        r1.<init>(r9, r10, r11);
        MEDIA_SAVE = r1;
        r9 = 32;
        r0[r9] = r1;
        r1 = new com.snap.core.db.column.LocalMessageBodyType;
        r9 = "MESSAGE_PALLET";
        r10 = 33;
        r11 = 33;
        r1.<init>(r9, r10, r11);
        MESSAGE_PALLET = r1;
        r9 = 33;
        r0[r9] = r1;
        r1 = new com.snap.core.db.column.LocalMessageBodyType;
        r9 = "SNAPCASH";
        r10 = 34;
        r11 = 34;
        r1.<init>(r9, r10, r11);
        SNAPCASH = r1;
        r9 = 34;
        r0[r9] = r1;
        r1 = new com.snap.core.db.column.LocalMessageBodyType;
        r9 = "MESSAGE_PARCEL";
        r10 = 35;
        r11 = 35;
        r1.<init>(r9, r10, r11);
        MESSAGE_PARCEL = r1;
        r9 = 35;
        r0[r9] = r1;
        r1 = new com.snap.core.db.column.LocalMessageBodyType;
        r9 = "ERASED_MESSAGE";
        r10 = 36;
        r11 = 36;
        r1.<init>(r9, r10, r11);
        ERASED_MESSAGE = r1;
        r9 = 36;
        r0[r9] = r1;
        r1 = new com.snap.core.db.column.LocalMessageBodyType;
        r9 = "JOINED_CALL";
        r10 = 37;
        r11 = 37;
        r1.<init>(r9, r10, r11);
        JOINED_CALL = r1;
        r9 = 37;
        r0[r9] = r1;
        r1 = new com.snap.core.db.column.LocalMessageBodyType;
        r9 = "LEFT_CALL";
        r10 = 38;
        r11 = 38;
        r1.<init>(r9, r10, r11);
        LEFT_CALL = r1;
        r9 = 38;
        r0[r9] = r1;
        r1 = new com.snap.core.db.column.LocalMessageBodyType;
        r9 = "UNRECOGNIZED_VALUE";
        r10 = 39;
        r11 = 39;
        r1.<init>(r9, r10, r11);
        UNRECOGNIZED_VALUE = r1;
        r9 = 39;
        r0[r9] = r1;
        r1 = new com.snap.core.db.column.LocalMessageBodyType;
        r9 = "RETENTION_RULE";
        r10 = 40;
        r11 = 40;
        r1.<init>(r9, r10, r11);
        RETENTION_RULE = r1;
        r9 = 40;
        r0[r9] = r1;
        r1 = new com.snap.core.db.column.LocalMessageBodyType;
        r9 = "MAP_STORY_SHARE";
        r10 = 41;
        r11 = 41;
        r1.<init>(r9, r10, r11);
        MAP_STORY_SHARE = r1;
        r9 = 41;
        r0[r9] = r1;
        r1 = new com.snap.core.db.column.LocalMessageBodyType;
        r9 = "GAME_STATUS_MESSAGE";
        r10 = 42;
        r11 = 42;
        r1.<init>(r9, r10, r11);
        GAME_STATUS_MESSAGE = r1;
        r9 = 42;
        r0[r9] = r1;
        r1 = new com.snap.core.db.column.LocalMessageBodyType;
        r9 = "SHARE_LOCATION";
        r10 = 43;
        r11 = 43;
        r1.<init>(r9, r10, r11);
        SHARE_LOCATION = r1;
        r9 = 43;
        r0[r9] = r1;
        r1 = new com.snap.core.db.column.LocalMessageBodyType;
        r9 = "REQUEST_LOCATION";
        r10 = 44;
        r11 = 44;
        r1.<init>(r9, r10, r11);
        REQUEST_LOCATION = r1;
        r9 = 44;
        r0[r9] = r1;
        r1 = new com.snap.core.db.column.LocalMessageBodyType;
        r9 = "GAME_LAUNCH";
        r10 = 45;
        r11 = 45;
        r1.<init>(r9, r10, r11);
        GAME_LAUNCH = r1;
        r9 = 45;
        r0[r9] = r1;
        r1 = new com.snap.core.db.column.LocalMessageBodyType;
        r9 = "GAME_TERMINATE";
        r10 = 46;
        r11 = 46;
        r1.<init>(r9, r10, r11);
        GAME_TERMINATE = r1;
        r9 = 46;
        r0[r9] = r1;
        r1 = new com.snap.core.db.column.LocalMessageBodyType;
        r9 = "GAME_CLOSE";
        r10 = 47;
        r11 = 47;
        r1.<init>(r9, r10, r11);
        GAME_CLOSE = r1;
        r9 = 47;
        r0[r9] = r1;
        r1 = new com.snap.core.db.column.LocalMessageBodyType;
        r9 = "BUSINESS_PROFILE";
        r10 = 48;
        r11 = 48;
        r1.<init>(r9, r10, r11);
        BUSINESS_PROFILE = r1;
        r9 = 48;
        r0[r9] = r1;
        r1 = new com.snap.core.db.column.LocalMessageBodyType;
        r9 = "GROUP_INVITE";
        r10 = 49;
        r11 = 49;
        r1.<init>(r9, r10, r11);
        GROUP_INVITE = r1;
        r9 = 49;
        r0[r9] = r1;
        r1 = new com.snap.core.db.column.LocalMessageBodyType;
        r9 = "BUSINESS_PROFILE_SNAP";
        r10 = 50;
        r11 = 50;
        r1.<init>(r9, r10, r11);
        BUSINESS_PROFILE_SNAP = r1;
        r9 = 50;
        r0[r9] = r1;
        $VALUES = r0;
        r0 = new com.snap.core.db.column.LocalMessageBodyType$Companion;
        r1 = 0;
        r0.<init>(r1);
        Companion = r0;
        r0 = new com.snap.core.db.column.LocalMessageBodyType[r6];
        r1 = ERASED_MESSAGE;
        r0[r2] = r1;
        r1 = RETENTION_RULE;
        r0[r3] = r1;
        r1 = GAME_CLOSE;
        r0[r4] = r1;
        r1 = GAME_TERMINATE;
        r0[r5] = r1;
        r0 = defpackage.ajym.b(r0);
        r0 = (java.util.Collection) r0;
        if (r0 == 0) goto L_0x03c0;
        r1 = new com.snap.core.db.column.LocalMessageBodyType[r2];
        r0 = r0.toArray(r1);
        if (r0 == 0) goto L_0x03b8;
        r0 = (com.snap.core.db.column.LocalMessageBodyType[]) r0;
        SILENT_LOCAL_MESSAGE_BODY_TYPES = r0;
        r1 = new java.util.ArrayList;
        r9 = r0.length;
        r1.<init>(r9);
        r1 = (java.util.Collection) r1;
        r9 = r0.length;
        r10 = 0;
        if (r10 >= r9) goto L_0x036b;
        r11 = r0[r10];
        r11 = r11.getNetworkStringValue();
        r1.add(r11);
        r10 = r10 + 1;
        goto L_0x035d;
        r1 = (java.util.List) r1;
        r1 = (java.util.Collection) r1;
        r0 = new java.lang.String[r2];
        r0 = r1.toArray(r0);
        if (r0 == 0) goto L_0x03b0;
        r0 = (java.lang.String[]) r0;
        SILENT_LOCAL_MESSAGE_BODY_TYPE_STRINGS = r0;
        r0 = new java.lang.String[r8];
        r1 = ERASED_MESSAGE;
        r1 = r1.getNetworkStringValue();
        r0[r2] = r1;
        r1 = RETENTION_RULE;
        r1 = r1.getNetworkStringValue();
        r0[r3] = r1;
        r1 = SNAP;
        r1 = r1.getNetworkStringValue();
        r0[r4] = r1;
        r1 = UPDATE_MESSAGE;
        r1 = r1.getNetworkStringValue();
        r0[r5] = r1;
        r1 = GAME_CLOSE;
        r1 = r1.getNetworkStringValue();
        r0[r6] = r1;
        r1 = GAME_TERMINATE;
        r1 = r1.getNetworkStringValue();
        r0[r7] = r1;
        CHAT_QUERY_MESSAGE_TYPE_FILTER = r0;
        return;
        r0 = new ajxt;
        r1 = "null cannot be cast to non-null type kotlin.Array<T>";
        r0.<init>(r1);
        throw r0;
        r0 = new ajxt;
        r1 = "null cannot be cast to non-null type kotlin.Array<T>";
        r0.<init>(r1);
        throw r0;
        r0 = new ajxt;
        r1 = "null cannot be cast to non-null type java.util.Collection<T>";
        r0.<init>(r1);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.core.db.column.LocalMessageBodyType.<clinit>():void");
    }

    protected LocalMessageBodyType(int i) {
        this.intValue = i;
    }

    public final int getIntValue() {
        return this.intValue;
    }

    public final String getNetworkStringValue() {
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
                return LocalMessageBodyTypeKt.RETENTION_RULE_TYPE;
            case 2:
                return LocalMessageBodyTypeKt.MAP_STORY_SHARE_TYPE;
            case 3:
                return LocalMessageBodyTypeKt.GAME_STATUS_TYPE;
            case 4:
                return LocalMessageBodyTypeKt.LOCATION_SHARE_TYPE;
            case 5:
                return LocalMessageBodyTypeKt.LOCATION_REQUEST_TYPE;
            case 6:
                return LocalMessageBodyTypeKt.GAME_LAUNCH_TYPE;
            case 7:
                return LocalMessageBodyTypeKt.GAME_TERMINATE_TYPE;
            case 8:
                return LocalMessageBodyTypeKt.GAME_CLOSE_TYPE;
            case 9:
                return LocalMessageBodyTypeKt.BUSINESS_PROFILE_SHARE_TYPE;
            case 10:
                return LocalMessageBodyTypeKt.BUSINESS_PROFILE_SNAP_SHARE_TYPE;
            case 11:
                return LocalMessageBodyTypeKt.GROUP_INVITE_TYPE;
            default:
                Object a = aesq.a(name()).a();
                akcr.a(a, "MessageBodyType.fromValue(name).value()");
                return a;
        }
    }
}
