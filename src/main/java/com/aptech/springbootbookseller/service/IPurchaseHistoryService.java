package com.aptech.springbootbookseller.service;

import com.aptech.springbootbookseller.model.PurchaseHistory;
import com.aptech.springbootbookseller.repository.projection.IPurchaseItem;

import java.util.List;

public interface IPurchaseHistoryService
{
    PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory);

    List<IPurchaseItem> findPurchasedItemsOfUser(Long userId);
}
