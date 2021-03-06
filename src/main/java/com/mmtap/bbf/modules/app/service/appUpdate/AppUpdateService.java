package com.mmtap.bbf.modules.app.service.appUpdate;

import com.mmtap.bbf.modules.app.service.ServiceSupport;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * APP版本管理
 *
 * @author mmtap.com
 * @email java_khan@126.com
 * @date 2018-03-15 10:45
 */
@Service("appUpdateService")
public class  AppUpdateService extends  ServiceSupport{


    public HashMap<String,Object> queryObject(HashMap<String,Object> param) throws Exception{
        return findForObject("appUpdate.AppUpdateDao.queryObject",param);
    }


    public List<HashMap<String,Object>> queryList(HashMap<String,Object> param) throws Exception{
        return findForList("appUpdate.AppUpdateDao.queryList",param);
    }


    public void saveInfo(HashMap<String,Object> param) throws Exception{
        insert("appUpdate.AppUpdateDao.save",param);
    }


    public void updateInfo(HashMap<String,Object> param) throws Exception{
        update("appUpdate.AppUpdateDao.update",param);
    }


    public void deleteInfo(HashMap<String,Object> param) throws Exception{
        delete("appUpdate.AppUpdateDao.delete",param);
    }


    public void deleteBatch(HashMap<String,Object> param) throws Exception{
        delete("appUpdate.AppUpdateDao.deleteBatch",param);
    }
}
