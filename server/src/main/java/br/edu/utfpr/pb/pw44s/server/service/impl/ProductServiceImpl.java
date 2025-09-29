package br.edu.utfpr.pb.pw44s.server.service.impl;

import br.edu.utfpr.pb.pw44s.server.model.Product;
import br.edu.utfpr.pb.pw44s.server.repository.ProductRepository;
import br.edu.utfpr.pb.pw44s.server.service.IProductService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl extends CrudServiceImpl<Product, Long> implements IProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    protected JpaRepository<Product, Long> getRepository() {
        return productRepository;
    }


    @Override
    public List<Product> findAllByCategoryId(Long categoryId) {
        return this.productRepository.findAllByCategoryId(categoryId);
    }
}





//package br.edu.utfpr.pb.pw44s.server.service.Impl;
//import br.edu.utfpr.pb.pw44s.server.model.Product;
//import br.edu.utfpr.pb.pw44s.server.repository.ProductRepository;
//import br.edu.utfpr.pb.pw44s.server.service.IProductService;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//
//@Service
//public class ProductServiceImpl implements IProductService {
//
//    private final ProductRepository productRepository;
//
//    public ProductServiceImpl(ProductRepository productRepository) {
//        this.productRepository = productRepository;
//    }
//
//    @Override
//    @Transactional(readOnly = true)
//    public List<Product> findAll() {
//        return this.productRepository.findAll();
//    }
//
//    @Override
//    public Page<Product> findAll(Pageable pageable) {
//
//        return this.productRepository.findAll(pageable);
//    }
//
//    @Override
//    public Product save(Product product) {
//
//        return this.productRepository.save(product);
//    }
//
//    @Override
//    public Product findById(Long id)
//    {
//        return this.productRepository.findById(id).orElse(null);
//    }
//
//    @Override
//    public void deleteById(Long id) {
//
//        this.productRepository.deleteById(id);
//    }
//
//    @Override
//    public boolean existsById(Long id) {
//
//        return this.productRepository.existsById(id);
//    }
//
//    @Override
//    public long count() {
//
//        return this.productRepository.count();
//    }
//
//    @Override
//    public List<Product> findAllByCategoryId(Long categoryId) {
//        return this.productRepository.findAllByCategoryId(categoryId);
//    }
//
//}
