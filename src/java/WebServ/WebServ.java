/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebServ;

import Database.dbClassesEntity.Contragent;
import Database.dbClassesEntity.Osp;
import java.util.List;

/**
 *
 * @author spok
 */
public interface WebServ 
{
    Contragent  getContragentFromID(Long id);  
    //Contragent  getContragentFromName(String NameContragent)throws SQLException;
    List<Contragent>  getAllContragent() ;
    //Contragent getContragent(Osp osp, Long id, String NameContragent)throws SQLException;
    void insertContragent(Contragent contragent)  ;
    void updateOrInsertContragent(Contragent contragent) ;
    void updateContragent(Contragent  contragent)  ;
    void deleteContragent(Contragent  contragent)  ;
    //
    Osp  getOSPFromID(Long id) ;  
    //Osp  getOSPFromName(String NameOSP) throws SQLException;
    List<Osp> getAllOsp()  ;
    void insertOSP(Osp osp)  ;
    void updateOrInsertOSP(Osp osp) ;
    void updateOSP(Osp  osp)  ;
    void deleteOSP(Osp osp)  ;
}
