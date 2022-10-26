package org.digitalcampus.oppia.database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.digitalcampus.oppia.database.dao.LeaderboardDao;
import org.digitalcampus.oppia.database.dao.LeaderboardDao_Impl;
import org.digitalcampus.oppia.database.dao.UserCustomFieldDao;
import org.digitalcampus.oppia.database.dao.UserCustomFieldDao_Impl;
import org.digitalcampus.oppia.database.dao.UserPreferenceDao;
import org.digitalcampus.oppia.database.dao.UserPreferenceDao_Impl;

@SuppressWarnings("unchecked")
public final class MyDatabase_Impl extends MyDatabase {
  private volatile UserPreferenceDao _userPreferenceDao;

  private volatile UserCustomFieldDao _userCustomFieldDao;

  private volatile LeaderboardDao _leaderboardDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(2) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `user_custom_field` (`_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `username` TEXT NOT NULL, `field_key` TEXT NOT NULL, `value_str` TEXT, `value_int` INTEGER, `value_bool` INTEGER, `value_float` REAL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `user_preference` (`_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `username` TEXT NOT NULL, `preference` TEXT NOT NULL, `value` TEXT)");
        _db.execSQL("CREATE UNIQUE INDEX `idx` ON `user_preference` (`username`, `preference`)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `leaderboard` (`_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `username` TEXT, `fullname` TEXT, `points` INTEGER, `position` INTEGER, `lastupdate` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"5bed8360b40301dfabd49dc86568b57d\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `user_custom_field`");
        _db.execSQL("DROP TABLE IF EXISTS `user_preference`");
        _db.execSQL("DROP TABLE IF EXISTS `leaderboard`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsUserCustomField = new HashMap<String, TableInfo.Column>(7);
        _columnsUserCustomField.put("_id", new TableInfo.Column("_id", "INTEGER", true, 1));
        _columnsUserCustomField.put("username", new TableInfo.Column("username", "TEXT", true, 0));
        _columnsUserCustomField.put("field_key", new TableInfo.Column("field_key", "TEXT", true, 0));
        _columnsUserCustomField.put("value_str", new TableInfo.Column("value_str", "TEXT", false, 0));
        _columnsUserCustomField.put("value_int", new TableInfo.Column("value_int", "INTEGER", false, 0));
        _columnsUserCustomField.put("value_bool", new TableInfo.Column("value_bool", "INTEGER", false, 0));
        _columnsUserCustomField.put("value_float", new TableInfo.Column("value_float", "REAL", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysUserCustomField = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesUserCustomField = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoUserCustomField = new TableInfo("user_custom_field", _columnsUserCustomField, _foreignKeysUserCustomField, _indicesUserCustomField);
        final TableInfo _existingUserCustomField = TableInfo.read(_db, "user_custom_field");
        if (! _infoUserCustomField.equals(_existingUserCustomField)) {
          throw new IllegalStateException("Migration didn't properly handle user_custom_field(org.digitalcampus.oppia.model.db_model.UserCustomField).\n"
                  + " Expected:\n" + _infoUserCustomField + "\n"
                  + " Found:\n" + _existingUserCustomField);
        }
        final HashMap<String, TableInfo.Column> _columnsUserPreference = new HashMap<String, TableInfo.Column>(4);
        _columnsUserPreference.put("_id", new TableInfo.Column("_id", "INTEGER", true, 1));
        _columnsUserPreference.put("username", new TableInfo.Column("username", "TEXT", true, 0));
        _columnsUserPreference.put("preference", new TableInfo.Column("preference", "TEXT", true, 0));
        _columnsUserPreference.put("value", new TableInfo.Column("value", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysUserPreference = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesUserPreference = new HashSet<TableInfo.Index>(1);
        _indicesUserPreference.add(new TableInfo.Index("idx", true, Arrays.asList("username","preference")));
        final TableInfo _infoUserPreference = new TableInfo("user_preference", _columnsUserPreference, _foreignKeysUserPreference, _indicesUserPreference);
        final TableInfo _existingUserPreference = TableInfo.read(_db, "user_preference");
        if (! _infoUserPreference.equals(_existingUserPreference)) {
          throw new IllegalStateException("Migration didn't properly handle user_preference(org.digitalcampus.oppia.model.db_model.UserPreference).\n"
                  + " Expected:\n" + _infoUserPreference + "\n"
                  + " Found:\n" + _existingUserPreference);
        }
        final HashMap<String, TableInfo.Column> _columnsLeaderboard = new HashMap<String, TableInfo.Column>(6);
        _columnsLeaderboard.put("_id", new TableInfo.Column("_id", "INTEGER", true, 1));
        _columnsLeaderboard.put("username", new TableInfo.Column("username", "TEXT", false, 0));
        _columnsLeaderboard.put("fullname", new TableInfo.Column("fullname", "TEXT", false, 0));
        _columnsLeaderboard.put("points", new TableInfo.Column("points", "INTEGER", false, 0));
        _columnsLeaderboard.put("position", new TableInfo.Column("position", "INTEGER", false, 0));
        _columnsLeaderboard.put("lastupdate", new TableInfo.Column("lastupdate", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysLeaderboard = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesLeaderboard = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoLeaderboard = new TableInfo("leaderboard", _columnsLeaderboard, _foreignKeysLeaderboard, _indicesLeaderboard);
        final TableInfo _existingLeaderboard = TableInfo.read(_db, "leaderboard");
        if (! _infoLeaderboard.equals(_existingLeaderboard)) {
          throw new IllegalStateException("Migration didn't properly handle leaderboard(org.digitalcampus.oppia.model.db_model.Leaderboard).\n"
                  + " Expected:\n" + _infoLeaderboard + "\n"
                  + " Found:\n" + _existingLeaderboard);
        }
      }
    }, "5bed8360b40301dfabd49dc86568b57d", "ca771246c8820a88c953f2a53b8e326e");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "user_custom_field","user_preference","leaderboard");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `user_custom_field`");
      _db.execSQL("DELETE FROM `user_preference`");
      _db.execSQL("DELETE FROM `leaderboard`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public UserPreferenceDao userPreferenceDao() {
    if (_userPreferenceDao != null) {
      return _userPreferenceDao;
    } else {
      synchronized(this) {
        if(_userPreferenceDao == null) {
          _userPreferenceDao = new UserPreferenceDao_Impl(this);
        }
        return _userPreferenceDao;
      }
    }
  }

  @Override
  public UserCustomFieldDao userCustomFieldDao() {
    if (_userCustomFieldDao != null) {
      return _userCustomFieldDao;
    } else {
      synchronized(this) {
        if(_userCustomFieldDao == null) {
          _userCustomFieldDao = new UserCustomFieldDao_Impl(this);
        }
        return _userCustomFieldDao;
      }
    }
  }

  @Override
  public LeaderboardDao leaderboardDao() {
    if (_leaderboardDao != null) {
      return _leaderboardDao;
    } else {
      synchronized(this) {
        if(_leaderboardDao == null) {
          _leaderboardDao = new LeaderboardDao_Impl(this);
        }
        return _leaderboardDao;
      }
    }
  }
}
