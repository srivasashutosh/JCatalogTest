/*package catalog.model.dao.hibernate;

import junit.framework.TestCase;

import org.junit.Test;
import catalog.model.businessobject.Product;
import catalog.model.exception.CatalogException;
import catalog.model.service.impl.CachedCatalogServiceImpl;
import catalog.view.bean.ProductBean;
import catalog.view.builder.ProductBuilder;

public class Test1 extends TestCase{
	
	@Test
	public void testcreateProductBean()
	{
		Product product = new Product();
		
		try {
			ProductBean bean=ProductBuilder.createProductBean(product);
			if(bean!=null)
			{
				assertTrue(true);
			}
		} catch (CatalogException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testSaveProducts() 
	{
		Product prod = new Product();
		prod.setId("L0012");
		prod.setName("myProd");
		CachedCatalogServiceImpl obj;
		Product p=null;
		try {
			obj = new CachedCatalogServiceImpl();
			 p=obj.saveProduct(prod);
		} catch (CatalogException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(p!=null)
		{
			assertTrue(true);
		}
	}*/
	
	/*@Test
	public void testgetCategory()
	{
		CatalogDaoHibernateImpl obj = new CatalogDaoHibernateImpl();
		String id="L001"; 
		Category cat=obj.getCategory(id);
		if(cat!=null)
		{
			assertTrue(true);
		}
	}

}
*/