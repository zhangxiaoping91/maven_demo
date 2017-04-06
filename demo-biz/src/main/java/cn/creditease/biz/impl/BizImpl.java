package cn.creditease.biz.impl;

import cn.creditease.biz.IBiz;
import cn.creditease.constant.BizCode;
import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author ：xiaopingzhang8@creditease.cn
 * @Description ：业务实现类
 * @ClassName ：BizImpl
 * @date ：2017/3/1 10:33
 */
public class BizImpl implements IBiz {
    private final Logger logger = LoggerFactory.getLogger(BizImpl.class);

    public void bizService() {
        logger.info("执行业务代码");
        logger.info("交易结果{}", JSON.toJSON(BizCode.BizStatus.STATUS_OK));
    }
}
