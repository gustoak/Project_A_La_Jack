package service;

import dto.InventoryDTO;
import model.Inventory;

public class InventoryServiceImpl implements InventoryService {
    @Override
    public InventoryDTO createIventory(InventoryDTO resquest) {

        Inventory inventory = new Inventory();
        inventory.setProducts(resquest.getProducts());
        inventory.setQuantity(resquest.getQuantity());

        InventoryDTO response = new InventoryDTO();
        response.setProducts(inventory.getProducts());
        response.setQuantity(inventory.getQuantity());


        return response;
    }
}
