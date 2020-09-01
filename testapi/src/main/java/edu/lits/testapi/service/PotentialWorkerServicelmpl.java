package edu.lits.testapi.service;
import edu.lits.testapi.pojo.Card;
import edu.lits.testapi.pojo.PotentialWorker;
import edu.lits.testapi.pojo.Resume;
import edu.lits.testapi.repository.CardRepository;
import edu.lits.testapi.repository.PotentialWorkerRepository;
import edu.lits.testapi.repository.ResumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service
public class PotentialWorkerServicelmpl implements PotentialWorkerService {
    @Autowired
    private PotentialWorkerRepository potentialWorkerRepository;

    @Override
    public PotentialWorker readByID(Long user_id) {
        Optional<PotentialWorker> potentialWorker =  potentialWorkerRepository.findById(1L);
        return potentialWorker.get();
    }
}
