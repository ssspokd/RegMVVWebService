/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database.dbClassDAO;

import Database.Interfaces.ObjectDB;
import Database.dbClassesEntity.Contragent;
import Database.dbClassesEntity.Osp;
import com.mchange.v1.db.sql.UnsupportedTypeException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import util.DAO;
import Database.AbstractObjectDB;
import static util.DAO.getSession;
import Database.AbstractObjectDB;
import Database.dbClassesEntity.SysUsers;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import org.hibernate.Session;


/**
 *
 * @author spok
 */
public class SysUsersImpl extends AbstractObjectDB<SysUsers>
{
    public final static String TABLE_NAME = "SysUsers";
    
    private SysUsersImpl() {
        super(TABLE_NAME);
    }
    private static SysUsersImpl instance = null;
    
    public static SysUsersImpl getInstance() {
        if (instance == null) {
            instance = new SysUsersImpl();
        }

        return instance;
    }
}
