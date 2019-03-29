package com.feisu.greendao.db.gen;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.feisu.greendao.novel.DownloadBookInfo;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "dao_download_book".
*/
public class DownloadBookInfoDao extends AbstractDao<DownloadBookInfo, String> {

    public static final String TABLENAME = "dao_download_book";

    /**
     * Properties of entity DownloadBookInfo.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id_auto = new Property(0, Long.class, "id_auto", false, "id_auto");
        public final static Property Id = new Property(1, String.class, "id", true, "id");
        public final static Property Title = new Property(2, String.class, "title", false, "title");
        public final static Property Type = new Property(3, String.class, "type", false, "type");
        public final static Property Zztt = new Property(4, String.class, "zztt", false, "zztt");
        public final static Property Con = new Property(5, String.class, "con", false, "con");
        public final static Property Mark1 = new Property(6, String.class, "mark1", false, "mark1");
        public final static Property Mark2 = new Property(7, String.class, "mark2", false, "mark2");
        public final static Property Pic = new Property(8, String.class, "pic", false, "PIC");
    }

    private DaoSession daoSession;


    public DownloadBookInfoDao(DaoConfig config) {
        super(config);
    }
    
    public DownloadBookInfoDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"dao_download_book\" (" + //
                "\"id_auto\" INTEGER," + // 0: id_auto
                "\"id\" TEXT PRIMARY KEY NOT NULL ," + // 1: id
                "\"title\" TEXT," + // 2: title
                "\"type\" TEXT," + // 3: type
                "\"zztt\" TEXT," + // 4: zztt
                "\"con\" TEXT," + // 5: con
                "\"mark1\" TEXT," + // 6: mark1
                "\"mark2\" TEXT," + // 7: mark2
                "\"PIC\" TEXT);"); // 8: pic
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"dao_download_book\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, DownloadBookInfo entity) {
        stmt.clearBindings();
 
        Long id_auto = entity.getId_auto();
        if (id_auto != null) {
            stmt.bindLong(1, id_auto);
        }
 
        String id = entity.getId();
        if (id != null) {
            stmt.bindString(2, id);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(3, title);
        }
 
        String type = entity.getType();
        if (type != null) {
            stmt.bindString(4, type);
        }
 
        String zztt = entity.getZztt();
        if (zztt != null) {
            stmt.bindString(5, zztt);
        }
 
        String con = entity.getCon();
        if (con != null) {
            stmt.bindString(6, con);
        }
 
        String mark1 = entity.getMark1();
        if (mark1 != null) {
            stmt.bindString(7, mark1);
        }
 
        String mark2 = entity.getMark2();
        if (mark2 != null) {
            stmt.bindString(8, mark2);
        }
 
        String pic = entity.getPic();
        if (pic != null) {
            stmt.bindString(9, pic);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, DownloadBookInfo entity) {
        stmt.clearBindings();
 
        Long id_auto = entity.getId_auto();
        if (id_auto != null) {
            stmt.bindLong(1, id_auto);
        }
 
        String id = entity.getId();
        if (id != null) {
            stmt.bindString(2, id);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(3, title);
        }
 
        String type = entity.getType();
        if (type != null) {
            stmt.bindString(4, type);
        }
 
        String zztt = entity.getZztt();
        if (zztt != null) {
            stmt.bindString(5, zztt);
        }
 
        String con = entity.getCon();
        if (con != null) {
            stmt.bindString(6, con);
        }
 
        String mark1 = entity.getMark1();
        if (mark1 != null) {
            stmt.bindString(7, mark1);
        }
 
        String mark2 = entity.getMark2();
        if (mark2 != null) {
            stmt.bindString(8, mark2);
        }
 
        String pic = entity.getPic();
        if (pic != null) {
            stmt.bindString(9, pic);
        }
    }

    @Override
    protected final void attachEntity(DownloadBookInfo entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1);
    }    

    @Override
    public DownloadBookInfo readEntity(Cursor cursor, int offset) {
        DownloadBookInfo entity = new DownloadBookInfo( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id_auto
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // id
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // title
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // type
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // zztt
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // con
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // mark1
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // mark2
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8) // pic
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, DownloadBookInfo entity, int offset) {
        entity.setId_auto(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setId(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setTitle(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setType(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setZztt(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setCon(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setMark1(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setMark2(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setPic(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
     }
    
    @Override
    protected final String updateKeyAfterInsert(DownloadBookInfo entity, long rowId) {
        return entity.getId();
    }
    
    @Override
    public String getKey(DownloadBookInfo entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(DownloadBookInfo entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
