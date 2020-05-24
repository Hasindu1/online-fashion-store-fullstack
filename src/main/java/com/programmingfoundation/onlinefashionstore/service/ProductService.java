package com.programmingfoundation.onlinefashionstore.service;

import com.programmingfoundation.onlinefashionstore.dto.ProductDTO;

import java.util.List;

public interface ProductService  {
    public List<ProductDTO> findAll();
    public void saveProductDTO(ProductDTO productDTO);
    public ProductDTO findProductDTOById(String id);
    public void deleteProductDTOById(String id);
}
