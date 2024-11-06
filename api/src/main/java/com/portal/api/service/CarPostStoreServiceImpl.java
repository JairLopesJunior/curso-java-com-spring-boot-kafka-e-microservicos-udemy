package com.portal.api.service;

import com.portal.api.client.CarPostStoreClient;
import com.portal.api.dto.CarPostDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarPostStoreServiceImpl implements CarPostStoreService {

    @Autowired
    private CarPostStoreClient carPostStoreClient;

    @Override
    public List<CarPostDTO> getCarForSales() {
        return this.carPostStoreClient.carForSaleClient();
    }

    @Override
    public void changeCarForSale(CarPostDTO dto, String id) {
        this.carPostStoreClient.changeCarForSaleClient(dto, id);
    }

    @Override
    public void removeCarForSale(String id) {
        this.carPostStoreClient.deleteCarForSaleClient(id);
    }
}















