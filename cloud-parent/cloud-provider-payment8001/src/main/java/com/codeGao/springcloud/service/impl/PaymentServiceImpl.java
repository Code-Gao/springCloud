package com.codeGao.springcloud.service.impl;

import com.codeGao.springcloud.dao.PaymentDao;
import com.codeGao.springcloud.entities.Payment;
import com.codeGao.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author huanyu
 * @date 2020/12/2 10:58
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }

}
