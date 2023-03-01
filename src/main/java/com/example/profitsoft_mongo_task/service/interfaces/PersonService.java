package com.example.profitsoft_mongo_task.service.interfaces;

import com.example.profitsoft_mongo_task.data.PepStatistic;
import com.example.profitsoft_mongo_task.dto.PersonDto;
import java.util.List;
import org.springframework.web.multipart.MultipartFile;

public interface PersonService {
    void upload(MultipartFile file);
    List<PepStatistic> getStatistic();
    PersonDto search(String fullName);
}
