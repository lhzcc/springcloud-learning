package top.lhzcc.springcloud.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.lhzcc.springcloud.dao.PaymentDao;
import top.lhzcc.springcloud.entities.PayMent;
import top.lhzcc.springcloud.service.PaymentService;

/**
 * @Author: yaunlh
 * @Date: 2020/7/27 9:40
 * @Version 1.0
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    @Override
    public Long create(PayMent payMent) {
        return paymentDao.create(payMent);
    }

    @Override
    public PayMent queryPayment(Long id) {
        return paymentDao.queryPayment(id);
    }
}
