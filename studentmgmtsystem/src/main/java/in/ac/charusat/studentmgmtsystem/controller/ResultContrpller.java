package in.ac.charusat.studentmgmtsystem.controller;

import in.ac.charusat.studentmgmtsystem.model.Course;
import in.ac.charusat.studentmgmtsystem.model.Result;
import in.ac.charusat.studentmgmtsystem.repository.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ResultContrpller {
    @Autowired
    ResultRepository resultRepository;
    @GetMapping("/listResult")
    public List<Result> getAllResult(){
        return resultRepository.findAll();
    }

    @GetMapping("/Result/{id}")
    public Result getCourse(@PathVariable Integer id)
    {
        return resultRepository.findById(id).get();
    }
    @DeleteMapping("/Result/{id}")
    public List<Result> deleteResult(@PathVariable Integer id) {
        resultRepository.delete(resultRepository.findById(id).get());
        return resultRepository.findAll();
    }
    @PostMapping("/Result")
    public List<Result> addResult(@RequestBody Result result) {
        resultRepository.save(result);
        return resultRepository.findAll();
    }

    // Update the student information
    @PutMapping("/Result/{id}")
    public List<Result> updateResult(@RequestBody Result result, @PathVariable Integer id) {
        Result resultObj = resultRepository.findById(id).get();
        resultObj.setSemester(result.getSemester());
        resultObj.setPersentage(result.getPersentage());
        Object ResultObj;
        resultRepository.save(resultObj);
        return resultRepository.findAll();
    }
}
