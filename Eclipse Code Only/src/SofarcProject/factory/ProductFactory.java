package factory;

import composite.*;
import controller.*;

public interface ProductFactory {

  public Product createProduct(ProductTypeEnum productTypeEnum);

}