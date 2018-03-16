package com.mmtap.bbf.modules.job.dao;

import com.mmtap.bbf.modules.job.entity.ScheduleJobLogEntity;
import com.mmtap.bbf.modules.sys.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;

/**
 * 定时任务日志
 *
 * @author mmtap.com
 * @email java_khan@126.com
 * @date 2018-03-15 10:45
 */
@Mapper
public interface ScheduleJobLogDao extends BaseDao<ScheduleJobLogEntity> {
	
}
