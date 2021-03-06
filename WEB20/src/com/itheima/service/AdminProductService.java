package com.itheima.service;

import java.sql.SQLException;
import java.util.List;

import com.itheima.dao.AdminProductDao;
import com.itheima.domain.Category;
import com.itheima.domain.Product;

public class AdminProductService {

	// 查询所有到商品
	public List<Product> findAllProduct() throws SQLException {
		// 没有复杂业务，直接传递请求到dao层
		AdminProductDao dao = new AdminProductDao();
		// 如果有事务控制，那么直接在这里进行try catch
		// 否则，将异常抛出到web，进行处理，进行相应页面展示。
		List<Product> productList = dao.findAllProduct();
		
		return productList;
	}
	//获得所有的类别
	public List<Category> findAllCategory() throws SQLException {
		AdminProductDao dao = new AdminProductDao();
		List<Category> categoryList = dao.findAllCategory();
		return categoryList;
	}
	//添加数据
	public void addProduct(Product product) throws SQLException {
		AdminProductDao dao = new AdminProductDao();
		dao.addProduct(product);
	}
	// 根据pid删除商品
	public void delProductByPid(String pid) throws SQLException {
		AdminProductDao dao = new AdminProductDao();
		dao.delProductByPid(pid);
	}
	// 根据pid查询商品对象
	public Product findProductByPid(String pid) throws SQLException {
		AdminProductDao dao = new AdminProductDao();
		Product product = dao.findProductByPid(pid);
		return product;
	}
	//更新商品
	public void updateProduct(Product product) throws SQLException {
		AdminProductDao dao = new AdminProductDao();
		dao.updateProduct(product);		
	}

}
