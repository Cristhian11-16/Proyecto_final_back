package proy.arq.springrestapi.controller;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.http.HttpHeaders;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import jakarta.annotation.Resource;
import proy.arq.springrestapi.model.Product;
import proy.arq.springrestapi.service.IUploadFileService;
import proy.arq.springrestapi.service.ProductService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@RestController
@CrossOrigin
public class ProductController {

	@Autowired
	private ProductService eService;
	
	@Autowired
	private IUploadFileService uploadFileService;
	
	@GetMapping("/product")
	public List<Product> getProducts() {
		return eService.getProduct();
	}

	@GetMapping("/product/{id}")
	public Product getProduct(@PathVariable("id") Long id) {
		return eService.getSingleProduct(id);
	}
	
	@GetMapping("/product/search")
	public List<Product> search(@RequestParam("word") String word) {
		return eService.searchProduct(word);
	}
	
	@PostMapping("/product")
	public Product saveProduct(@RequestBody Product product){
		return eService.saveProduct(product);
	}
	
	
	
	@PutMapping("/product/{id}")
	public Product updateProduct(@PathVariable Long id, @RequestBody Product product) {
		product.setProduct_id(id);
		return eService.saveProduct(product);
	}
	
	
	@DeleteMapping("/product")
	public void deleteProduct(@RequestParam("id") Long id) {
		eService.deleteProduct(id);
	}
	
//	@DeleteMapping("/product/{id}")
//	public Map<String, Boolean> deleteProducto(@PathVariable Long id){
//		Product product = ProductRepository.findById(id).r
//	}
	
	
}
