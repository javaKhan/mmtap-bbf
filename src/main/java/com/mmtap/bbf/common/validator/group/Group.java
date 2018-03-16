package com.mmtap.bbf.common.validator.group;

import javax.validation.GroupSequence;

/**
 * 定义校验顺序，如果AddGroup组失败，则UpdateGroup组不会再校验
 * @author mmtap.com
 * @email java_khan@126.com
 * @date 2018-03-15 10:45
 */
@GroupSequence({AddGroup.class, UpdateGroup.class})
public interface Group {

}
