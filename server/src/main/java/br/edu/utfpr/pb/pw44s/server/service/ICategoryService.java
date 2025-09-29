//package br.edu.utfpr.pb.pw44s.server.Service;
//
//
//import br.edu.utfpr.pb.pw44s.server.Model.Category;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//
//import java.util.List;
//
//
//    public interface ICategoryService{
//        List<Category> findAll();
//        Page<Category> findAll(Pageable pageable);
//        Category save(Category category);
//        Category findById(Long id);
//        void deleteById(Long id);
//        boolean existsById(Long id);
//        long count();
//    }

package br.edu.utfpr.pb.pw44s.server.service;

import br.edu.utfpr.pb.pw44s.server.model.Category;

public interface ICategoryService extends ICrudService<Category, Long> {
}



