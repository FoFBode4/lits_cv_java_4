package edu.lits.testapi.service;

import edu.lits.testapi.pojo.Resume;
import edu.lits.testapi.repository.ResumeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ResumeServiceImpl implements ResumeService {
    @Autowired
    private ResumeRepository resumeRepository;

    @Override
    public Resume readByID(Long id) {
       Resume resume =  resumeRepository.getOne(1L);
       return resume;
    }
}
