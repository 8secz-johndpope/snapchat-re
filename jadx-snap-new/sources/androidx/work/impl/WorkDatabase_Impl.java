package androidx.work.impl;

import defpackage.aa;
import defpackage.ab;
import defpackage.ak;
import defpackage.an;
import defpackage.ap.b;
import defpackage.ar;
import defpackage.ar.a;
import defpackage.aw;
import defpackage.aw.d;
import defpackage.rn;
import defpackage.ro;
import defpackage.rq;
import defpackage.rr;
import defpackage.rt;
import defpackage.ru;
import defpackage.rw;
import defpackage.rx;
import defpackage.rz;
import defpackage.sa;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class WorkDatabase_Impl extends WorkDatabase {
    private volatile rw g;
    private volatile rn h;
    private volatile rz i;
    private volatile rq j;
    private volatile rt k;

    public final an a() {
        return new an(this, "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName");
    }

    public final ab b(ak akVar) {
        ar arVar = new ar(akVar, new a() {
            public final void a() {
                if (WorkDatabase_Impl.this.d != null) {
                    int size = WorkDatabase_Impl.this.d.size();
                    for (int i = 0; i < size; i++) {
                        WorkDatabase_Impl.this.d.get(i);
                    }
                }
            }

            public final void a(aa aaVar) {
                aaVar.execSQL("DROP TABLE IF EXISTS `Dependency`");
                aaVar.execSQL("DROP TABLE IF EXISTS `WorkSpec`");
                aaVar.execSQL("DROP TABLE IF EXISTS `WorkTag`");
                aaVar.execSQL("DROP TABLE IF EXISTS `SystemIdInfo`");
                aaVar.execSQL("DROP TABLE IF EXISTS `WorkName`");
            }

            public final void b(aa aaVar) {
                aaVar.execSQL("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                aaVar.execSQL("CREATE  INDEX `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
                aaVar.execSQL("CREATE  INDEX `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
                aaVar.execSQL("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
                aaVar.execSQL("CREATE  INDEX `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                aaVar.execSQL("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                aaVar.execSQL("CREATE  INDEX `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
                aaVar.execSQL("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                aaVar.execSQL("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                aaVar.execSQL("CREATE  INDEX `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
                aaVar.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                aaVar.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"c84d23ade98552f1cec71088c1f0794c\")");
            }

            public final void c(aa aaVar) {
                WorkDatabase_Impl.this.a = aaVar;
                aaVar.execSQL("PRAGMA foreign_keys = ON");
                WorkDatabase_Impl.this.a(aaVar);
                if (WorkDatabase_Impl.this.d != null) {
                    int size = WorkDatabase_Impl.this.d.size();
                    for (int i = 0; i < size; i++) {
                        ((b) WorkDatabase_Impl.this.d.get(i)).a(aaVar);
                    }
                }
            }

            public final void d(aa aaVar) {
                aa aaVar2 = aaVar;
                HashMap hashMap = new HashMap(2);
                String str = "TEXT";
                String str2 = "work_spec_id";
                hashMap.put(str2, new aw.a(str2, str, true, 1));
                String str3 = "prerequisite_id";
                hashMap.put(str3, new aw.a(str3, str, true, 2));
                HashSet hashSet = new HashSet(2);
                String str4 = "id";
                hashSet.add(new aw.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{str2}), Arrays.asList(new String[]{str4})));
                hashSet.add(new aw.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{str3}), Arrays.asList(new String[]{str4})));
                HashSet hashSet2 = new HashSet(2);
                hashSet2.add(new d("index_Dependency_work_spec_id", false, Arrays.asList(new String[]{str2})));
                hashSet2.add(new d("index_Dependency_prerequisite_id", false, Arrays.asList(new String[]{str3})));
                String str5 = "Dependency";
                aw awVar = new aw(str5, hashMap, hashSet, hashSet2);
                aw a = aw.a(aaVar2, str5);
                String str6 = "\n Found:\n";
                StringBuilder stringBuilder;
                if (awVar.equals(a)) {
                    hashMap = new HashMap(23);
                    hashMap.put(str4, new aw.a(str4, str, true, 1));
                    str3 = "state";
                    str5 = "INTEGER";
                    hashMap.put(str3, new aw.a(str3, str5, true, 0));
                    str3 = "worker_class_name";
                    hashMap.put(str3, new aw.a(str3, str, true, 0));
                    str3 = "input_merger_class_name";
                    hashMap.put(str3, new aw.a(str3, str, false, 0));
                    str3 = "BLOB";
                    hashMap.put("input", new aw.a("input", str3, true, 0));
                    hashMap.put("output", new aw.a("output", str3, true, 0));
                    hashMap.put("initial_delay", new aw.a("initial_delay", str5, true, 0));
                    hashMap.put("interval_duration", new aw.a("interval_duration", str5, true, 0));
                    hashMap.put("flex_duration", new aw.a("flex_duration", str5, true, 0));
                    hashMap.put("run_attempt_count", new aw.a("run_attempt_count", str5, true, 0));
                    hashMap.put("backoff_policy", new aw.a("backoff_policy", str5, true, 0));
                    hashMap.put("backoff_delay_duration", new aw.a("backoff_delay_duration", str5, true, 0));
                    hashMap.put("period_start_time", new aw.a("period_start_time", str5, true, 0));
                    hashMap.put("minimum_retention_duration", new aw.a("minimum_retention_duration", str5, true, 0));
                    String str7 = "schedule_requested_at";
                    hashMap.put(str7, new aw.a(str7, str5, true, 0));
                    hashMap.put("required_network_type", new aw.a("required_network_type", str5, false, 0));
                    hashMap.put("requires_charging", new aw.a("requires_charging", str5, true, 0));
                    hashMap.put("requires_device_idle", new aw.a("requires_device_idle", str5, true, 0));
                    hashMap.put("requires_battery_not_low", new aw.a("requires_battery_not_low", str5, true, 0));
                    hashMap.put("requires_storage_not_low", new aw.a("requires_storage_not_low", str5, true, 0));
                    hashMap.put("trigger_content_update_delay", new aw.a("trigger_content_update_delay", str5, true, 0));
                    hashMap.put("trigger_max_content_delay", new aw.a("trigger_max_content_delay", str5, true, 0));
                    hashMap.put("content_uri_triggers", new aw.a("content_uri_triggers", str3, false, 0));
                    hashSet = new HashSet(0);
                    HashSet hashSet3 = new HashSet(1);
                    hashSet3.add(new d("index_WorkSpec_schedule_requested_at", false, Arrays.asList(new String[]{str7})));
                    aw awVar2 = new aw("WorkSpec", hashMap, hashSet, hashSet3);
                    a = aw.a(aaVar2, "WorkSpec");
                    if (awVar2.equals(a)) {
                        hashMap = new HashMap(2);
                        hashMap.put("tag", new aw.a("tag", str, true, 1));
                        hashMap.put(str2, new aw.a(str2, str, true, 2));
                        hashSet = new HashSet(1);
                        hashSet.add(new aw.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{str2}), Arrays.asList(new String[]{str4})));
                        hashSet3 = new HashSet(1);
                        hashSet3.add(new d("index_WorkTag_work_spec_id", false, Arrays.asList(new String[]{str2})));
                        awVar2 = new aw("WorkTag", hashMap, hashSet, hashSet3);
                        a = aw.a(aaVar2, "WorkTag");
                        if (awVar2.equals(a)) {
                            hashMap = new HashMap(2);
                            hashMap.put(str2, new aw.a(str2, str, true, 1));
                            hashMap.put("system_id", new aw.a("system_id", str5, true, 0));
                            hashSet = new HashSet(1);
                            hashSet.add(new aw.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{str2}), Arrays.asList(new String[]{str4})));
                            aw awVar3 = new aw("SystemIdInfo", hashMap, hashSet, new HashSet(0));
                            a = aw.a(aaVar2, "SystemIdInfo");
                            if (awVar3.equals(a)) {
                                hashMap = new HashMap(2);
                                hashMap.put("name", new aw.a("name", str, true, 1));
                                hashMap.put(str2, new aw.a(str2, str, true, 2));
                                HashSet hashSet4 = new HashSet(1);
                                hashSet4.add(new aw.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{str2}), Arrays.asList(new String[]{str4})));
                                hashSet = new HashSet(1);
                                hashSet.add(new d("index_WorkName_work_spec_id", false, Arrays.asList(new String[]{str2})));
                                aw awVar4 = new aw("WorkName", hashMap, hashSet4, hashSet);
                                aw a2 = aw.a(aaVar2, "WorkName");
                                if (!awVar4.equals(a2)) {
                                    stringBuilder = new StringBuilder("Migration didn't properly handle WorkName(androidx.work.impl.model.WorkName).\n Expected:\n");
                                    stringBuilder.append(awVar4);
                                    stringBuilder.append(str6);
                                    stringBuilder.append(a2);
                                    throw new IllegalStateException(stringBuilder.toString());
                                }
                                return;
                            }
                            stringBuilder = new StringBuilder("Migration didn't properly handle SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n");
                            stringBuilder.append(awVar3);
                            stringBuilder.append(str6);
                            stringBuilder.append(a);
                            throw new IllegalStateException(stringBuilder.toString());
                        }
                        stringBuilder = new StringBuilder("Migration didn't properly handle WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n");
                        stringBuilder.append(awVar2);
                        stringBuilder.append(str6);
                        stringBuilder.append(a);
                        throw new IllegalStateException(stringBuilder.toString());
                    }
                    stringBuilder = new StringBuilder("Migration didn't properly handle WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n");
                    stringBuilder.append(awVar2);
                    stringBuilder.append(str6);
                    stringBuilder.append(a);
                    throw new IllegalStateException(stringBuilder.toString());
                }
                stringBuilder = new StringBuilder("Migration didn't properly handle Dependency(androidx.work.impl.model.Dependency).\n Expected:\n");
                stringBuilder.append(awVar);
                stringBuilder.append(str6);
                stringBuilder.append(a);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }, "c84d23ade98552f1cec71088c1f0794c", "1db8206f0da6aa81bbdd2d99a82d9e14");
        ab.b.a a = ab.b.a(akVar.b);
        a.a = akVar.c;
        a.b = arVar;
        return akVar.a.a(a.a());
    }

    public final rw g() {
        if (this.g != null) {
            return this.g;
        }
        rw rwVar;
        synchronized (this) {
            if (this.g == null) {
                this.g = new rx(this);
            }
            rwVar = this.g;
        }
        return rwVar;
    }

    public final rn h() {
        if (this.h != null) {
            return this.h;
        }
        rn rnVar;
        synchronized (this) {
            if (this.h == null) {
                this.h = new ro(this);
            }
            rnVar = this.h;
        }
        return rnVar;
    }

    public final rz i() {
        if (this.i != null) {
            return this.i;
        }
        rz rzVar;
        synchronized (this) {
            if (this.i == null) {
                this.i = new sa(this);
            }
            rzVar = this.i;
        }
        return rzVar;
    }

    public final rq j() {
        if (this.j != null) {
            return this.j;
        }
        rq rqVar;
        synchronized (this) {
            if (this.j == null) {
                this.j = new rr(this);
            }
            rqVar = this.j;
        }
        return rqVar;
    }

    public final rt k() {
        if (this.k != null) {
            return this.k;
        }
        rt rtVar;
        synchronized (this) {
            if (this.k == null) {
                this.k = new ru(this);
            }
            rtVar = this.k;
        }
        return rtVar;
    }
}
