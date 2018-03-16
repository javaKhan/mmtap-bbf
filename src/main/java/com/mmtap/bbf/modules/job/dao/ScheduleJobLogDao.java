package com.mmtap.bbf.modules.job.dao;

import com.mmtap.bbf.modules.job.entity.ScheduleJobLogEntity;
import com.mmtap.bbf.modules.sys.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;

/**
 * 定时任务日志
 * 
 * @author czx
 * @email object_czx@163.com
 * @date 2016年12月1日 下午10:30:02
 */
@Mapper
public interface ScheduleJobLogDao extends BaseDao<ScheduleJobLogEntity> {
	
}
