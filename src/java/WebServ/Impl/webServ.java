/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebServ.Impl;

import Database.dbClassDAO.ContragentImpl;
import Database.dbClassDAO.OSPImpl;
import Database.dbClassesEntity.Contragent;
import Database.dbClassesEntity.Osp;
import WebServ.WebServ;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
/**
 *
 * @author spok
 */
@WebService(name = "WebServMVV")
public class webServ implements WebServ
{
   
    @Override
    public Contragent getContragentFromID(Long id)  {
        Contragent contragent = null;
        try {
            contragent =  new ContragentImpl().getObjectByID(id);
            int g = 9;
        } catch (SQLException ex) {
            Logger.getLogger(webServ.class.getName()).log(Level.SEVERE, null, ex);
        }
        return contragent;
    }

   /* @Override
    public Contragent getContragentFromName(String NameContragent) throws SQLException {
        return ContragentImpl.getInstance().
    }*/

    /**
     * 
     * @return возврщает список содержащий всех контрагентов
     * @throws SQLException 
     */
    @Override
    public List<Contragent> getAllContragent()   {
        List<Contragent> contragent= new LinkedList<>();
        try {
            contragent.addAll(ContragentImpl.getInstance().getAllObjects());
        } catch (SQLException ex) {
            Logger.getLogger(webServ.class.getName()).log(Level.SEVERE, null, ex);
        }
        return contragent;
    }
/*
    @Override
    public Contragent getContragent(Osp osp, Long id, String NameContragent) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
*/
    @Override
    public void insertContragent(Contragent contragent)   {
        try {
            ContragentImpl.getInstance().insert(contragent);
        } catch (SQLException ex) {
            Logger.getLogger(webServ.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void updateOrInsertContragent(Contragent contragent)   {
        try {
            ContragentImpl.getInstance().UpdateOrInsertObject(contragent);
        } catch (SQLException ex) {
            Logger.getLogger(webServ.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void updateContragent(Contragent contragent)   {
        try {
            ContragentImpl.getInstance().UpdateObject(contragent);
        } catch (SQLException ex) {
            Logger.getLogger(webServ.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void deleteContragent(Contragent contragen)   {
        try {
            ContragentImpl.getInstance().DeleteObject(contragen);
        } catch (SQLException ex) {
            Logger.getLogger(webServ.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Osp getOSPFromID(Long id)   {
        Osp osp = null;
        try {
            osp = OSPImpl.getInstance().getObjectByID(id);
        } catch (SQLException ex) {
            Logger.getLogger(webServ.class.getName()).log(Level.SEVERE, null, ex);
        }
        return osp;
    }

   /* @Override
    public Osp getOSPFromName(String NameOSP) throws SQLException {
        return 
    }*/

    @Override
    public List<Osp> getAllOsp()   {
        List<Osp> osp = null;
        try {
            osp =  OSPImpl.getInstance().getAllObjects();
        } catch (SQLException ex) {
            Logger.getLogger(webServ.class.getName()).log(Level.SEVERE, null, ex);
        }
        return osp;
    }

    @Override
    public void insertOSP(Osp osp)   {
        try {
            OSPImpl.getInstance().insert(osp);
        } catch (SQLException ex) {
            Logger.getLogger(webServ.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void  updateOrInsertOSP(Osp osp)   {
        try {
            OSPImpl.getInstance().UpdateOrInsertObject(osp);
        } catch (SQLException ex) {
            Logger.getLogger(webServ.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void updateOSP(Osp osp)   {
        try {
            OSPImpl.getInstance().UpdateObject(osp);
        } catch (SQLException ex) {
            Logger.getLogger(webServ.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void deleteOSP(Osp osp)   {
        try {
            OSPImpl.getInstance().DeleteObject(osp);
        } catch (SQLException ex) {
            Logger.getLogger(webServ.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<String> getListNameOsp() {
        List<String> ret = new LinkedList<>();
        try {
            for(Osp osp : OSPImpl.getInstance().getAllObjects()){
                ret.add(osp.getNameOsp());
            }
        } catch (SQLException ex) {
            Logger.getLogger(webServ.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ret;
    }
    
    public List<String> getgetListNameContragetnFromOSP(int id){
        List<String> ret =  new LinkedList<>();
        try{
            ret = ContragentImpl.getContragentFromOSp(id);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return  ret;
    }
}
