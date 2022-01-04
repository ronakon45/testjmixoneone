package com.company.testjmixoneoneone.entity.product;

import io.jmix.ui.screen.*;
import com.company.testjmixoneoneone.entity.Product;

@UiController("triple1_Product.edit")
@UiDescriptor("product-edit.xml")
@EditedEntityContainer("productDc")
public class ProductEdit extends StandardEditor<Product> {
}