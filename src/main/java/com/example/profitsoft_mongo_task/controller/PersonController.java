package com.example.profitsoft_mongo_task.controller;

import com.example.profitsoft_mongo_task.data.PepStatistic;
import com.example.profitsoft_mongo_task.dto.PersonDto;
import com.example.profitsoft_mongo_task.service.implementations.PersonServiceImpl;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * Controller for interaction with mongodb
 * which consist pep database with peps collection
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/pep")
public class PersonController {
    private final PersonServiceImpl service;

    @GetMapping("/statistic")
    public List<PepStatistic> getStatistic() {
      return service.getStatistic();
    }

    @GetMapping("/search")
    public PersonDto search(@RequestParam(value = "fullName") String fullName) {
      return service.search(fullName);
    }

    @PostMapping("/upload")
    public void upload(@RequestParam("file")MultipartFile file) {
      service.upload(file);
    }
}
