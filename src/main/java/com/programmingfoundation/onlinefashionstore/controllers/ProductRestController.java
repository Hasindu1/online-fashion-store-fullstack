package com.programmingfoundation.onlinefashionstore.controllers;

import com.programmingfoundation.onlinefashionstore.dto.ProductDTO;
import com.programmingfoundation.onlinefashionstore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductRestController {

    @Autowired
    private ProductService productService;
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/products")
    public List<ProductDTO> getAllproducts(){

        return (productService.findAll());
    }
    @PostMapping("/products")
    public ProductDTO saveProductDTO(@RequestBody ProductDTO productDTO){

             productService.saveProductDTO(productDTO);
             return productDTO;
    }
    @GetMapping("/products/{id}")
    public ProductDTO findById(@PathVariable String id){
            if(productService.findProductDTOById(id) != null){
                return productService.findProductDTOById(id);
            }
            else{
                throw new RuntimeException("Product id not found " + id);
            }
    }
    @DeleteMapping("/products/{id}")
    public String DeleteProductById(@PathVariable String id){
        if(productService.findProductDTOById(id) != null){
            productService.deleteProductDTOById(id);
            return "Product id: " + id + "Successfully deleted " ;
        }
        else{
            return  "Product not available ";
        }
    }
    @PutMapping("/products")
    public ProductDTO updateProductDTO(@RequestBody ProductDTO productDTO){
        productService.saveProductDTO(productDTO);
        return productDTO;
    }



}
