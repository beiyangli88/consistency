package com.beiyang.consistency.custom.alerter;

import com.beiyang.consistency.model.ConsistencyTaskInstance;

/**
 * 一致性框架告警接口
 * 具体告警通知动作由业务服务实现
 *
 * @author beiyangli88
 **/
public interface ConsistencyFrameworkAlerter {

    /**
     * 发送告警通知
     * 用户拿到告警实例通知给对应的人，在该方法中实现即可
     *
     * @param consistencyTaskInstance 发送告警通知
     */
    void sendAlertNotice(ConsistencyTaskInstance consistencyTaskInstance);

}
