/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database.Interfaces;

import Database.dbClassesEntity.Contragent;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author spok
 */
public interface ContragentDAO {
    public void addContragent(Contragent contragent) throws SQLException;   //δξαΰβθςό ρςσδενςΰ
    public void updateContragent(Contragent contragent) throws SQLException;//ξανξβθςό ρςσδενςΰ
    public Contragent getContragentById(Long id) throws SQLException;	   //οξλσχθςό ρςεδενςΰ οξ id
    public List<Contragent> getAllContragent() throws SQLException;			   //οξλσχθςό βρευ ρςσδενςξβ
    public void deleteContragent(Contragent contragent) throws SQLException;//σδΰλθςό ρςσδενςΰ
}
