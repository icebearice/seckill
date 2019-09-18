package com.seckill.project.service;

import com.seckill.project.error.BusinessException;
import com.seckill.project.service.model.OrderModel;

public interface OrderService {
    OrderModel createOrder(Integer userId, Integer itemId, Integer amount) throws BusinessException;
}
