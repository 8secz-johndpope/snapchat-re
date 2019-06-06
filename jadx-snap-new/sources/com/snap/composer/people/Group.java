package com.snap.composer.people;

import com.snapchat.client.composer.utils.ComposerJsConvertible;
import defpackage.akco;
import defpackage.akcr;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class Group implements ComposerJsConvertible {
    public static final Companion Companion = new Companion();
    private final String a;
    private final String b;
    private final List<GroupParticipant> c;
    private final double d;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:25:0x0094 in {3, 8, 9, 12, 13, 18, 20, 22, 24} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public final com.snap.composer.people.Group fromJavaScript(java.lang.Object r9) {
            /*
            r8 = this;
            r0 = r9 instanceof com.snap.composer.people.Group;
            if (r0 == 0) goto L_0x0007;
            r9 = (com.snap.composer.people.Group) r9;
            return r9;
            r0 = r9 instanceof java.util.Map;
            if (r0 == 0) goto L_0x008a;
            r0 = com.snap.composer.utils.JSConversions.INSTANCE;
            r9 = (java.util.Map) r9;
            r1 = "groupId";
            r1 = r9.get(r1);
            r3 = r0.asString(r1);
            r0 = "name";
            r0 = r9.get(r0);
            r1 = 0;
            if (r0 == 0) goto L_0x002a;
            r2 = com.snap.composer.utils.JSConversions.INSTANCE;
            r0 = r2.asString(r0);
            r4 = r0;
            goto L_0x002b;
            r4 = r1;
            r0 = "participants";
            r2 = r9.get(r0);
            r5 = r2 instanceof java.lang.Object[];
            if (r5 != 0) goto L_0x0036;
            goto L_0x0037;
            r1 = r2;
            r1 = (java.lang.Object[]) r1;
            if (r1 == 0) goto L_0x006b;
            r0 = new java.util.ArrayList;
            r2 = r1.length;
            r0.<init>(r2);
            r0 = (java.util.Collection) r0;
            r2 = r1.length;
            r5 = 0;
            if (r5 >= r2) goto L_0x0055;
            r6 = r1[r5];
            r7 = com.snap.composer.people.GroupParticipant.Companion;
            r6 = r7.fromJavaScript(r6);
            r0.add(r6);
            r5 = r5 + 1;
            goto L_0x0045;
            r5 = r0;
            r5 = (java.util.List) r5;
            r0 = com.snap.composer.utils.JSConversions.INSTANCE;
            r1 = "lastInteractionTimestamp";
            r9 = r9.get(r1);
            r6 = r0.asDouble(r9);
            r9 = new com.snap.composer.people.Group;
            r2 = r9;
            r2.<init>(r3, r4, r5, r6);
            return r9;
            r1 = new java.lang.StringBuilder;
            r2 = "Cannot cast ";
            r1.<init>(r2);
            r9 = r9.get(r0);
            r1.append(r9);
            r9 = " to Array<*>";
            r1.append(r9);
            r9 = r1.toString();
            r0 = new com.snap.composer.exceptions.AttributeError;
            r0.<init>(r9);
            r0 = (java.lang.Throwable) r0;
            throw r0;
            r9 = new com.snap.composer.exceptions.AttributeError;
            r0 = "Could not cast jsInstance to Map";
            r9.<init>(r0);
            r9 = (java.lang.Throwable) r9;
            throw r9;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.composer.people.Group$Companion.fromJavaScript(java.lang.Object):com.snap.composer.people.Group");
        }

        public final Map<String, Object> toJavaScript(Group group) {
            akcr.b(group, "instance");
            Map linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("groupId", group.getGroupId());
            Object name = group.getName();
            if (name == null) {
                name = null;
            }
            linkedHashMap.put("name", name);
            List participants = group.getParticipants();
            GroupParticipant[] groupParticipantArr = new GroupParticipant[participants.size()];
            int length = groupParticipantArr.length;
            for (int i = 0; i < length; i++) {
                groupParticipantArr[i] = (GroupParticipant) participants.get(i);
            }
            linkedHashMap.put("participants", groupParticipantArr);
            linkedHashMap.put("lastInteractionTimestamp", Double.valueOf(group.getLastInteractionTimestamp()));
            return linkedHashMap;
        }
    }

    public Group(String str, String str2, List<GroupParticipant> list, double d) {
        akcr.b(str, "groupId");
        akcr.b(list, "participants");
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = d;
    }

    public static /* synthetic */ Group copy$default(Group group, String str, String str2, List list, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            str = group.a;
        }
        if ((i & 2) != 0) {
            str2 = group.b;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            list = group.c;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            d = group.d;
        }
        return group.copy(str, str3, list2, d);
    }

    public final String component1() {
        return this.a;
    }

    public final String component2() {
        return this.b;
    }

    public final List<GroupParticipant> component3() {
        return this.c;
    }

    public final double component4() {
        return this.d;
    }

    public final Group copy(String str, String str2, List<GroupParticipant> list, double d) {
        akcr.b(str, "groupId");
        akcr.b(list, "participants");
        return new Group(str, str2, list, d);
    }

    /* JADX WARNING: Missing block: B:10:0x002e, code skipped:
            if (java.lang.Double.compare(r4.d, r5.d) == 0) goto L_0x0033;
     */
    public final boolean equals(java.lang.Object r5) {
        /*
        r4 = this;
        if (r4 == r5) goto L_0x0033;
    L_0x0002:
        r0 = r5 instanceof com.snap.composer.people.Group;
        if (r0 == 0) goto L_0x0031;
    L_0x0006:
        r5 = (com.snap.composer.people.Group) r5;
        r0 = r4.a;
        r1 = r5.a;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x0012:
        r0 = r4.b;
        r1 = r5.b;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x001c:
        r0 = r4.c;
        r1 = r5.c;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x0026:
        r0 = r4.d;
        r2 = r5.d;
        r5 = java.lang.Double.compare(r0, r2);
        if (r5 != 0) goto L_0x0031;
    L_0x0030:
        goto L_0x0033;
    L_0x0031:
        r5 = 0;
        return r5;
    L_0x0033:
        r5 = 1;
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.composer.people.Group.equals(java.lang.Object):boolean");
    }

    public final String getGroupId() {
        return this.a;
    }

    public final double getLastInteractionTimestamp() {
        return this.d;
    }

    public final String getName() {
        return this.b;
    }

    public final List<GroupParticipant> getParticipants() {
        return this.c;
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List list = this.c;
        if (list != null) {
            i = list.hashCode();
        }
        hashCode = (hashCode + i) * 31;
        long doubleToLongBits = Double.doubleToLongBits(this.d);
        return hashCode + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final Object toJavaScript() {
        return Companion.toJavaScript(this);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Group(groupId=");
        stringBuilder.append(this.a);
        stringBuilder.append(", name=");
        stringBuilder.append(this.b);
        stringBuilder.append(", participants=");
        stringBuilder.append(this.c);
        stringBuilder.append(", lastInteractionTimestamp=");
        stringBuilder.append(this.d);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
