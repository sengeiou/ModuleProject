package com.feisu.greendao.db.gen;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.feisu.greendao.novel.DownloadBookInfo;
import com.feisu.greendao.novel.DownloadMusicInfo;
import com.feisu.greendao.novel.ListenerBookInfo;
import com.feisu.greendao.novel.ListenerMusicInfo;
import com.feisu.greendao.novel.Music;
import com.feisu.greendao.novel.TCAlbumTable;
import com.feisu.greendao.novel.TCLastListenerTable;
import com.feisu.greendao.novel.TCListenerTable;
import com.feisu.greendao.radio.CategoryBean;
import com.feisu.greendao.radio.FMBean;
import com.feisu.greendao.radio.RadioEntity;
import com.feisu.greendao.radio.SearchHistoryEntity;
import com.feisu.greendao.radio.UserTokenEntity;

import com.feisu.greendao.db.gen.DownloadBookInfoDao;
import com.feisu.greendao.db.gen.DownloadMusicInfoDao;
import com.feisu.greendao.db.gen.ListenerBookInfoDao;
import com.feisu.greendao.db.gen.ListenerMusicInfoDao;
import com.feisu.greendao.db.gen.MusicDao;
import com.feisu.greendao.db.gen.TCAlbumTableDao;
import com.feisu.greendao.db.gen.TCLastListenerTableDao;
import com.feisu.greendao.db.gen.TCListenerTableDao;
import com.feisu.greendao.db.gen.CategoryBeanDao;
import com.feisu.greendao.db.gen.FMBeanDao;
import com.feisu.greendao.db.gen.RadioEntityDao;
import com.feisu.greendao.db.gen.SearchHistoryEntityDao;
import com.feisu.greendao.db.gen.UserTokenEntityDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig downloadBookInfoDaoConfig;
    private final DaoConfig downloadMusicInfoDaoConfig;
    private final DaoConfig listenerBookInfoDaoConfig;
    private final DaoConfig listenerMusicInfoDaoConfig;
    private final DaoConfig musicDaoConfig;
    private final DaoConfig tCAlbumTableDaoConfig;
    private final DaoConfig tCLastListenerTableDaoConfig;
    private final DaoConfig tCListenerTableDaoConfig;
    private final DaoConfig categoryBeanDaoConfig;
    private final DaoConfig fMBeanDaoConfig;
    private final DaoConfig radioEntityDaoConfig;
    private final DaoConfig searchHistoryEntityDaoConfig;
    private final DaoConfig userTokenEntityDaoConfig;

    private final DownloadBookInfoDao downloadBookInfoDao;
    private final DownloadMusicInfoDao downloadMusicInfoDao;
    private final ListenerBookInfoDao listenerBookInfoDao;
    private final ListenerMusicInfoDao listenerMusicInfoDao;
    private final MusicDao musicDao;
    private final TCAlbumTableDao tCAlbumTableDao;
    private final TCLastListenerTableDao tCLastListenerTableDao;
    private final TCListenerTableDao tCListenerTableDao;
    private final CategoryBeanDao categoryBeanDao;
    private final FMBeanDao fMBeanDao;
    private final RadioEntityDao radioEntityDao;
    private final SearchHistoryEntityDao searchHistoryEntityDao;
    private final UserTokenEntityDao userTokenEntityDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        downloadBookInfoDaoConfig = daoConfigMap.get(DownloadBookInfoDao.class).clone();
        downloadBookInfoDaoConfig.initIdentityScope(type);

        downloadMusicInfoDaoConfig = daoConfigMap.get(DownloadMusicInfoDao.class).clone();
        downloadMusicInfoDaoConfig.initIdentityScope(type);

        listenerBookInfoDaoConfig = daoConfigMap.get(ListenerBookInfoDao.class).clone();
        listenerBookInfoDaoConfig.initIdentityScope(type);

        listenerMusicInfoDaoConfig = daoConfigMap.get(ListenerMusicInfoDao.class).clone();
        listenerMusicInfoDaoConfig.initIdentityScope(type);

        musicDaoConfig = daoConfigMap.get(MusicDao.class).clone();
        musicDaoConfig.initIdentityScope(type);

        tCAlbumTableDaoConfig = daoConfigMap.get(TCAlbumTableDao.class).clone();
        tCAlbumTableDaoConfig.initIdentityScope(type);

        tCLastListenerTableDaoConfig = daoConfigMap.get(TCLastListenerTableDao.class).clone();
        tCLastListenerTableDaoConfig.initIdentityScope(type);

        tCListenerTableDaoConfig = daoConfigMap.get(TCListenerTableDao.class).clone();
        tCListenerTableDaoConfig.initIdentityScope(type);

        categoryBeanDaoConfig = daoConfigMap.get(CategoryBeanDao.class).clone();
        categoryBeanDaoConfig.initIdentityScope(type);

        fMBeanDaoConfig = daoConfigMap.get(FMBeanDao.class).clone();
        fMBeanDaoConfig.initIdentityScope(type);

        radioEntityDaoConfig = daoConfigMap.get(RadioEntityDao.class).clone();
        radioEntityDaoConfig.initIdentityScope(type);

        searchHistoryEntityDaoConfig = daoConfigMap.get(SearchHistoryEntityDao.class).clone();
        searchHistoryEntityDaoConfig.initIdentityScope(type);

        userTokenEntityDaoConfig = daoConfigMap.get(UserTokenEntityDao.class).clone();
        userTokenEntityDaoConfig.initIdentityScope(type);

        downloadBookInfoDao = new DownloadBookInfoDao(downloadBookInfoDaoConfig, this);
        downloadMusicInfoDao = new DownloadMusicInfoDao(downloadMusicInfoDaoConfig, this);
        listenerBookInfoDao = new ListenerBookInfoDao(listenerBookInfoDaoConfig, this);
        listenerMusicInfoDao = new ListenerMusicInfoDao(listenerMusicInfoDaoConfig, this);
        musicDao = new MusicDao(musicDaoConfig, this);
        tCAlbumTableDao = new TCAlbumTableDao(tCAlbumTableDaoConfig, this);
        tCLastListenerTableDao = new TCLastListenerTableDao(tCLastListenerTableDaoConfig, this);
        tCListenerTableDao = new TCListenerTableDao(tCListenerTableDaoConfig, this);
        categoryBeanDao = new CategoryBeanDao(categoryBeanDaoConfig, this);
        fMBeanDao = new FMBeanDao(fMBeanDaoConfig, this);
        radioEntityDao = new RadioEntityDao(radioEntityDaoConfig, this);
        searchHistoryEntityDao = new SearchHistoryEntityDao(searchHistoryEntityDaoConfig, this);
        userTokenEntityDao = new UserTokenEntityDao(userTokenEntityDaoConfig, this);

        registerDao(DownloadBookInfo.class, downloadBookInfoDao);
        registerDao(DownloadMusicInfo.class, downloadMusicInfoDao);
        registerDao(ListenerBookInfo.class, listenerBookInfoDao);
        registerDao(ListenerMusicInfo.class, listenerMusicInfoDao);
        registerDao(Music.class, musicDao);
        registerDao(TCAlbumTable.class, tCAlbumTableDao);
        registerDao(TCLastListenerTable.class, tCLastListenerTableDao);
        registerDao(TCListenerTable.class, tCListenerTableDao);
        registerDao(CategoryBean.class, categoryBeanDao);
        registerDao(FMBean.class, fMBeanDao);
        registerDao(RadioEntity.class, radioEntityDao);
        registerDao(SearchHistoryEntity.class, searchHistoryEntityDao);
        registerDao(UserTokenEntity.class, userTokenEntityDao);
    }
    
    public void clear() {
        downloadBookInfoDaoConfig.clearIdentityScope();
        downloadMusicInfoDaoConfig.clearIdentityScope();
        listenerBookInfoDaoConfig.clearIdentityScope();
        listenerMusicInfoDaoConfig.clearIdentityScope();
        musicDaoConfig.clearIdentityScope();
        tCAlbumTableDaoConfig.clearIdentityScope();
        tCLastListenerTableDaoConfig.clearIdentityScope();
        tCListenerTableDaoConfig.clearIdentityScope();
        categoryBeanDaoConfig.clearIdentityScope();
        fMBeanDaoConfig.clearIdentityScope();
        radioEntityDaoConfig.clearIdentityScope();
        searchHistoryEntityDaoConfig.clearIdentityScope();
        userTokenEntityDaoConfig.clearIdentityScope();
    }

    public DownloadBookInfoDao getDownloadBookInfoDao() {
        return downloadBookInfoDao;
    }

    public DownloadMusicInfoDao getDownloadMusicInfoDao() {
        return downloadMusicInfoDao;
    }

    public ListenerBookInfoDao getListenerBookInfoDao() {
        return listenerBookInfoDao;
    }

    public ListenerMusicInfoDao getListenerMusicInfoDao() {
        return listenerMusicInfoDao;
    }

    public MusicDao getMusicDao() {
        return musicDao;
    }

    public TCAlbumTableDao getTCAlbumTableDao() {
        return tCAlbumTableDao;
    }

    public TCLastListenerTableDao getTCLastListenerTableDao() {
        return tCLastListenerTableDao;
    }

    public TCListenerTableDao getTCListenerTableDao() {
        return tCListenerTableDao;
    }

    public CategoryBeanDao getCategoryBeanDao() {
        return categoryBeanDao;
    }

    public FMBeanDao getFMBeanDao() {
        return fMBeanDao;
    }

    public RadioEntityDao getRadioEntityDao() {
        return radioEntityDao;
    }

    public SearchHistoryEntityDao getSearchHistoryEntityDao() {
        return searchHistoryEntityDao;
    }

    public UserTokenEntityDao getUserTokenEntityDao() {
        return userTokenEntityDao;
    }

}
