package com.codeGao.springcloud.service;

import com.codeGao.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author huanyu
 * @date 2020/12/2 10:56
 */

public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}