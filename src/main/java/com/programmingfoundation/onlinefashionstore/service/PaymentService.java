package com.programmingfoundation.onlinefashionstore.service;

import com.programmingfoundation.onlinefashionstore.dto.PaymentDTO;

import java.util.List;

public interface PaymentService {
    public void savePaymentDTO(PaymentDTO paymentDTO);
    public PaymentDTO findPaymnetDTOById(String id);
    public List<PaymentDTO> findAllUserPayments(String id);
    public void deletePaymentDTOById(String id);

}
