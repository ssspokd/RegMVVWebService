
import Database.dbClassDAO.ContragentImpl;
import Database.dbClassDAO.OSPImpl;
import Database.dbClassesEntity.Contragent;
import Database.dbClassesEntity.Osp;
import java.util.ArrayList;
import javax.interceptor.Interceptors;
import logger.logger;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author spok
 */
public class main {
    
    @Interceptors(logger.class)
    public static void main(String[] args) throws Exception {
        int sd = 0;
        Osp s =  OSPImpl.getInstance().getObjectByID((long)1);
        ArrayList<Contragent> list;
             list =   new ContragentImpl().getAllObjects();
                int sdg = 0;
    }
}
