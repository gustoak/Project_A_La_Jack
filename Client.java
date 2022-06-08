import dto.ProductDTO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.IOException;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        String path = "c:\\xls\\info.txt";

        List<ProductDTO> listProdDTO = new ArrayList<ProductDTO>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            line = br.readLine();
            while (line != null) {

                String[] vect = line.split(",");
                String brand = vect[0];
                String name = vect[1];
                String description = vect[2];
                Integer price = Integer.parseInt(vect[3]);



                ProductDTO callingProd = new ProductDTO();
                callingProd.setBrand(brand);
                callingProd.setName(name);
                callingProd.setDescription(description);
                callingProd.setPrice(price);

                listProdDTO.add(callingProd);

                line = br.readLine();
            }

            System.out.println("PRODUCTS:");
            for (ProductDTO p : listProdDTO) {
                System.out.println(p);
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
