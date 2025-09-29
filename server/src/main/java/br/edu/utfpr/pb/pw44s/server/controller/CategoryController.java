package br.edu.utfpr.pb.pw44s.server.controller;
//

import br.edu.utfpr.pb.pw44s.server.dto.CategoryDTO;
import br.edu.utfpr.pb.pw44s.server.model.Category;
import br.edu.utfpr.pb.pw44s.server.service.ICategoryService;
import br.edu.utfpr.pb.pw44s.server.service.ICrudService;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("categories")
public class CategoryController extends CrudController<Category, CategoryDTO, Long> {
    private final ICategoryService categoryService;
    private final ModelMapper modelMapper;

    public CategoryController(ICategoryService categoryService, ModelMapper modelMapper) {
        super(Category.class, CategoryDTO.class);
        this.categoryService = categoryService;
        this.modelMapper = modelMapper;
    }

    @Override
    protected ICrudService<Category, Long> getService() {
        return this.categoryService;
    }

    @Override
    protected ModelMapper getModelMapper() {
        return this.modelMapper;
    }

    @GetMapping
    public ResponseEntity<List<CategoryDTO>> getAll() {
        List<CategoryDTO> dtos = categoryService.findAll().stream()
            .map(category -> modelMapper.map(category, CategoryDTO.class))
            .collect(Collectors.toList());
        return ResponseEntity.ok(dtos);
    }

}
//import br.edu.utfpr.pb.pw44s.server.dto.CategoryDTO;
//import br.edu.utfpr.pb.pw44s.server.model.Category;
//import br.edu.utfpr.pb.pw44s.server.service.ICategoryService;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Sort;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
//
//import java.net.URI;
//import java.util.List;
//@RestController
//@RequestMapping("categories")
//public class CategoryController {
//    private final ICategoryService categoryService;
//
//    public CategoryController(ICategoryService categoryService) {
//        this.categoryService = categoryService;
//    }
//
//    @PostMapping
//    public ResponseEntity<Category> save(@RequestBody CategoryDTO categoryDto) {
//        Category category = categoryDto.convertToEntity();
//        categoryService.save(category);
//        URI location = ServletUriComponentsBuilder
//                .fromCurrentRequest().path("/{id}")
//                .buildAndExpand(category.getId()).toUri();
//        return ResponseEntity.created(location).body(category);
//    }
//
//    @GetMapping
//    public ResponseEntity<List<Category>> getAll(){
//        return ResponseEntity.ok(categoryService.findAll());
//    }
//
//    @GetMapping("page")
//    public ResponseEntity<Page<Category>> findAll(
//            @RequestParam int page,
//            @RequestParam int size,
//            @RequestParam(required = false) String order,
//            @RequestParam(required = false) Boolean asc) {
//        PageRequest pageRequest = PageRequest.of(page, size);
//        if (order != null && asc != null) {
//            pageRequest = PageRequest.of(page,
//                    size,
//                    asc ? Sort.Direction.ASC : Sort.Direction.DESC,
//                    order);
//        }
//        return ResponseEntity.ok(this.categoryService.findAll(pageRequest));
//    }
//
//
//    @GetMapping("{id}")
//    public ResponseEntity<Category> findById(@PathVariable Long id){
//        Category category = this.categoryService.findById(id);
//        if(category == null){
//            return ResponseEntity.noContent().build();
//        }
//    return ResponseEntity.ok(this.categoryService.findById(id));
//    }
//
//    @DeleteMapping("{id}")
//    @ResponseStatus
//    public void delete(@PathVariable Long id){
//        this.categoryService.deleteById(id);
//
//    }
//}
