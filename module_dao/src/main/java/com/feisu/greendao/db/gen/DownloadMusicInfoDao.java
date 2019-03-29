package com.feisu.greendao.db.gen;

import java.util.List;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.query.Query;
import org.greenrobot.greendao.query.QueryBuilder;

import com.feisu.greendao.novel.DownloadMusicInfo;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "dao_download_book_chapter".
*/
public class DownloadMusicInfoDao extends AbstractDao<DownloadMusicInfo, String> {

    public static final String TABLENAME = "dao_download_book_chapter";

    /**
     * Properties of entity DownloadMusicInfo.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Book_title = new Property(0, String.class, "book_title", false, "BOOK_TITLE");
        public final static Property Book_type = new Property(1, String.class, "book_type", false, "BOOK_TYPE");
        public final static Property Title = new Property(2, String.class, "title", false, "TITLE");
        public final static Property MusicPath = new Property(3, String.class, "musicPath", false, "MUSIC_PATH");
        public final static Property PathOnline = new Property(4, String.class, "pathOnline", false, "PATH_ONLINE");
        public final static Property Book_id = new Property(5, String.class, "book_id", false, "BOOK_ID");
        public final static Property Data_id = new Property(6, String.class, "data_id", true, "data_id");
        public final static Property Book_chapter_status = new Property(7, String.class, "book_chapter_status", false, "book_chapter_status");
        public final static Property Mark1 = new Property(8, String.class, "mark1", false, "mark1");
    }

    private Query<DownloadMusicInfo> downloadBookInfo_MusicInfoListQuery;

    public DownloadMusicInfoDao(DaoConfig config) {
        super(config);
    }
    
    public DownloadMusicInfoDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"dao_download_book_chapter\" (" + //
                "\"BOOK_TITLE\" TEXT," + // 0: book_title
                "\"BOOK_TYPE\" TEXT," + // 1: book_type
                "\"TITLE\" TEXT," + // 2: title
                "\"MUSIC_PATH\" TEXT," + // 3: musicPath
                "\"PATH_ONLINE\" TEXT," + // 4: pathOnline
                "\"BOOK_ID\" TEXT," + // 5: book_id
                "\"data_id\" TEXT PRIMARY KEY NOT NULL ," + // 6: data_id
                "\"book_chapter_status\" TEXT," + // 7: book_chapter_status
                "\"mark1\" TEXT);"); // 8: mark1
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"dao_download_book_chapter\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, DownloadMusicInfo entity) {
        stmt.clearBindings();
 
        String book_title = entity.getBook_title();
        if (book_title != null) {
            stmt.bindString(1, book_title);
        }
 
        String book_type = entity.getBook_type();
        if (book_type != null) {
            stmt.bindString(2, book_type);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(3, title);
        }
 
        String musicPath = entity.getMusicPath();
        if (musicPath != null) {
            stmt.bindString(4, musicPath);
        }
 
        String pathOnline = entity.getPathOnline();
        if (pathOnline != null) {
            stmt.bindString(5, pathOnline);
        }
 
        String book_id = entity.getBook_id();
        if (book_id != null) {
            stmt.bindString(6, book_id);
        }
 
        String data_id = entity.getData_id();
        if (data_id != null) {
            stmt.bindString(7, data_id);
        }
 
        String book_chapter_status = entity.getBook_chapter_status();
        if (book_chapter_status != null) {
            stmt.bindString(8, book_chapter_status);
        }
 
        String mark1 = entity.getMark1();
        if (mark1 != null) {
            stmt.bindString(9, mark1);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, DownloadMusicInfo entity) {
        stmt.clearBindings();
 
        String book_title = entity.getBook_title();
        if (book_title != null) {
            stmt.bindString(1, book_title);
        }
 
        String book_type = entity.getBook_type();
        if (book_type != null) {
            stmt.bindString(2, book_type);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(3, title);
        }
 
        String musicPath = entity.getMusicPath();
        if (musicPath != null) {
            stmt.bindString(4, musicPath);
        }
 
        String pathOnline = entity.getPathOnline();
        if (pathOnline != null) {
            stmt.bindString(5, pathOnline);
        }
 
        String book_id = entity.getBook_id();
        if (book_id != null) {
            stmt.bindString(6, book_id);
        }
 
        String data_id = entity.getData_id();
        if (data_id != null) {
            stmt.bindString(7, data_id);
        }
 
        String book_chapter_status = entity.getBook_chapter_status();
        if (book_chapter_status != null) {
            stmt.bindString(8, book_chapter_status);
        }
 
        String mark1 = entity.getMark1();
        if (mark1 != null) {
            stmt.bindString(9, mark1);
        }
    }

    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6);
    }    

    @Override
    public DownloadMusicInfo readEntity(Cursor cursor, int offset) {
        DownloadMusicInfo entity = new DownloadMusicInfo( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // book_title
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // book_type
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // title
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // musicPath
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // pathOnline
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // book_id
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // data_id
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // book_chapter_status
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8) // mark1
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, DownloadMusicInfo entity, int offset) {
        entity.setBook_title(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setBook_type(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setTitle(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setMusicPath(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setPathOnline(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setBook_id(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setData_id(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setBook_chapter_status(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setMark1(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
     }
    
    @Override
    protected final String updateKeyAfterInsert(DownloadMusicInfo entity, long rowId) {
        return entity.getData_id();
    }
    
    @Override
    public String getKey(DownloadMusicInfo entity) {
        if(entity != null) {
            return entity.getData_id();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(DownloadMusicInfo entity) {
        return entity.getData_id() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
    /** Internal query to resolve the "musicInfoList" to-many relationship of DownloadBookInfo. */
    public List<DownloadMusicInfo> _queryDownloadBookInfo_MusicInfoList(String book_id) {
        synchronized (this) {
            if (downloadBookInfo_MusicInfoListQuery == null) {
                QueryBuilder<DownloadMusicInfo> queryBuilder = queryBuilder();
                queryBuilder.where(Properties.Book_id.eq(null));
                downloadBookInfo_MusicInfoListQuery = queryBuilder.build();
            }
        }
        Query<DownloadMusicInfo> query = downloadBookInfo_MusicInfoListQuery.forCurrentThread();
        query.setParameter(0, book_id);
        return query.list();
    }

}