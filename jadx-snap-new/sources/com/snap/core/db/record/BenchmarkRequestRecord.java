package com.snap.core.db.record;

import com.google.auto.value.AutoValue;
import com.snap.core.db.column.MessageNanoColumnAdapter;
import com.snap.core.db.column.MessageNanoColumnAdapter.ProtoFactory;
import com.snap.core.db.record.BenchmarkRequestRecordModel.Factory;
import com.snap.core.db.record.BenchmarkRequestRecordModel.Mapper;
import defpackage.acbu;
import defpackage.ainu;

@AutoValue
public abstract class BenchmarkRequestRecord implements BenchmarkRequestRecordModel {
    public static final Factory<BenchmarkRequestRecord> FACTORY;
    public static final Mapper<BenchmarkRequestRecord> PENDING_BENCHMARK_MAPPER;
    public static final Mapper<BenchmarkRequestRecord> PENDING_RESULT_MAPPER = FACTORY.getUnreportedResultsMapper();
    private static final String TAG = "BenchmarkRequestRecord";
    private static final ainu<acbu, byte[]> benchmarkResultColumnAdapter = new MessageNanoColumnAdapter(benchmarkResultRecordFactory, "BenchmarkRequestRecord");
    private static final ProtoFactory<acbu> benchmarkResultRecordFactory = -$$Lambda$6Wdj59I9bl6rM_MdZwnygHkVtCc.INSTANCE;

    static {
        Factory factory = new Factory(-$$Lambda$r2ijqdu8W93PgK1qDbk3TvZiX94.INSTANCE, benchmarkResultColumnAdapter);
        FACTORY = factory;
        PENDING_BENCHMARK_MAPPER = factory.getPendingBenchmarksMapper();
    }
}
