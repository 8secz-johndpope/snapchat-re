package com.snap.spectacles.base.persistence;

import com.brightcove.player.event.Event;
import com.snap.core.db.record.FriendmojiModel;
import com.snap.core.db.record.UploadedMediaModel;
import defpackage.aa;
import defpackage.ab;
import defpackage.ak;
import defpackage.an;
import defpackage.ap.b;
import defpackage.ar;
import defpackage.ar.a;
import defpackage.aw;
import defpackage.aw.d;
import defpackage.xes;
import defpackage.xet;
import defpackage.xev;
import defpackage.xew;
import defpackage.xey;
import defpackage.xez;
import defpackage.xfc;
import defpackage.xfd;
import defpackage.xff;
import defpackage.xfg;
import defpackage.xfj;
import defpackage.xfk;
import defpackage.xfl;
import defpackage.xfm;
import defpackage.xfo;
import defpackage.xfp;
import defpackage.xfs;
import defpackage.xft;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class SpectaclesDatabase_Impl extends SpectaclesDatabase {
    private volatile xfj f;
    private volatile xff g;
    private volatile xey h;
    private volatile xes i;
    private volatile xev j;
    private volatile xfo k;
    private volatile xfs l;
    private volatile xfc m;
    private volatile xfl n;

    public final an a() {
        return new an(this, "spectacles_media_file", "spectacles_media_content", "spectacles_content_store", "snap_bluetooth_device", "spectacles_config_pairs", "spectacles_transfer_channel_info", "spectacles_update_event", "spectacles_media_geo_location", "spectacles_firmware_update_metadata");
    }

    public final ab b(ak akVar) {
        ar arVar = new ar(akVar, new a() {
            public final void a() {
                if (SpectaclesDatabase_Impl.this.d != null) {
                    int size = SpectaclesDatabase_Impl.this.d.size();
                    for (int i = 0; i < size; i++) {
                        SpectaclesDatabase_Impl.this.d.get(i);
                    }
                }
            }

            public final void a(aa aaVar) {
                aaVar.execSQL("DROP TABLE IF EXISTS `spectacles_media_file`");
                aaVar.execSQL("DROP TABLE IF EXISTS `spectacles_media_content`");
                aaVar.execSQL("DROP TABLE IF EXISTS `spectacles_content_store`");
                aaVar.execSQL("DROP TABLE IF EXISTS `snap_bluetooth_device`");
                aaVar.execSQL("DROP TABLE IF EXISTS `spectacles_config_pairs`");
                aaVar.execSQL("DROP TABLE IF EXISTS `spectacles_transfer_channel_info`");
                aaVar.execSQL("DROP TABLE IF EXISTS `spectacles_update_event`");
                aaVar.execSQL("DROP TABLE IF EXISTS `spectacles_media_geo_location`");
                aaVar.execSQL("DROP TABLE IF EXISTS `spectacles_firmware_update_metadata`");
            }

            public final void b(aa aaVar) {
                aaVar.execSQL("CREATE TABLE IF NOT EXISTS `spectacles_media_file` (`mId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `file_type` INTEGER NOT NULL, `content_id` TEXT NOT NULL, `size` INTEGER NOT NULL, FOREIGN KEY(`content_id`) REFERENCES `spectacles_media_content`(`content_id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                aaVar.execSQL("CREATE  INDEX `index_spectacles_media_file_content_id` ON `spectacles_media_file` (`content_id`)");
                aaVar.execSQL("CREATE TABLE IF NOT EXISTS `spectacles_media_content` (`content_id` TEXT NOT NULL, `device_serial_number` TEXT NOT NULL, `all_downloaded` INTEGER NOT NULL, `all_sd_downloaded` INTEGER NOT NULL, `video_metadata` BLOB, `content_type` INTEGER NOT NULL, `record_time` INTEGER NOT NULL, `redownload_count` INTEGER NOT NULL, `spectacles_content_location_info` INTEGER NOT NULL, PRIMARY KEY(`content_id`), FOREIGN KEY(`device_serial_number`) REFERENCES `snap_bluetooth_device`(`device_serial_number`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                aaVar.execSQL("CREATE  INDEX `index_spectacles_media_content_device_serial_number` ON `spectacles_media_content` (`device_serial_number`)");
                aaVar.execSQL("CREATE TABLE IF NOT EXISTS `spectacles_content_store` (`device_serial_number` TEXT NOT NULL, `idle_sd_download_count` INTEGER NOT NULL, `idle_transfer_download_count` INTEGER NOT NULL, `last_successful_content_list_timestamp` INTEGER NOT NULL, PRIMARY KEY(`device_serial_number`), FOREIGN KEY(`device_serial_number`) REFERENCES `snap_bluetooth_device`(`device_serial_number`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                aaVar.execSQL("CREATE  INDEX `index_spectacles_content_store_device_serial_number` ON `spectacles_content_store` (`device_serial_number`)");
                aaVar.execSQL("CREATE TABLE IF NOT EXISTS `snap_bluetooth_device` (`device_serial_number` TEXT NOT NULL, `ble_device_address` TEXT, `device_color` INTEGER NOT NULL, `firmware_version` TEXT, `last_connected_timestamp` INTEGER NOT NULL, `device_number` INTEGER NOT NULL, `recovery_digest` TEXT, `ble_device_name` TEXT, `user_associated` INTEGER NOT NULL, `shared_secret` BLOB, `last_media_count_update_timestamp` INTEGER NOT NULL, `hardware_version` TEXT, `service_uuid` TEXT NOT NULL, `synced_from_server` INTEGER NOT NULL, `auto_import_to_camera_roll` INTEGER NOT NULL, `pairing_success_timestamp` INTEGER NOT NULL, `pairing_code` BLOB NOT NULL, `calibration_data` BLOB, `preferred_export_type` INTEGER NOT NULL, `location_data_enabled` INTEGER NOT NULL, `context_notifications_enabled` INTEGER NOT NULL, `snap_context_notification_color_selection` INTEGER NOT NULL, `emoji` TEXT, `customized_name` TEXT, `customized_timestamp` INTEGER, `current_total_count` INTEGER NOT NULL, `current_video_count` INTEGER NOT NULL, `current_photo_count` INTEGER NOT NULL, `since_last_media_list_total_count` INTEGER NOT NULL, `since_last_media_list_video_count` INTEGER NOT NULL, `since_last_media_list_photo_count` INTEGER NOT NULL, PRIMARY KEY(`device_serial_number`))");
                aaVar.execSQL("CREATE  INDEX `index_snap_bluetooth_device_ble_device_address` ON `snap_bluetooth_device` (`ble_device_address`)");
                aaVar.execSQL("CREATE TABLE IF NOT EXISTS `spectacles_config_pairs` (`spectacles_config_key` TEXT NOT NULL, `spectacles_config_value` TEXT NOT NULL, PRIMARY KEY(`spectacles_config_key`))");
                aaVar.execSQL("CREATE TABLE IF NOT EXISTS `spectacles_transfer_channel_info` (`device_serial_number` TEXT NOT NULL, `content_transfer_mode` INTEGER NOT NULL, `wifi_direct_retry_count` INTEGER NOT NULL, `wifi_ap_fallback_session_count` INTEGER NOT NULL, PRIMARY KEY(`device_serial_number`), FOREIGN KEY(`device_serial_number`) REFERENCES `snap_bluetooth_device`(`device_serial_number`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                aaVar.execSQL("CREATE  INDEX `index_spectacles_transfer_channel_info_device_serial_number` ON `spectacles_transfer_channel_info` (`device_serial_number`)");
                aaVar.execSQL("CREATE TABLE IF NOT EXISTS `spectacles_update_event` (`update_version` TEXT NOT NULL, `update_type` INTEGER NOT NULL, `update_timestamp` INTEGER NOT NULL, `seen_timestamp` INTEGER NOT NULL, `tapped_timestamp` INTEGER NOT NULL, `is_active` INTEGER NOT NULL, PRIMARY KEY(`update_version`))");
                aaVar.execSQL("CREATE TABLE IF NOT EXISTS `spectacles_media_geo_location` (`mId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `timestamp` INTEGER NOT NULL, `longitude` REAL NOT NULL, `latitude` REAL NOT NULL, `filter_type` INTEGER NOT NULL, `filter_metadata` TEXT NOT NULL)");
                aaVar.execSQL("CREATE TABLE IF NOT EXISTS `spectacles_firmware_update_metadata` (`firmware_update_file_id` TEXT NOT NULL, `downloaded_to_client_timestamp` INTEGER NOT NULL, `transferred_to_firmware_timestamp` INTEGER NOT NULL, PRIMARY KEY(`firmware_update_file_id`))");
                aaVar.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                aaVar.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"d0666cd74af1dc9009682ec3846c50a1\")");
            }

            public final void c(aa aaVar) {
                SpectaclesDatabase_Impl.this.a = aaVar;
                aaVar.execSQL("PRAGMA foreign_keys = ON");
                SpectaclesDatabase_Impl.this.a(aaVar);
                if (SpectaclesDatabase_Impl.this.d != null) {
                    int size = SpectaclesDatabase_Impl.this.d.size();
                    for (int i = 0; i < size; i++) {
                        ((b) SpectaclesDatabase_Impl.this.d.get(i)).a(aaVar);
                    }
                }
            }

            public final void d(aa aaVar) {
                aa aaVar2 = aaVar;
                HashMap hashMap = new HashMap(4);
                String str = "mId";
                String str2 = "INTEGER";
                hashMap.put(str, new aw.a(str, str2, true, 1));
                String str3 = "file_type";
                hashMap.put(str3, new aw.a(str3, str2, true, 0));
                str3 = UploadedMediaModel.CONTENT_ID;
                String str4 = "TEXT";
                hashMap.put(str3, new aw.a(str3, str4, true, 0));
                String str5 = Event.SIZE;
                hashMap.put(str5, new aw.a(str5, str2, true, 0));
                HashSet hashSet = new HashSet(1);
                aw.b bVar = r10;
                aw.b bVar2 = new aw.b("spectacles_media_content", "CASCADE", "NO ACTION", Arrays.asList(new String[]{str3}), Arrays.asList(new String[]{str3}));
                hashSet.add(bVar);
                HashSet hashSet2 = new HashSet(1);
                hashSet2.add(new d("index_spectacles_media_file_content_id", false, Arrays.asList(new String[]{str3})));
                String str6 = "spectacles_media_file";
                aw awVar = new aw(str6, hashMap, hashSet, hashSet2);
                aw a = aw.a(aaVar2, str6);
                String str7 = "\n Found:\n";
                StringBuilder stringBuilder;
                if (awVar.equals(a)) {
                    hashMap = new HashMap(9);
                    hashMap.put(str3, new aw.a(str3, str4, true, 1));
                    str3 = "device_serial_number";
                    hashMap.put(str3, new aw.a(str3, str4, true, 0));
                    str5 = "all_downloaded";
                    hashMap.put(str5, new aw.a(str5, str2, true, 0));
                    hashMap.put("all_sd_downloaded", new aw.a("all_sd_downloaded", str2, true, 0));
                    str5 = "BLOB";
                    hashMap.put("video_metadata", new aw.a("video_metadata", str5, false, 0));
                    hashMap.put("content_type", new aw.a("content_type", str2, true, 0));
                    hashMap.put("record_time", new aw.a("record_time", str2, true, 0));
                    hashMap.put("redownload_count", new aw.a("redownload_count", str2, true, 0));
                    hashMap.put("spectacles_content_location_info", new aw.a("spectacles_content_location_info", str2, true, 0));
                    hashSet2 = new HashSet(1);
                    aw.b bVar3 = r11;
                    aw.b bVar4 = new aw.b("snap_bluetooth_device", "CASCADE", "NO ACTION", Arrays.asList(new String[]{str3}), Arrays.asList(new String[]{str3}));
                    hashSet2.add(bVar3);
                    HashSet hashSet3 = new HashSet(1);
                    hashSet3.add(new d("index_spectacles_media_content_device_serial_number", false, Arrays.asList(new String[]{str3})));
                    aw awVar2 = new aw("spectacles_media_content", hashMap, hashSet2, hashSet3);
                    a = aw.a(aaVar2, "spectacles_media_content");
                    if (awVar2.equals(a)) {
                        hashMap = new HashMap(4);
                        hashMap.put(str3, new aw.a(str3, str4, true, 1));
                        hashMap.put("idle_sd_download_count", new aw.a("idle_sd_download_count", str2, true, 0));
                        hashMap.put("idle_transfer_download_count", new aw.a("idle_transfer_download_count", str2, true, 0));
                        hashMap.put("last_successful_content_list_timestamp", new aw.a("last_successful_content_list_timestamp", str2, true, 0));
                        hashSet2 = new HashSet(1);
                        hashSet2.add(new aw.b("snap_bluetooth_device", "CASCADE", "NO ACTION", Arrays.asList(new String[]{str3}), Arrays.asList(new String[]{str3})));
                        hashSet3 = new HashSet(1);
                        hashSet3.add(new d("index_spectacles_content_store_device_serial_number", false, Arrays.asList(new String[]{str3})));
                        awVar2 = new aw("spectacles_content_store", hashMap, hashSet2, hashSet3);
                        a = aw.a(aaVar2, "spectacles_content_store");
                        if (awVar2.equals(a)) {
                            hashMap = new HashMap(31);
                            hashMap.put(str3, new aw.a(str3, str4, true, 1));
                            String str8 = "ble_device_address";
                            hashMap.put(str8, new aw.a(str8, str4, false, 0));
                            hashMap.put("device_color", new aw.a("device_color", str2, true, 0));
                            hashMap.put("firmware_version", new aw.a("firmware_version", str4, false, 0));
                            hashMap.put("last_connected_timestamp", new aw.a("last_connected_timestamp", str2, true, 0));
                            hashMap.put("device_number", new aw.a("device_number", str2, true, 0));
                            hashMap.put("recovery_digest", new aw.a("recovery_digest", str4, false, 0));
                            hashMap.put("ble_device_name", new aw.a("ble_device_name", str4, false, 0));
                            hashMap.put("user_associated", new aw.a("user_associated", str2, true, 0));
                            hashMap.put("shared_secret", new aw.a("shared_secret", str5, false, 0));
                            hashMap.put("last_media_count_update_timestamp", new aw.a("last_media_count_update_timestamp", str2, true, 0));
                            hashMap.put("hardware_version", new aw.a("hardware_version", str4, false, 0));
                            hashMap.put("service_uuid", new aw.a("service_uuid", str4, true, 0));
                            hashMap.put("synced_from_server", new aw.a("synced_from_server", str2, true, 0));
                            hashMap.put("auto_import_to_camera_roll", new aw.a("auto_import_to_camera_roll", str2, true, 0));
                            hashMap.put("pairing_success_timestamp", new aw.a("pairing_success_timestamp", str2, true, 0));
                            hashMap.put("pairing_code", new aw.a("pairing_code", str5, true, 0));
                            hashMap.put("calibration_data", new aw.a("calibration_data", str5, false, 0));
                            hashMap.put("preferred_export_type", new aw.a("preferred_export_type", str2, true, 0));
                            hashMap.put("location_data_enabled", new aw.a("location_data_enabled", str2, true, 0));
                            hashMap.put("context_notifications_enabled", new aw.a("context_notifications_enabled", str2, true, 0));
                            hashMap.put("snap_context_notification_color_selection", new aw.a("snap_context_notification_color_selection", str2, true, 0));
                            hashMap.put(FriendmojiModel.EMOJI, new aw.a(FriendmojiModel.EMOJI, str4, false, 0));
                            hashMap.put("customized_name", new aw.a("customized_name", str4, false, 0));
                            hashMap.put("customized_timestamp", new aw.a("customized_timestamp", str2, false, 0));
                            hashMap.put("current_total_count", new aw.a("current_total_count", str2, true, 0));
                            hashMap.put("current_video_count", new aw.a("current_video_count", str2, true, 0));
                            hashMap.put("current_photo_count", new aw.a("current_photo_count", str2, true, 0));
                            hashMap.put("since_last_media_list_total_count", new aw.a("since_last_media_list_total_count", str2, true, 0));
                            hashMap.put("since_last_media_list_video_count", new aw.a("since_last_media_list_video_count", str2, true, 0));
                            hashMap.put("since_last_media_list_photo_count", new aw.a("since_last_media_list_photo_count", str2, true, 0));
                            hashSet2 = new HashSet(0);
                            HashSet hashSet4 = new HashSet(1);
                            hashSet4.add(new d("index_snap_bluetooth_device_ble_device_address", false, Arrays.asList(new String[]{str8})));
                            aw awVar3 = new aw("snap_bluetooth_device", hashMap, hashSet2, hashSet4);
                            a = aw.a(aaVar2, "snap_bluetooth_device");
                            if (awVar3.equals(a)) {
                                hashMap = new HashMap(2);
                                hashMap.put("spectacles_config_key", new aw.a("spectacles_config_key", str4, true, 1));
                                hashMap.put("spectacles_config_value", new aw.a("spectacles_config_value", str4, true, 0));
                                awVar = new aw("spectacles_config_pairs", hashMap, new HashSet(0), new HashSet(0));
                                a = aw.a(aaVar2, "spectacles_config_pairs");
                                if (awVar.equals(a)) {
                                    hashMap = new HashMap(4);
                                    hashMap.put(str3, new aw.a(str3, str4, true, 1));
                                    hashMap.put("content_transfer_mode", new aw.a("content_transfer_mode", str2, true, 0));
                                    hashMap.put("wifi_direct_retry_count", new aw.a("wifi_direct_retry_count", str2, true, 0));
                                    hashMap.put("wifi_ap_fallback_session_count", new aw.a("wifi_ap_fallback_session_count", str2, true, 0));
                                    hashSet2 = new HashSet(1);
                                    hashSet2.add(new aw.b("snap_bluetooth_device", "CASCADE", "NO ACTION", Arrays.asList(new String[]{str3}), Arrays.asList(new String[]{str3})));
                                    hashSet3 = new HashSet(1);
                                    hashSet3.add(new d("index_spectacles_transfer_channel_info_device_serial_number", false, Arrays.asList(new String[]{str3})));
                                    aw awVar4 = new aw("spectacles_transfer_channel_info", hashMap, hashSet2, hashSet3);
                                    a = aw.a(aaVar2, "spectacles_transfer_channel_info");
                                    if (awVar4.equals(a)) {
                                        hashMap = new HashMap(6);
                                        hashMap.put("update_version", new aw.a("update_version", str4, true, 1));
                                        hashMap.put("update_type", new aw.a("update_type", str2, true, 0));
                                        hashMap.put("update_timestamp", new aw.a("update_timestamp", str2, true, 0));
                                        hashMap.put("seen_timestamp", new aw.a("seen_timestamp", str2, true, 0));
                                        hashMap.put("tapped_timestamp", new aw.a("tapped_timestamp", str2, true, 0));
                                        hashMap.put("is_active", new aw.a("is_active", str2, true, 0));
                                        awVar3 = new aw("spectacles_update_event", hashMap, new HashSet(0), new HashSet(0));
                                        a = aw.a(aaVar2, "spectacles_update_event");
                                        if (awVar3.equals(a)) {
                                            hashMap = new HashMap(6);
                                            hashMap.put(str, new aw.a(str, str2, true, 1));
                                            hashMap.put("timestamp", new aw.a("timestamp", str2, true, 0));
                                            hashMap.put("longitude", new aw.a("longitude", "REAL", true, 0));
                                            hashMap.put("latitude", new aw.a("latitude", "REAL", true, 0));
                                            hashMap.put("filter_type", new aw.a("filter_type", str2, true, 0));
                                            hashMap.put("filter_metadata", new aw.a("filter_metadata", str4, true, 0));
                                            awVar4 = new aw("spectacles_media_geo_location", hashMap, new HashSet(0), new HashSet(0));
                                            a = aw.a(aaVar2, "spectacles_media_geo_location");
                                            if (awVar4.equals(a)) {
                                                hashMap = new HashMap(3);
                                                hashMap.put("firmware_update_file_id", new aw.a("firmware_update_file_id", str4, true, 1));
                                                hashMap.put("downloaded_to_client_timestamp", new aw.a("downloaded_to_client_timestamp", str2, true, 0));
                                                hashMap.put("transferred_to_firmware_timestamp", new aw.a("transferred_to_firmware_timestamp", str2, true, 0));
                                                aw awVar5 = new aw("spectacles_firmware_update_metadata", hashMap, new HashSet(0), new HashSet(0));
                                                aw a2 = aw.a(aaVar2, "spectacles_firmware_update_metadata");
                                                if (!awVar5.equals(a2)) {
                                                    stringBuilder = new StringBuilder("Migration didn't properly handle spectacles_firmware_update_metadata(com.snap.spectacles.base.persistence.SpectaclesFirmwareUpdateMetadata).\n Expected:\n");
                                                    stringBuilder.append(awVar5);
                                                    stringBuilder.append(str7);
                                                    stringBuilder.append(a2);
                                                    throw new IllegalStateException(stringBuilder.toString());
                                                }
                                                return;
                                            }
                                            stringBuilder = new StringBuilder("Migration didn't properly handle spectacles_media_geo_location(com.snap.spectacles.base.persistence.SpectaclesMediaGeoLocation).\n Expected:\n");
                                            stringBuilder.append(awVar4);
                                            stringBuilder.append(str7);
                                            stringBuilder.append(a);
                                            throw new IllegalStateException(stringBuilder.toString());
                                        }
                                        stringBuilder = new StringBuilder("Migration didn't properly handle spectacles_update_event(com.snap.spectacles.base.persistence.SpectaclesUpdateEvent).\n Expected:\n");
                                        stringBuilder.append(awVar3);
                                        stringBuilder.append(str7);
                                        stringBuilder.append(a);
                                        throw new IllegalStateException(stringBuilder.toString());
                                    }
                                    stringBuilder = new StringBuilder("Migration didn't properly handle spectacles_transfer_channel_info(com.snap.spectacles.base.persistence.SpectaclesTransferChannelInfo).\n Expected:\n");
                                    stringBuilder.append(awVar4);
                                    stringBuilder.append(str7);
                                    stringBuilder.append(a);
                                    throw new IllegalStateException(stringBuilder.toString());
                                }
                                stringBuilder = new StringBuilder("Migration didn't properly handle spectacles_config_pairs(com.snap.spectacles.base.persistence.SpectaclesConfigPairs).\n Expected:\n");
                                stringBuilder.append(awVar);
                                stringBuilder.append(str7);
                                stringBuilder.append(a);
                                throw new IllegalStateException(stringBuilder.toString());
                            }
                            stringBuilder = new StringBuilder("Migration didn't properly handle snap_bluetooth_device(com.snap.spectacles.base.persistence.SnapBluetoothDevice).\n Expected:\n");
                            stringBuilder.append(awVar3);
                            stringBuilder.append(str7);
                            stringBuilder.append(a);
                            throw new IllegalStateException(stringBuilder.toString());
                        }
                        stringBuilder = new StringBuilder("Migration didn't properly handle spectacles_content_store(com.snap.spectacles.base.persistence.SpectaclesContentStore).\n Expected:\n");
                        stringBuilder.append(awVar2);
                        stringBuilder.append(str7);
                        stringBuilder.append(a);
                        throw new IllegalStateException(stringBuilder.toString());
                    }
                    stringBuilder = new StringBuilder("Migration didn't properly handle spectacles_media_content(com.snap.spectacles.base.persistence.SpectaclesMediaContent).\n Expected:\n");
                    stringBuilder.append(awVar2);
                    stringBuilder.append(str7);
                    stringBuilder.append(a);
                    throw new IllegalStateException(stringBuilder.toString());
                }
                stringBuilder = new StringBuilder("Migration didn't properly handle spectacles_media_file(com.snap.spectacles.base.persistence.SpectaclesMediaFile).\n Expected:\n");
                stringBuilder.append(awVar);
                stringBuilder.append(str7);
                stringBuilder.append(a);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }, "d0666cd74af1dc9009682ec3846c50a1");
        ab.b.a a = ab.b.a(akVar.b);
        a.a = akVar.c;
        a.b = arVar;
        return akVar.a.a(a.a());
    }

    public final xfj g() {
        if (this.f != null) {
            return this.f;
        }
        xfj xfj;
        synchronized (this) {
            if (this.f == null) {
                this.f = new xfk(this);
            }
            xfj = this.f;
        }
        return xfj;
    }

    public final xff h() {
        if (this.g != null) {
            return this.g;
        }
        xff xff;
        synchronized (this) {
            if (this.g == null) {
                this.g = new xfg(this);
            }
            xff = this.g;
        }
        return xff;
    }

    public final xey i() {
        if (this.h != null) {
            return this.h;
        }
        xey xey;
        synchronized (this) {
            if (this.h == null) {
                this.h = new xez(this);
            }
            xey = this.h;
        }
        return xey;
    }

    public final xes j() {
        if (this.i != null) {
            return this.i;
        }
        xes xes;
        synchronized (this) {
            if (this.i == null) {
                this.i = new xet(this);
            }
            xes = this.i;
        }
        return xes;
    }

    public final xev k() {
        if (this.j != null) {
            return this.j;
        }
        xev xev;
        synchronized (this) {
            if (this.j == null) {
                this.j = new xew(this);
            }
            xev = this.j;
        }
        return xev;
    }

    public final xfo l() {
        if (this.k != null) {
            return this.k;
        }
        xfo xfo;
        synchronized (this) {
            if (this.k == null) {
                this.k = new xfp(this);
            }
            xfo = this.k;
        }
        return xfo;
    }

    public final xfs m() {
        if (this.l != null) {
            return this.l;
        }
        xfs xfs;
        synchronized (this) {
            if (this.l == null) {
                this.l = new xft(this);
            }
            xfs = this.l;
        }
        return xfs;
    }

    public final xfc n() {
        if (this.m != null) {
            return this.m;
        }
        xfc xfc;
        synchronized (this) {
            if (this.m == null) {
                this.m = new xfd(this);
            }
            xfc = this.m;
        }
        return xfc;
    }

    public final xfl o() {
        if (this.n != null) {
            return this.n;
        }
        xfl xfl;
        synchronized (this) {
            if (this.n == null) {
                this.n = new xfm(this);
            }
            xfl = this.n;
        }
        return xfl;
    }
}
