//package br.edu.utfpr.pb.pw44s.server.service;
//
//import br.edu.utfpr.pb.pw44s.server.model.Product;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//
//import java.util.List;
//
//public interface IProductService {
//    List<Product> findAll();
//    Page<Product> findAll(Pageable pageable);
//    Product save(Product product);
//    Product findById(Long id);
//    void deleteById(Long id);
//    boolean existsById(Long id);
//    long count();
//    List<Product> findAllByCategoryId(Long categoryId);}
package br.edu.utfpr.pb.pw44s.server.service;

import br.edu.utfpr.pb.pw44s.server.model.Product;
import java.util.List;

public interface IProductService extends ICrudService<Product, Long> {

    List<Product> findAllByCategoryId(Long categoryId);

}
