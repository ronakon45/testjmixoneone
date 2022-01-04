package com.company.testjmixoneoneone.entity.product;

import io.jmix.ui.screen.*;
import com.company.testjmixoneoneone.entity.Product;

@UiController("triple1_Product.browse")
@UiDescriptor("product-browse.xml")
@LookupComponent("productsTable")
public class ProductBrowse extends StandardLookup<Product> {
}