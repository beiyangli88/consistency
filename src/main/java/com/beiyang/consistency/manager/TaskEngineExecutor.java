package com.beiyang.consistency.manager;

import com.beiyang.consistency.model.ConsistencyTaskInstance;

/**
 * 任务执行引擎接口
 *
 * @author beiyangli88
 **/
public interface TaskEngineExecutor {

    /**
     * 执行指定的任务实例
     *
     * @param taskInstance 任务实例信息
     */
    void executeTaskInstance(ConsistencyTaskInstance taskInstance);

    /**
     * 当执行任务失败的时候，执行该逻辑
     *
     * @param taskInstance 任务实例
     */
    void fallbackExecuteTask(ConsistencyTaskInstance taskInstance);

}
