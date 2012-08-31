/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.praeses.data.orm;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import com.praeses.data.Person;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import roboguice.util.Ln;

/**
 *
 * @author dculpepper
 */
public class DatabaseHelper extends OrmLiteSqliteOpenHelper {

    private static final String DATABASE_NAME = "demoApp.db";
    private static final int DATABASE_VERSION = 1;
    private Dao<Person, String> personDao = null;

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqld, ConnectionSource cs) {
        try {
            Ln.i(DatabaseHelper.class.getName(), "onCreate");
            TableUtils.createTable(connectionSource, Person.class);

            Dao<Person, String> dao = getPersonDao();
            
            Person person = new Person();
            person.setName("Jim");
            person.setAddress("Over there");
            person.setPhone(("555-5555"));
            dao.create(person);
            
            person = new Person();
            person.setName("Henry");
            person.setAddress("Mars");
            person.setPhone("777-7777");
            dao.create(person);
            
            Ln.i(DatabaseHelper.class.getName(), "created new entries in onCreate");
        } catch (SQLException ex) {
            Ln.e(DatabaseHelper.class.getName(), "Can't create database");
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqld, ConnectionSource cs, int i, int i1) {
        try {
            Ln.i(DatabaseHelper.class.getName(), "onUpgrade");
            TableUtils.dropTable(cs, Person.class, true);
            onCreate(sqld, cs);
        } catch (SQLException ex) {
            Ln.i(DatabaseHelper.class.getName(), "Can't Drop Database");
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void close() {
        super.close();
    }

    public Dao<Person, String> getPersonDao() throws SQLException {
        if (personDao == null) {
            personDao = getDao(Person.class);
        }
        return personDao;
    }
}
