package defpackage;

import android.content.Context;
import android.os.Build.VERSION;

/* renamed from: qf */
public final class qf {
    public static au a = new 1();
    public static au b = new 2();
    public static au c = new 3();

    /* renamed from: qf$1 */
    static class 1 extends au {
        1() {
            super(1, 2);
        }

        public final void a(aa aaVar) {
            aaVar.execSQL("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aaVar.execSQL("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            aaVar.execSQL("DROP TABLE IF EXISTS alarmInfo");
            aaVar.execSQL("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    /* renamed from: qf$2 */
    static class 2 extends au {
        2() {
            super(3, 4);
        }

        public final void a(aa aaVar) {
            if (VERSION.SDK_INT >= 23) {
                aaVar.execSQL("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
            }
        }
    }

    /* renamed from: qf$3 */
    static class 3 extends au {
        3() {
            super(4, 5);
        }

        public final void a(aa aaVar) {
            aaVar.execSQL("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            aaVar.execSQL("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    }

    /* renamed from: qf$a */
    public static class a extends au {
        private Context c;

        public a(Context context) {
            super(2, 3);
            this.c = context;
        }

        public final void a(aa aaVar) {
            new sg(this.c).a(true);
        }
    }
}
