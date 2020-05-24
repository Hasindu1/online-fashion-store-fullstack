package com.programmingfoundation.onlinefashionstore.service;

import com.programmingfoundation.onlinefashionstore.dao.ProductDAO;
import com.programmingfoundation.onlinefashionstore.dto.ProductDTO;
import com.programmingfoundation.onlinefashionstore.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDAO productDAO;

    @Override
    public List<ProductDTO> findAll() {

         List<Product>tempProductList = productDAO.findAll();
         List<ProductDTO> tempProductDTOList = new ArrayList<ProductDTO>();
         for(Product tempProduct : tempProductList){
             tempProductDTOList.add(new ProductDTO(tempProduct.getId(),tempProduct.getTitle(),tempProduct.getImg(),tempProduct.getPrice(),tempProduct.getInfo(),tempProduct.getManufacturer(),tempProduct.getCategoryId(),false,false,0,0));

         }
         return tempProductDTOList;
    }

    @Override
    public void saveProductDTO(ProductDTO productDTO) {
              productDAO.save(new Product(productDTO.getId(),productDTO.getTitle(),productDTO.getImg(),productDTO.getPrice(),productDTO.getInfo(),productDTO.getManufacturer(),productDTO.getCategoryId()));
    }

    @Override
    public ProductDTO findProductDTOById(String id) {
       Optional<Product> tempProduct = productDAO.findById(id);
       return new ProductDTO(tempProduct.get().getId(),tempProduct.get().getTitle(),tempProduct.get().getImg(),tempProduct.get().getPrice(),tempProduct.get().getInfo(),tempProduct.get().getManufacturer(),tempProduct.get().getCategoryId(),false,false,0,0);


    }

    @Override
    public void deleteProductDTOById(String id) {
        productDAO.deleteById(id);


    }


}
