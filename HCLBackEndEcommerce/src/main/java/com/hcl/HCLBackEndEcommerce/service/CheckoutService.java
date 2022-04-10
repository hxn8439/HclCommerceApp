package com.hcl.HCLBackEndEcommerce.service;

import com.hcl.HCLBackEndEcommerce.dto.Purchase;
import com.hcl.HCLBackEndEcommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
