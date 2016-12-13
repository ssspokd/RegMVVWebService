/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database.dbClassDAO;

import Database.AbstractObjectDB;
import Database.dbClassesEntity.Contragent;
import java.util.LinkedList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author spok
 */
public class ContragentImpl extends AbstractObjectDB<Contragent>
{
    public final static String TABLE_NAME = "Contragent";
    public ContragentImpl() {
        super(TABLE_NAME);
    }
    private static ContragentImpl instance = null;
    
    public static ContragentImpl getInstance() {
        if (instance == null) {
            instance = new ContragentImpl();
        }

        return instance;
    }
    
    public static List<String> getContragentFromOSp(int id){
        List<String> ret = new LinkedList<>();
        Session session = getSession();
        try{
            ret = session.createSQLQuery("select NAME_CONTRAGENT from Contragent where ID_OSP = :param1").setInteger("param1", id).list();
            session.getTransaction().commit();
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
        
    
        return ret;
    }
   
}
