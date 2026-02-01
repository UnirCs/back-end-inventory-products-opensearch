package com.unir.products.data;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import com.unir.products.data.model.Product;

public interface ProductRepository extends ElasticsearchRepository<Product, String> {

    List<Product> findByName(String name);
}
