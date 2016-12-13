package WebServ;

import Database.dbClassesEntity.Osp;
import java.util.ArrayList;




public interface OSPwebService { 
    Osp  searchOSPFromID(Long id);  
    ArrayList<Osp>  searchOSPFromName(String NameOSP);
}
