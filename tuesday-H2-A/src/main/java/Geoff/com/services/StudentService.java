package Geoff.com.services;

import Geoff.com.models.Student;
import Geoff.com.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    StudentRepository repo;

    public List<Student> allRecords(){
        return repo.findAll();
    }

    public String deleteRecord(int regno){
        repo.deleteById(regno);
        return "Record Deleted Successfully";
    }

    public String saveRecord(Student sturec){
        repo.save(sturec);
//        Student ref=new Student();
//
//        ref.setRegno(303);
//        ref.setName("Geoff");
//        ref.setMarks(87);
//
//        repo.save(ref);
//
//        ref.setRegno(304);
//        ref.setName("Oz");
//        ref.setMarks(37);
//
//        repo.save(ref);
//
//        ref.setRegno(305);
//        ref.setName("Glenn");
//        ref.setMarks(110);
//
//        repo.save(ref);

        return "New Record Saved";
    }

    public Student showOneRecord(int regno){
        Student stu=null;
        Optional<Student> optionalAddress = repo.findById(regno);
        if (optionalAddress.isPresent()) {

            stu = optionalAddress.get();
            return stu;
        }else{
            return stu;
        }
    }
}
