package service;

import dto.ProductDTO;
import model.Product;

public class ProductServiceImpl implements ProductService{

    @Override
    public ProductDTO createProduto(ProductDTO request) {

        Product product = new Product();
        product.setBrand(request.getBrand());
        product.setDescription(request.getDescription());
        product.setName(request.getName());
        product.setPrice(request.getPrice());

        ProductDTO response = new ProductDTO();

        response.setBrand(product.getBrand());
        response.setDescription(product.getDescription());
        response.setName(product.getName());
        response.setPrice(product.getPrice());


        return response;
    }
}
