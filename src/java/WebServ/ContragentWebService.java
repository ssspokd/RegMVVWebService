/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebServ;

import Database.dbClassesEntity.Contragent;
import Database.dbClassesEntity.Osp;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author spok
 */
public interface ContragentWebService {
    Contragent  getContragentFromID(Long id) throws SQLException;  
    Contragent  getContragentFromName(String NameContragent)throws SQLException;
    List<Contragent>  getAllContragent()throws SQLException;
    Contragent getContragent(Osp osp, Long id, String NameContragent)throws SQLException;
}
