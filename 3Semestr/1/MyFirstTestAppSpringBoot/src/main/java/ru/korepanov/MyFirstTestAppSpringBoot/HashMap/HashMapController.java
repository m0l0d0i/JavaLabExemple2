package ru.korepanov.MyFirstTestAppSpringBoot.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class HashMapController {
    // Создание HashMap
    private static HashMap<String, String> values = new HashMap<>();
    // Переменная для хранения значения рзамера HashMap
    private static int hashMapSize;

    // Метод, который принимает значение и добавляет его в HashMap
    @GetMapping("/update-map")
    public String updateHashMap(@RequestParam(value = "value") String value) {
        values.put(value, value);

        return String.format("Success: %s", value);
    }

    // Метод, который возвращает все элементы добавленные в HashMap
    @GetMapping("/show-map")
    public String showHashMap() {
        if (values.isEmpty()){
            return "No data";
        }

        return String.format("hashMap: %s", values);
    }

    // Метод для получения размера HashMap
    public final int sizehashMap(){
        hashMapSize = values.size();
        return hashMapSize;
    }
}
