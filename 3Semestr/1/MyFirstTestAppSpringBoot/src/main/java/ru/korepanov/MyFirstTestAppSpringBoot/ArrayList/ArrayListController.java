package ru.korepanov.MyFirstTestAppSpringBoot.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

@RestController
public class ArrayListController {
    // Создание ArrayList
    private static ArrayList<String> list = new ArrayList<>();

    // Переменная для хранения значения рзамера ArrayList
    private static int listSize;

    // Метод, который принимает значение и добавляет его в ArrayList
    @GetMapping("/update-array")
    public String updateArrayList(@RequestParam(value = "value") String value) {
        list.add(value);

        return String.format("Success: %s", value);
    }

    // Метод, который возвращает все элементы добавленные в ArrayList
    @GetMapping("/show-array")
    public String showArrayList() {
        if (list.isEmpty()){
            return "No data";
        }

        return String.format("arrayList: %s", list.toString());
    }

    // Метод для получения размера ArrayList
    public final int sizeArrayList(){
        listSize = list.size();
        return listSize;
    }
}
