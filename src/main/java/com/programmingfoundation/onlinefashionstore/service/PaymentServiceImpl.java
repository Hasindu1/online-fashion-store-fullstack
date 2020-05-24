package com.programmingfoundation.onlinefashionstore.service;

import com.programmingfoundation.onlinefashionstore.dao.PaymentDAO;
import com.programmingfoundation.onlinefashionstore.dto.PaymentDTO;
import com.programmingfoundation.onlinefashionstore.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentDAO paymentDAO;
    @Override
    public void savePaymentDTO(PaymentDTO paymentDTO) {
        paymentDAO.save(new Payment(paymentDTO.getId(),paymentDTO.getUser_id(),paymentDTO.getTotal(),paymentDTO.getPaymentType(),paymentDTO.getAddress(),paymentDTO.getDate(),paymentDTO.getOrder()));

    }

    @Override
    public PaymentDTO findPaymnetDTOById(String id) {
        Optional<Payment> tempPaymnet = paymentDAO.findById(id);
        return new PaymentDTO(tempPaymnet.get().getId(),tempPaymnet.get().getUser_id(),tempPaymnet.get().getTotal(),tempPaymnet.get().getPaymentType(),tempPaymnet.get().getAddress(),tempPaymnet.get().getDate(),tempPaymnet.get().getOrder());
    }

    @Override
    public List<PaymentDTO> findAllUserPayments(String id) {
        List<Payment>tempPaymentList = paymentDAO.findAll();
        List<PaymentDTO> tempPaymentDTOList = new ArrayList<PaymentDTO>();
        for(Payment tempPaymnet : tempPaymentList){
            tempPaymentDTOList.add(new PaymentDTO(tempPaymnet.getId(),tempPaymnet.getUser_id(),tempPaymnet.getTotal(),tempPaymnet.getPaymentType(),tempPaymnet.getAddress(),tempPaymnet.getDate(),tempPaymnet.getOrder()));

        }
        List<PaymentDTO> AllUserPayment = new ArrayList<PaymentDTO>();
        for(PaymentDTO tempPaymentDTO:tempPaymentDTOList){
            if(tempPaymentDTO.getUser_id().equals(id)){
                tempPaymentDTOList.add(tempPaymentDTO);
            }
        }

        return tempPaymentDTOList;
    }

    @Override
    public void deletePaymentDTOById(String id) {
        paymentDAO.deleteById(id);
    }
}
