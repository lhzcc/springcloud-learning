package top.lhzcc.springcloud.dao;

import top.lhzcc.springcloud.entities.PayMent;

/**
 * @Author: yaunlh
 * @Date: 2020/7/27 9:52
 * @Version 1.0
 */
public interface PaymentDao {

    /**
     * 创建支付
     * @param payMent
     * @return
     */
    Long create(PayMent payMent);

    /**
     * 查询支付
     * @param id
     * @return
     */
    PayMent queryPayment(Long id);

}
