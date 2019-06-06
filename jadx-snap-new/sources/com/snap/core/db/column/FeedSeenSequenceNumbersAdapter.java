package com.snap.core.db.column;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Table;
import com.snap.core.db.record.SeenSequenceNumbersModel;
import defpackage.ainu;
import defpackage.ajyh;
import defpackage.ajyu;
import defpackage.akcr;
import defpackage.ihc;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public final class FeedSeenSequenceNumbersAdapter implements ainu<FeedSeenSequenceNumbers, byte[]> {
    public final FeedSeenSequenceNumbers decode(byte[] bArr) {
        if (bArr == null) {
            Object of = ImmutableTable.of();
            akcr.a(of, "ImmutableTable.of()");
            return new FeedSeenSequenceNumbers((Table) of);
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        Object create = HashBasedTable.create();
        while (wrap.position() < bArr.length) {
            create.put(Long.valueOf((long) ihc.a(wrap)), Long.valueOf((long) ihc.a(wrap)), Long.valueOf((long) ihc.a(wrap)));
        }
        akcr.a(create, "seqNums");
        return new FeedSeenSequenceNumbers((Table) create);
    }

    public final byte[] encode(FeedSeenSequenceNumbers feedSeenSequenceNumbers) {
        akcr.b(feedSeenSequenceNumbers, SeenSequenceNumbersModel.SEQUENCENUMBERS);
        Object cellSet = feedSeenSequenceNumbers.getSequenceNumbers().cellSet();
        akcr.a(cellSet, "sequenceNumbers.sequenceNumbers.cellSet()");
        Iterator it = ajyu.v((Iterable) cellSet).iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i += 15;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i);
        Object rowMap = feedSeenSequenceNumbers.getSequenceNumbers().rowMap();
        akcr.a(rowMap, "sequenceNumbers.sequenceNumbers.rowMap()");
        for (Entry entry : rowMap.entrySet()) {
            Long l = (Long) entry.getKey();
            Object obj = (Map) entry.getValue();
            akcr.a(obj, "viewers");
            for (Entry entry2 : obj.entrySet()) {
                Long l2 = (Long) entry2.getKey();
                Long l3 = (Long) entry2.getValue();
                ihc.a((int) l.longValue(), allocate);
                ihc.a((int) l2.longValue(), allocate);
                ihc.a((int) l3.longValue(), allocate);
            }
        }
        rowMap = allocate.array();
        akcr.a(rowMap, "buffer.array()");
        return ajyh.a(rowMap, 0, allocate.position());
    }
}
