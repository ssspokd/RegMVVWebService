/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database.dbClassDAO;

import Database.AbstractObjectDB;
import Database.dbClassesEntity.Osp;
import java.sql.SQLException;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import util.DAO;
import static util.DAO.getSession;

/**
 *
 * @author spok
 */
public class OSPImpl extends AbstractObjectDB<Osp>
{
    public final static String TABLE_NAME = "Osp";
    public OSPImpl() {
        super(TABLE_NAME);
    }
    private static OSPImpl instance = null;
    
    public static OSPImpl getInstance() {
        if (instance == null) {
            instance = new OSPImpl();
        }
        return instance;
    }

}
