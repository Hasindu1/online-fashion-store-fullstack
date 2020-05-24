package com.programmingfoundation.onlinefashionstore.controllers;

import com.programmingfoundation.onlinefashionstore.dto.PaymentDTO;
import com.programmingfoundation.onlinefashionstore.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/paymenets-api")
@RestController
public class PaymentRestController {
    @Autowired
    private PaymentService paymentService;
    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/payments")
    public PaymentDTO savePayamnetDTO(@RequestBody PaymentDTO paymentDTO){

       paymentService.savePaymentDTO(paymentDTO);

        return paymentDTO;


    }
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/payments/{id}")
    public PaymentDTO findById(@PathVariable String id){
        if(paymentService.findPaymnetDTOById(id) != null){
            return paymentService.findPaymnetDTOById(id);
        }
        else{
            throw new RuntimeException("Payment id not found " + id);
        }
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/userPayments/{id}")
    public List<PaymentDTO> getAllUserPayments(@PathVariable String id){

        return (paymentService.findAllUserPayments(id));
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @DeleteMapping("/payments/{id}")
    public String DeletePaymentDTOById(@PathVariable String id){
        if(paymentService.findPaymnetDTOById(id) != null){
            paymentService.deletePaymentDTOById(id);
            return "Payment id: " + id + "Successfully deleted " ;
        }
        else{
            return  "Payment not available ";
        }
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @PutMapping("/payments")
    public PaymentDTO updateProductDTO(@RequestBody PaymentDTO paymentDTO){
        paymentService.savePaymentDTO(paymentDTO);
        return paymentDTO;
    }
}
