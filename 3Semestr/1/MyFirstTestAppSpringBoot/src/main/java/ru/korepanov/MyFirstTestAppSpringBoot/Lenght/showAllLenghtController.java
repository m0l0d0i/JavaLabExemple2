package ru.korepanov.MyFirstTestAppSpringBoot.Lenght;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.korepanov.MyFirstTestAppSpringBoot.ArrayList.ArrayListController;
import ru.korepanov.MyFirstTestAppSpringBoot.HashMap.HashMapController;

@RestController
public class showAllLenghtController {
    String hashMapSize;
    String arrayListSize;
    String printSize;

    @GetMapping("/show-all-lenght")
    public String showAllLenght() {
        HashMapController hashMapController = new HashMapController();
        hashMapSize = String.valueOf(hashMapController.sizehashMap());

        ArrayListController arrayListController = new ArrayListController();
        arrayListSize = String.valueOf(arrayListController.sizeArrayList());

        printSize = "hashMapSize:\t"+hashMapSize + " arrayListSize:\t" + arrayListSize;

        return printSize;
    }
}
