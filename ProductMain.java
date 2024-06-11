package less1.practice;

import less1.practice.impl.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProductMain {

    public static void main(String[] args) {
        Product bottle1 = new BottleOfWater("Родники", 55, LocalDate.of(2024, 5, 1));

        Product bottle2 = new BottleOfWater("Родники Газированная", 55, LocalDate.of(2024, 5, 1),
                true, EPackage.GLASS.getMaterial(), 0.5F);

        VendingMachine vm = new WaterVendingMachine();

        VendingMachine vm1 = new HotDrinkVM();

        System.out.println(vm.getProducts());

        vm.addProducts(List.of(bottle1, bottle1, bottle1, bottle2, bottle2, bottle2));

        vm1.addProducts(new ArrayList<>());

        System.out.println(vm.getProducts());

        vm.getProduct("Родники");

        System.out.println(vm.getProducts());

        //Работа с горячими напитками

        Product drink1 = new HotDrink("Американо",70,LocalDate.now(), 0.2F,70);
        Product drink2 = new HotDrink("Капучино",110,LocalDate.now(), 0.3F,70);
        Product drink3 = new HotDrink("Латте",110,LocalDate.now(), 0.3F,70);
        Product drink4 = new HotDrink("Раф",150,LocalDate.now(), 0.3F,70);

        vm1.addProducts(List.of(drink1,drink1,drink2,drink3,drink4));
        System.out.println(vm1.getProducts());
        System.out.println("Удаление продукта Латте");
        vm1.getProduct("Латте");
        System.out.println(vm1.getProducts());


    }
}
